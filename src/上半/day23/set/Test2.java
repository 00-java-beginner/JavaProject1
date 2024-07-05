package 上半.day23.set;

import java.util.HashSet;

public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student(23,"张三");
        Student s2 = new Student(22,"李四");
        Student s3 = new Student(25,"王五");
        Student s4 = new Student(23,"张三");

        HashSet<Student> hs = new HashSet<>();
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);

        System.out.println(hs);


    }
}
