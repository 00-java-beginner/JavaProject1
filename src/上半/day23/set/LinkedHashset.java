package 上半.day23.set;

import java.util.LinkedHashSet;

public class LinkedHashset {
    public static void main(String[] args) {
        Student s1 = new Student(23,"张三");
        Student s2 = new Student(22,"李四");
        Student s3 = new Student(25,"王五");
        Student s4 = new Student(23,"张三");

        LinkedHashSet<Student> lhs = new LinkedHashSet<>();
        lhs.add(s1);
        lhs.add(s2);
        lhs.add(s3);
        lhs.add(s4);


        System.out.println(lhs);

        //特点和原理
        //有序，不重复，无索引
        //底层基于哈希表，使用双链表记录添加顺序

        //以后要数据去重使用哪个
        //默认使用HashSet，如果要去去重且有序存取，才使用LinkedHashSet
    }
}
