package 上半.day5;

import java.util.Scanner;

public class 循环高级综合练习_04_判断是否为质数 {
    public static void main(String[] args) {
        //需求：键盘录入一个正整数，判断是否为一个质数
        //1.键盘录入一个正整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int number = sc.nextInt();

        //定义一个变量表示标记，标记number是否为一个质数
        boolean flag = true;
        //2.写一个循环，从2开始判断，判断是否为一个质数
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(number + "是一个质数");
        } else {
            System.out.println(number + "不是一个质数");
        }
    }
}
