package 上半.day10;

import java.util.Scanner;

public class p105_01_练习 {
    public static void main(String[] args) {
        //使用StringBuilder的场景
        //1.字符串的拼接
        //2.字符串的反转

        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        //2.反转键盘录入的字符串
//        StringBuilder sb = new StringBuilder();
//        sb.append(str);
//        sb.reverse();

        //利用链式编程书写
        String result = new StringBuilder().append(str).reverse().toString();

        //3.比较
        if (str.equals(result)){
            System.out.println("当前字符串是对称的");
        }else {
            System.out.println("当前字符串不是对称的");
        }
    }
}
