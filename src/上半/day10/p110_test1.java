package 上半.day10;

import java.util.Random;
import java.util.Scanner;

public class p110_test1 {
    public static void main(String[] args) {
        //键盘录入一个字符串，并打乱顺序
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        //2.将字符串转换为字符数组
        char[] strArr = str.toCharArray();
        //3.将字符数组打乱顺序
        //利用索引跟随机索引交换位置
        Random r = new Random();
        for (int i = 0; i < strArr.length; i++) {
            //获取随机索引
            int number = r.nextInt(strArr.length);
            //定义一个临时变量记录未打乱前的值
            char temp = strArr[i];
            //打乱顺序
            strArr[i] = strArr[number];
            strArr[number] = temp;
        }
        String result = new String(strArr);
        System.out.println(result);
    }
}
