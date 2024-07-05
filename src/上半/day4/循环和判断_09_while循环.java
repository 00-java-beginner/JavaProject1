package 上半.day4;

import java.util.Scanner;

public class 循环和判断_09_while循环 {
    public static void main(String[] args) {
        /* for循环和while循环的相同点：运行规则都是一样的
           区别：
            1.for循环中：知道循环次数或者循环的范围
            2.while循环：不知道循环的次数和范围，只知道循环的结束条件

        */
//        int i = 1;
//        while (i < 100){
//            i++;
//        }
//        System.out.println(i);

        //珠峰=884430毫米，纸张厚度为0.1毫米，请问需要折叠多少次
        //1.定义一个变量记录高度
//        double a = 8844430;
//        //2.定义一个变量记录纸张的初始厚度
//        double b = 0.1;
//        //记录折叠的次数
//        int count = 0;
//        //3.循环折叠，只要小于就继续
//        while (b < a){
//            b = b * 2;
//            count++;
//        }
//        System.out.println(count);

        //需求：键盘录入一个整数，判断是否为回文数
        //1.键盘录入一个整数
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个整数");
//        int x = sc.nextInt();
//        //定义一个临时变量记录x的原始值，用于最后进行比较
//        int temp = x;
//        //记录倒过来后的结果
//        int num = 0;
//        //2.利用循环将录入的整数倒序
//        while (x != 0){
//            //从右往左获取每一位数字
//            int ge = x % 10;
//            //定义一个变量记录,循环进行一次/10 再用得到的结果进行取模
//            x = x / 10;
//            //把当前获取的数字拼接到最右边
//            //由于num和ge的类型都是int  所以在这里执行的是加法的运算
//            //利用取到的数*10实现位置的跨越，获取下一位后由于个位是0等于完成了拼接
//            num = num * 10 + ge;
//        }
//        System.out.println(num == temp);

        //需求：键盘录入两个整数，得到他们的商和余数
        //1.键盘录入两个整数记录被除数和除数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数");
        int dividend = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入除数");
        int divisor = sc1.nextInt();

        //定义一个变量记录一共减了多少次
        int count = 0;
        //2.利用被除数-除数进行循环
        while (dividend >= divisor) {
            //将最后的结果重新赋值给被除数
            dividend = dividend - divisor;
            //只要每减一次就自增一次
            count++;
        }
        System.out.println("余数为：" + dividend);
        System.out.println("商为：" + count);
    }
}
