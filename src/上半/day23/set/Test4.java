package 上半.day23.set;

import java.util.TreeSet;

public class Test4 {
    public static void main(String[] args) {
        Student1 s1 = new Student1("xiaobai",20,60,60,60);
        Student1 s2 = new Student1("xiaohong",22,70,60,60);
        Student1 s3 = new Student1("xiaohuang",24,60,80,60);
        Student1 s4 = new Student1("xiaolan",26,60,60,90);
        Student1 s5 = new Student1("xiaoming",28,100,60,60);
        TreeSet<Student1> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for (Student1 t : ts) {
            System.out.println(t);
        }
    }
}
