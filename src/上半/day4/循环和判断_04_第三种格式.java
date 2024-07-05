package 上半.day4;

import java.util.Scanner;

public class 循环和判断_04_第三种格式 {
    public static void main(String[] args) {
        //1.录入考试的成绩
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入你的成绩");
//        int score = sc.nextInt();
//
//        //2.根据不同的成绩给出不同的奖励（需要对异常数据进行校验）
//        if(score >0 && score <= 100 ){
//            if(score >= 95 && score <= 100){
//                System.out.println("奖励牛排一块");
//            }else if(score >= 90 && score < 95){
//                System.out.println("奖励鸡排一块");
//            }else if(score >= 85 && score < 90){
//                System.out.println("奖励猪排一块");
//            }else{
//                System.out.println("没饭吃");
//            }
//        }else {
//            System.out.println("输入的成绩不正确");
//        }


        //假设商品总价为1000，键盘录入会员的等级，并计算出实际支付的钱
        //一级打九折，二级打八折，三级打七折
        //1.定义变量记录商品的价格
        int price = 1000;

        //2.键盘录入会员的等级
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入会员的等级");
        int vip = sc1.nextInt();

        //3.根据级别来计算实际要支付的钱
        if (vip == 1) {
            System.out.println("实际支付的钱为" + (price * 0.9));
        } else if (vip == 2) {
            System.out.println("实际要支付的钱" + (price * 0.8));
        } else if (vip == 3) {
            System.out.println("实际要支付的钱" + (price * 0.7));
        } else {
            System.out.println("实际要支付的钱" + price);
        }
    }
}
