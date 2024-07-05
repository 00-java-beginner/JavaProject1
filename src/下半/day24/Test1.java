package 下半.day24;

import java.util.HashMap;

public class Test1 {
    public static void main(String[] args) {
        //核心点：HashMap的键位置如果存放的是自定义对象，需要重写hashCode和equals方法
        //否则比较的是地址值，而不是对象内部的属性值
        HashMap<Student, String> map = new HashMap<>();
        Student s1 = new Student("xiaohong", 20);
        Student s2 = new Student("xiaobai", 22);
        Student s3 = new Student("xiaolan", 24);
        Student s4 = new Student("xiaolan", 24);

        map.put(s1, "广东");
        map.put(s2, "福建");
        map.put(s3, "上海");
        map.put(s4, "上海");

        map.forEach((key, value) -> System.out.println(key + " = " + value));
    }
}
