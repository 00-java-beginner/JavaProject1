package 上半.day7;

import java.util.Random;

public class 综合练习_开发验证码 {
    public static void main(String[] args) {
        //验证码格式：五位，前面四位为大写或者小写字母，最后一位为数字
        //1.将所有的大写字母和小写字母放到数组当中
        //利用ASCII码表的特性将数组中的数据类型转换为char可以输出对应的字符
        //创建一个数组并记录他的长度
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                //小写字母‘a’的ASCII表从97开始
                chs[i] = (char) (97 + i);
            } else {
                //大写字母‘A’的ASCII表从65开始
                //进入else后需要减去前面循环的次数，否则i的值与码表无法对应
                chs[i] = (char) (65 + i - 26);
            }
        }
        //2.随机抽取四次，利用索引进行抽取
        //定义一个字符串用来接收每次循环后的值，并将他们拼接在一起
        String result = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomindex = r.nextInt(chs.length);
            //拼接循环后的结果
            result = result + chs[randomindex];
        }
        //3.随机抽取一个数字0-9
        int number = r.nextInt(10);
        //将随机数字跟result进行拼接就可以得到最后的结果
        result = result + number;
        System.out.println(result);
    }
}
