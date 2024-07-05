package 上半.day4;

import java.util.Scanner;

public class 循环和判断_03_第二种格式 {
    public static void main(String[] args) {
/*需求：键盘录入一个整数，表示身上的钱。
        如果大于等于100块，就是网红餐厅。
        否则，就吃经济实惠的沙县小吃。
*/
        //1.键盘录入一个整数，表示身上的钱
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你身上带的钱");
        int money = sc.nextInt();

        //2.对钱进行判断（二选一）
        if (money > 100) {
            System.out.println("去吃网红餐厅");
        } else {
            System.out.println("去吃沙县小吃");
        }

/*需求：用户在超市实际购买，商品总价为:600元。
        键盘录入一个整数表示用户实际支付的钱。
        如果付款大于等于600，表示付款成功。否则付款失败。
*/
        //1.键盘录入一个整数，表示用户支付的钱
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入付款的金额");
        int price = sc1.nextInt();

        //2.对付款进行判断（二选一）
        if (price >= 600) {
            System.out.println("付款成功");
        } else {
            System.out.println("付款失败");
        }
/*需求：假设某影院售卖了100张票，票的序号为1~100.
        其中奇数票号坐左侧，偶数票号坐右侧。键盘录入一个整数表示电影票的票号。
        根据不同情况，给出不同的提示:
            如果票号为奇数，那么打印坐左边如果票号为偶数，那么打印坐右边。
*/
        //1.键盘录入电影票的票号
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入你的票号");
        int number = sc2.nextInt();
        //只有number在0-100之间，才是真实的票号
        if (number >= 0 && number <= 100) {
            if (number % 2 == 1) {
                System.out.println("票号为奇数，坐左边");
            } else {
                System.out.println("票号为偶数，坐右边");
            }
        } else {
            System.out.println("请输入正确的票号");
        }
        //2.判断票号是奇数还是偶数

    }
}
