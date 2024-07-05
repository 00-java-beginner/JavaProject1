package 上半.day11;

import java.util.ArrayList;
import java.util.Scanner;

public class p113_添加学生对象并遍历_1 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<Student> list = new ArrayList<>();
        //2.键盘录入
        Scanner sc = new Scanner(System.in);
        //3.添加三个学生对象
        for (int i = 0; i < 3; i++) {
            //创建学生对象，需要放在循环内，不然每次循环会将上一个元素覆盖
            Student s = new Student();
            System.out.println("请输入学生的姓名");
            String name = sc.next();
            System.out.println("请输入学生的年龄");
            int age = sc.nextInt();
            //将键盘录入的数据添加到学生对象中
            s.setName(name);
            s.setAge(age);
            //将学生对象添加到集合中
            list.add(s);
        }
        //4.遍历集合得到里面的元素
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + ", " + stu.getAge());
        }
    }
}
