package 下半.day26_Stream流和方法引用;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        //单列集合获取stream
        ArrayList<String>list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","e");
        list.stream().forEach(s -> System.out.println(s));

        //双列集合获取stream
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("a",1);
        hm.put("b",2);
        hm.put("c",3);
        hm.put("d",4);
        hm.keySet().stream().forEach(s -> System.out.println(s));
        hm.entrySet().stream().forEach(s -> System.out.println(s));

        //数组获取stream
        int [] arr = {1,2,3,4,5};
        String [] arr1 = {"1","2","3"};
        Arrays.stream(arr).forEach(s -> System.out.println(s));
        Arrays.stream(arr1).forEach(s -> System.out.println(s));

        //零散数据获取stream
        Stream.of(1,2,3,4,5).forEach(s -> System.out.println(s));
    }
}
