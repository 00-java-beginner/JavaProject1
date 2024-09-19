package 下半.day26_Stream流和方法引用.stream流的中间方法_03_04_终结方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class StreamDemo1 {
    public static void main(String[] args) {
        /* filter:过滤
         * limit：获取前几个元素
         * skip：跳过前几个元素
         * distinct：元素去重，依赖hashCode和equsls方法
         * concat：合并a和b两个流为一个流
         * map：转换流的数据类型
         *
         * 注意1：中间方法返回新的stream流，原来的stream流只能使用一次，建议用在链式编程
         * 注意2：修改stream流中的数据，不会影响原来集合或者数组中的数据*/
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三-15","李四-16", "王五-17", "赵六-18", "三七-19", "二八-20", "一九-21");

//        ArrayList<String> list1 = new ArrayList<>();
//        Collections.addAll(list,"周芷若","赵敏");

        // filter 过滤
        //list.stream().filter(s -> s.startsWith("张"))
                //.forEach(s -> System.out.println(s));

        // limit 获取前几个元素
        //list.stream().limit(3)
                //.forEach(s -> System.out.println(s));

        // skip 跳过前几个元素
        //list.stream().skip(3)
                //.forEach(s -> System.out.println(s));

        // distinct：元素去重，依赖hashCode和equsls方法
        //list.stream().distinct().forEach(s -> System.out.println(s));

        //concat：合并a和b两个流为一个流
        //Stream.concat(list.stream(),list1.stream()).forEach(s -> System.out.println(s));

        //map：转换流的数据类型
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                String[] arr = s.split("-");
                String ageString = arr[1];
                int age = Integer.parseInt(ageString);
                return age;
            }
        }).forEach(s -> System.out.println(s));

        //map 优化代码
        list.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(s -> System.out.println(s));

        //获取中间的元素
        //list.stream().skip(1).limit(3).forEach(s -> System.out.println(s));


    }
}
