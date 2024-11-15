package 下半.day29_io流;

import java.io.*;
import java.util.*;

public class io_30_test2_2 {
    public static void main(String[] args) throws IOException {
        //将csb.txt中的内容进行排序
        //1.创建对象
        BufferedReader br = new BufferedReader(new FileReader("E:\\JavaProject1\\Myfile\\aaa\\csb.txt"));


        //2.得到文本中的内容
        String Line;
        //利用tree的特性自动排序，map集合的键值对进行后续操作
        TreeMap<Integer,String> tm = new TreeMap<>();
        while ((Line = br.readLine()) != null) {
            //先将循环后的结果进行切割
            //(\\.)中由于.是正则表达式的一个特殊字符，所以需要用\转义符进行转义，而且\也需要一个\进行转移  这里需要有两个\\才能代表一个字符串的.
            String[] arr = Line.split("\\.");
            //切割后由于集合的第一个是整数类型所以需要进行类型转换，第二个直接添加全部数据即可
            tm.put(Integer.parseInt(arr[0]),Line);
        }

        //3.释放资源
        br.close();

        //4.写出
        //创建对象
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        //遍历集合得到数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\JavaProject1\\Myfile\\aaa\\recsb1.txt"));
        for (Map.Entry<Integer, String> entry : entries) {
            String value = entry.getValue();
            bw.write(value);
            bw.newLine();
        }
        //5.释放资源
        bw.close();

    }
}
