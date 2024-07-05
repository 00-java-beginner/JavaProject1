package 上半.day23.set;

import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        TreeSet<Integer> ts1 = new TreeSet<>();
        ts1.add(1);
        ts1.add(2);
        ts1.add(5);
        ts1.add(4);
        ts1.add(3);

        TreeSet<Student> ts2 = new TreeSet<>();

        Student s1 = new Student(23,"张三");
        Student s2 = new Student(22,"李四");
        Student s3 = new Student(25,"王五");
        ts2.add(s1);
        ts2.add(s2);
        ts2.add(s3);
        System.out.println(ts2);
    }
}
