package 上半.day7;

import java.util.Scanner;

public class 综合练习_买飞机票 {
    public static void main(String[] args) {
        //需求:机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价，月份和头等舱或经济舱。
        //按照如下规则计算机票价格:旺季(5-10月)头等舱9折，经济舱8.5折，淡季(11月到来年4月)头等舱7折，经济舱6.5折。
        //1.键盘录入需要输入的参数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价");
        int ticket = sc.nextInt();
        System.out.println("请输入当前的月份");
        int mouth = sc.nextInt();
        System.out.println("请输入你是什么舱 0：头等舱，1：经济舱");
        int seat = sc.nextInt();

        //2.判断是旺季还是淡季
        if (mouth >= 5 && mouth <= 10) {
            //旺季头等舱9折，经济舱8.5折
            ticket = getprice(ticket, seat, 0.9, 0.85);
        } else if ((mouth >= 1 && mouth <= 4) || (mouth == 11 && mouth == 12)) {
            //淡季头等舱7折，经济舱6.5折
            ticket = getprice(ticket, seat, 0.7, 0.65);
        } else {
            System.out.println("键盘录入的月份不合法");
        }
        System.out.println(ticket);
    }

    public static int getprice(int ticket, int seat, double v0, double v1) {
        //3.判断是什么舱
        if (seat == 0) {
            System.out.println("当前为淡季头等舱，打七折");
            ticket = (int) (ticket * v0);
        } else if (seat == 1) {
            System.out.println("当前为淡季经济舱，打6.5折");
            ticket = (int) (ticket * v1);
        } else {
            System.out.println("没有这个舱位");
        }
        return ticket;
    }
}
