package 上半.day10;

import java.util.Scanner;

public class p103 {
    public static void main(String[] args) {
        //1.键盘录入一个金额
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请输入金额");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("输入的金额无效，请重新输入");
            }
        }
        //2.得到money里面的每一位数字
        //定义一个变量表示钱的大写
        String moneystr = "";
        while (true) {
            //从右往左获取数据
            int ge = money % 10;
            //调用方法将转换后的金额大写赋值给一个新的字符串
            String capitalNumber = getCapitalNumber(ge);
            //把转换之后的大写拼接到moneystr中
            //注意：由于取数字是从右往左，所以进行拼接的时候需要从左往右，否则会报错
            moneystr = capitalNumber + moneystr;
            //去掉刚刚获取的数据
            money = money / 10;
            //当money为0时代表已经获取到全部的数据，此时循环结束
            if (money == 0) {
                break;
            }
        }
        //3.在前面补0，补齐七位
        int count = 7 - moneystr.length();
        for (int i = 0; i < count; i++) {
            moneystr = "零" + moneystr;
        }
        //4.插入单位，定义一个数组表示单位
        String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元"};

        String result = "";
        //5.得到moneystr里面的元素在跟arr进行拼接
        //由于这里单位和中文的数组长度是一致的，所以可以用一个索引
        for (int i = 0; i < moneystr.length(); i++) {
            char c = moneystr.charAt(i);
            result = result + c + arr[i];
        }
        System.out.println(result);
    }

    //定义一个方法，将数字变成大写的中文
    //思想是将形参当作索引，然后利用索引取出数组中对应的字符串
    public static String getCapitalNumber(int number) {
        //对应数组，让数字和中文产生一个关系
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        //返回结果
        return arr[number];
    }
}
