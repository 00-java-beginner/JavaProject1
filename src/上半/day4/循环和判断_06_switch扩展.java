package 上半.day4;

import java.util.Scanner;

public class 循环和判断_06_switch扩展 {
    public static void main(String[] args) {
        //switch新特性  JDK12+才有  只有一行的情况下可以省略大括号
//        int number = 2;
//        switch (number){
//            case 1 -> System.out.println("一");
//            case 2 -> System.out.println("二");
//            case 3 -> System.out.println("三");
//            default -> System.out.println("没有这个选项");
//        }

        //switch和if第三种格式各自的使用场景
        //if的第三种格式：一般用于对范围的判断
        //switch：把有限个数据一一列举出来，让我们任选其一


        //需求：键盘录入星期几，输出工作日和休息日
        //1.键盘录入星期几
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入今天星期几");
//        int week = sc.nextInt();
//        //2.利用switch语句来进行选择
//        switch (week){
//            case 1,2,3,4,5 -> System.out.println("工作日");
//            case 6,7 -> System.out.println("休息日");
//            default -> System.out.println("没有这个星期");
//        }
        //需求：拨打服务电话进行案件选择
        //1.机票查询   2.机票预定  3.机票改签  4.退出服务

        //1.键盘录入一个整数
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入你的选择");
        int number1 = sc1.nextInt();
        //2.根据选择执行不同的代码逻辑
        switch (number1) {
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票预定");
            case 3 -> System.out.println("机票改签");
            case 4 -> System.out.println("退出服务");
            default -> System.out.println("退出服务");
        }
    }
}
