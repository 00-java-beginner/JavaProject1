package 下半.day30_io综合练习;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class io_45_test1 {
    public static void main(String[] args) throws IOException {
        //需求：制造假数据，从网络上面爬取  io45-48
        //获取姓氏：https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0
        //获取男生名字：http://www.haoming8.cn/baobao/10881.html
        //获取女生名字：http://www.haoming8.cn/baobao/7641.html
        //1.定义变量记录网址
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        //2.爬取数据，把网络上的所有数据拼接成一个字符串
        String familyNameNetStr = webCrawler(familyNameNet);
        String boyNameNetStr = webCrawler(boyNameNet);
        String girlNameNetStr = webCrawler(girlNameNet);

        //3.通过正则表达式将需要的数据提取出来
        ArrayList<String> familyNameTempList = getData(familyNameNetStr, "([\\u4e00-\\u9fa5]{4})(，|。)", 1);
        ArrayList<String> boyNameNetStrTempList = getData(boyNameNetStr, "([\\u4e00-\\u9fa5]{2})(、|。)", 1);
        ArrayList<String> girlNameNetStrTempList = getData(girlNameNetStr, "(.. ){4}..", 0);

        //4.处理数据
            //1.处理姓氏：把每一个姓氏拆开放到一个新的集合当中
        ArrayList<String> familyNameList = new ArrayList<>();
        //遍历临时集合，等到所有数据
        for (String str : familyNameTempList) {
            //遍历字符串，得到单个字符数据
            for (int i = 0; i < str.length(); i++) {
                //将索引对应的数据转换成字符形式
                char c = str.charAt(i);
                //添加到新的集合当中，数据类型不一致需要添加一个空字符串
                familyNameList.add(c + "");
            }
        }

            //2.处理男生名字：去重
        ArrayList<String> boyNameNetStrList = new ArrayList<>();
        for (String str : boyNameNetStrTempList) {
            if (!boyNameNetStrList.contains(str)){
                boyNameNetStrList.add(str);
            }
        }


            //3.处理女生名字：根据空格进行切割
        ArrayList<String> girlNameNetStrList = new ArrayList<>();
        for (String str : girlNameNetStrTempList) {
            String[] arr = str.split(" ");
            girlNameNetStrList.addAll(Arrays.asList(arr));
        }

        //5.生成数据
        ArrayList<String> list = getInfos(familyNameList, boyNameNetStrList, girlNameNetStrList, 100, 100);
        Collections.shuffle(list);

        //6.写出数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("dest\\aaa\\a.txt"));
        for (String str : list) {
            bw.write(str);
            bw.newLine();
        }
        bw.close();
    }

    private static ArrayList<String> getInfos(ArrayList<String> familyNameList, ArrayList<String> boyNameNetStrList, ArrayList<String> girlNameNetStrList, int boyCount, int girlCount) {
        //1.生成男生不重复的名字
        HashSet<String> boyhs = new HashSet<>();
        //判断当前生成的数量是否满足要求
        while (true){
            if (boyhs.size() == boyCount){
                break;
            }
            //打乱集合中的数据
            Collections.shuffle(familyNameList);
            Collections.shuffle(boyNameNetStrList);
            //将打乱后的第一个索引添加到新的集合当中
            boyhs.add(familyNameList.get(0) + boyNameNetStrList.get(0));
        }

        //2.生成女生不重复的名字
        HashSet<String> girlhs = new HashSet<>();
        //判断当前生成的数量是否满足要求
        while (true){
            if (girlhs.size() == girlCount){
                break;
            }
            //打乱集合中的数据
            Collections.shuffle(familyNameList);
            Collections.shuffle(girlNameNetStrList);
            //将打乱后的第一个索引添加到新的集合当中
            girlhs.add(familyNameList.get(0) + girlNameNetStrList.get(0));
        }

        //3.生成男生的信息并添加到集合当中
        //格式：姓名（唯一）-性别-年龄
        //创建一个新的集合用来记录拼接后的最终数据
        ArrayList<String> list = new ArrayList<>();
        //创建一个随机数对象用来生成年龄
        Random r = new Random();
        for (String boyName : boyhs) {
            int age = r.nextInt(10) + 18;
            list.add(boyName + "-男生" + "-" + age);
        }

        //4.生成女生的信息并添加到集合当中
        for (String girlName : girlhs) {
            int age = r.nextInt(7) + 18;
            list.add(girlName + "-女生" + "-" + age);
        }

        return list;

    }

    //作用：根据正则表达式获取字符串中的数据
    //参数一：完整的字符串（数据源）
    //参数二：正则表达式
    //参数三：索引，用于获取对应组的数据
    private static ArrayList<String> getData(String str, String regex, int index) {
        //1.创建集合存放数据
        ArrayList<String> list = new ArrayList<>();
        //2.添加正则表达式的规则
        Pattern pattern = Pattern.compile(regex);
        //3.获取到对应的数据并添加到集合当中
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            list.add(matcher.group(index));
        }
        //4.返回数据
        return list;
    }

    //作用：爬取数据，把网络上的所有数据拼接成一个字符串
    //形参：网址
    //返回值：爬取到的所有数据
    public static String webCrawler(String net) throws IOException {
        //1.定义StringBuilder对象拼接爬取到的数据
        StringBuilder sb = new StringBuilder();
        //2.创建一个url对象
        URL url = new URL(net);
        //3.链接上这个网址
        URLConnection conn = url.openConnection();
        //4.读取数据
        //细节：这里要注意读取数据的时候可能会碰到中文，所以需要用转换流进行读取
        InputStreamReader isr = new InputStreamReader(conn.getInputStream(), Charset.forName("UTF-8"));
        int ch;
        while ((ch = isr.read()) != -1) {
            sb.append((char) ch);
        }
        //5.释放资源
        isr.close();
        //6.返回数据
        return sb.toString();
    }
}
