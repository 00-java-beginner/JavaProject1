package 上半.day10;

public class p104_01_屏蔽手机号 {
    public static void main(String[] args) {
        //1.定义一个变量记录手机号
        String phoneNumber = "18258222617";

        //2.获取手机号前三位
        //注意：substring方法包左不包右，所以在截断的时候要将右边最后一位的索引+1，否则不包含最右边那位
        String start = phoneNumber.substring(0,3);

        //3.截取手机号后四位,由于需要截取到最后一位，所以可以直接从需要截取的那一位的索引开始，不需要写结束值
        String end = phoneNumber.substring(7);

        //4.拼接
        String result = start + "****" + end;
        System.out.println(result);

    }
}
