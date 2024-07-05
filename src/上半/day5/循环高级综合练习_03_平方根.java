package 上半.day5;

import java.util.Scanner;

public class 循环高级综合练习_03_平方根 {
    public static void main(String[] args) {
        //需求：键盘录入一个整数，得到他的平方根，如果是小数则取整数部位
        //1.键盘录入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = sc.nextInt();

        //2.从1开始循环判断，如果是小于number就继续，如果大于等于就结束
        for (int i = 1; i <= number; i++) {
            if (i * i == number) {
                System.out.println(i + "就是" + number + "的平方根");
                break;
            } else if (i * i > number) {
                System.out.println((i - 1) + "就是" + number + "平方根的整数部分");
                break;
            }
        }
    }
}
