package 下半.day26_Stream流和方法引用;

import java.util.ArrayList;
import java.util.Collections;

public class StreamDemo2 {
    public static void main(String[] args) {
        //单列集合
        ArrayList<String>list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","e");
        list.stream().forEach(s -> System.out.println(s));
    }
}
