package 上半.day9.p96andp110_字符串;

import java.util.Scanner;

public class p101_遍历字符串和统计个数 {
    public static void main(String[] args) {
        /*//1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        //2.遍历字符串
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }*/
        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        //2.统计大小写和数字的个数
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        //3.遍历字符串
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //注意：char类型的变量在参与计算的时候自动提升为int类型，查询ascii码表
            if (c >= 'a' && c <= 'z'){
                smallCount++;
            }else if (c >= 'A' && c <= 'Z'){
                bigCount++;
            }else if (c >= '0' && c <= '9'){
                numberCount++;
            }
        }
        System.out.println(smallCount);
        System.out.println(bigCount);
        System.out.println(numberCount);

    }
}
