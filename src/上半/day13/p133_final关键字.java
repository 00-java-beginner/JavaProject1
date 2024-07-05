package 上半.day13;

import 上半.day13.p129认识多态.Student;

public class p133_final关键字 {
    public static void main(String[] args) {
        //final 修改基本数据类型：记录的值不能发生变化
        //final 修改引用数据类型：记录的地址值不能发生变化，但是内部的属性值可以发生变化
        final int a = 10;
        //a = 20; 基本数据类型不能赋值，此时变量a变成了常量A

        final Student S = new Student();
        //S = new Student(); 引用数据类型不能发生变化，只能对里面的属性值进行修改
        S.setName("zhangsan");
        S.setAge(22);
        System.out.println(S.getAge() + ", " + S.getName());
    }
}
