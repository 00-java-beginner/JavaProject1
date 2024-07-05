package 上半.day10;

import java.util.Random;

public class p110_test2 {
    public static void main(String[] args) {
        //生成验证码，可以是大写，也可以是小写，还可以是数字
        //规则：长度为5，四位字母，一位数字，数字可以出现在任意位置
        //1.可以把所有大小写字母放在一个数组中
        char[] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if (i <= 25){
                arr[i] = (char) (97 + i);
            }else {
                arr[i] = (char) (65 + i - 26);
            }
        }
        //2.从数组中随机四次将字母取出来
        Random r = new Random();
        String result = "";
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(arr.length);
            result = result + arr[randomIndex];
        }
        //3.生成一个随机数字拼接在后面，并打乱顺序
        int number = r.nextInt(10);
        //4.生成最终的结果并转换成数组
        result = result + number;
        char[] newArr = result.toCharArray();
        //5.打乱数组中的内容
        for (int i = 0; i < newArr.length; i++) {
            //获取一个随机索引
            int index = r.nextInt(newArr.length);
            char temp = newArr[i];
            newArr[i] = newArr[index];
            newArr[index] = temp;
        }
        //6.将数组转换为字符串
        String result1 = new String(newArr);
        System.out.println(result1);






    }
}
