package 下半.day27_异常_file_综合练习.综合练习;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test6 {
    public static void main(String[] args) {
        //统计一个文件夹中的所有类型的文件个数
        File file = new File("E:\\JavaProject1\\src");
        HashMap<String, Integer> hm = getCount(file);
        System.out.println(hm);
    }
    //定义一个方法用来统计
    public static HashMap<String,Integer> getCount(File file){
        //1.定义集合用来统计
        HashMap<String,Integer> hm = new HashMap<>();
        //2.进入文件夹
        File[] files = file.listFiles();
        //遍历数组
        for (File f : files) {
            //3.进行判断,如果是文件则进行统计
            if (f.isFile()){
                //获取到文件全程
                String name = f.getName();
                //利用split方法获取到文件的后缀名
                String[] arr = name.split("\\.");
                //对分割后的arr数组长度进行判断，如果当前文件没有后缀名，那么长度是1不需要统计
                //只有当前文件有后缀名时才满足长度为2的条件进行统计
                if (arr.length >= 2){
                    //获取到数组最大索引位的后缀名
                    String endName = arr[arr.length - 1];
                    if (hm.containsKey(endName)){
                        //存在
                        //利用get方法获取到当前键所对应的值
                        int count = hm.get(endName);
                        //将值自增一次
                        count++;
                        //将自增后的值重新赋值给当前键
                        hm.put(endName,count);
                    }else {
                        //不存在
                        hm.put(endName,1);
                    }
                }
            }else {
                //4.如果是文件夹则递归
                //sonMap是子文件夹中的每一种文件的个数
                HashMap<String, Integer> sonMap = getCount(f);
                //5.遍历sonMap把里面的值累加到hm当中
                Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    String key = entry.getKey();
                    int value = entry.getValue();
                    //利用key去hm中进行判断
                    if (hm.containsKey(key)){
                        //存在
                        int count = hm.get(key);
                        count = count + value;
                        hm.put(key,count);
                    }else {
                        //不存在
                        hm.put(key,value);
                    }
                }

            }
        }
        return hm;
    }
}
