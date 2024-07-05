package 上半.day3;

import java.util.Scanner;

public class 数据输入 {
    public static void main(String[] args) {
        //创建对象  sc是变量可以改变  其余不允许改变
        Scanner sc = new Scanner(System.in);

        //接收数据  i是变量可以改变  其余不允许改变
        int i = sc.nextInt();

        //输出数据
        System.out.println("结果为" + i);

        System.out.println("请输入第一个和尚的身高");
        int height1 = sc.nextInt();

        System.out.println("请输入第二个和尚的身高");
        int height2 = sc.nextInt();

        System.out.println("请输入第三个和尚的身高");
        int height3 = sc.nextInt();

        int max1 = height1 > height2 ? height1 : height2;
        int max2 = max1 > height3 ? max1 : height3;
        System.out.println("最高的和尚为" + max2);
    }
}
