package 下半.day24;

import java.util.TreeMap;

public class Test3 {
    public static void main(String[] args) {
        //要求:按照学生年龄的升序排列，年龄一样按照姓名的字母排列，同姓名年龄视为同一个人。
        TreeMap<Student,String> tm = new TreeMap<>();
        Student s1 = new Student("zhangsan",20);
        Student s2 = new Student("lisi",26);
        Student s3 = new Student("wangwu",24);
        tm.put(s1,"浙江");
        tm.put(s2,"广东");
        tm.put(s3,"江苏");
        System.out.println(tm);
    }
}
