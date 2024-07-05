package 上半.day13.面向对象进阶_02_01;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("张三",28,"男");
        Student stu2 = new Student("李四",24,"男");
        Student stu3 = new Student("王五",26,"男");
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        int ageMax = StudentUtil.getAgeMax(list);
        System.out.println(ageMax);
    }
}
