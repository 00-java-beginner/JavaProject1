package 上半.day9.p96andp110_字符串;

import java.util.Scanner;

public class p100_用户登陆 {
    public static void main(String[] args) {
        //模拟用户登陆，有三次错误的机会
        //1.定义两个变量记录正确的用户名和密码
        String rightUserName = "zhangsan";
        String rightPassWord = "123456";

        Scanner sc = new Scanner(System.in);
        //2.键盘录入用户名和密码
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String username = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();

            //3.对键盘录入的用户名和密码进行判断
            if (username.equals(rightUserName) && password.equals(rightPassWord)){
                System.out.println("用户登陆成功");
                break;
            }else {
                if (i == 2){
                    System.out.println("账户被锁定，请联系管理员");
                }else {
                    System.out.println("用户登陆失败，用户名或者密码错误,还剩下"+(2 - i) + "次机会");
                }

            }
        }


    }
}
