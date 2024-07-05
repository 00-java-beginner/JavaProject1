package 上半.day5;

import java.util.Random;
import java.util.Scanner;

public class 循环高级综合练习_05_随机数 {
    public static void main(String[] args) {
        //1.生成一个1-100之间的随机数
        int conut = 0;
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        //2.猜这个数字是多少
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个数字");
            int number1 = sc.nextInt();

            //3.判断两个数字给出不同的提示
            conut++;
            if (conut == 3) {
                System.out.println("猜中了");
                break;
            }
            if (number < number1) {
                System.out.println("猜小了");
            } else if (number > number1) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜中了");
                break;
            }

        }
    }
}
