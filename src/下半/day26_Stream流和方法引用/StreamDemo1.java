package 下半.day26_Stream流和方法引用;

import java.util.ArrayList;

public class StreamDemo1 {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("张大大");
        list.add("张三");
        list.add("李四");
        list.stream().filter(name -> name.startsWith("张")).
                      filter(name -> name.length()==3).
                      forEach(name -> System.out.println(name));
    }
}
