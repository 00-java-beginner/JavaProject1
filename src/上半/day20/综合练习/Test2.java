package 上半.day20.综合练习;

public class Test2 {
    public static void main(String[] args) {
        /*自己实现parselnt方法的效果，将字符串形式的数据转成整数。要求:
        字符串中只能是数字不能有其他字符最少一位，最多10位
        0不能开头*/

        //定义字符串
        String str = "123456";

        if (!str.matches("[1-9]\\d{0,9}")){
            System.out.println("格式错误");
        }else {
            System.out.println("格式正确");
            int num = Integer.parseInt(str);
            System.out.println(num);
        }
    }
}
