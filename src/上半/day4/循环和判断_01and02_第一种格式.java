package 上半.day4;

import java.util.Scanner;

public class 循环和判断_01and02_第一种格式 {
    public static void main(String[] args) {
/*
        为什么要有if语句：因为在程序中需要进行判断
        执行顺序:
                1.首先计算关系表达式的值
                2.如果关系表达式的值为true就执行语句体
                3.如果关系表达式的值为false就不执行语句体
                4.继续执行后面的其他语句

        if的注意点：
                1.大括号的开头可以另起一行书写，但是最好写在第一行的末尾
                2.在语句体中，如果只有一行代码，可以不写大括号。但是最好不要省略
                3.如果对一共布尔类型的变量进行判断，不要用==号，直接把变量写在小括号里面即可
                    boolean flag =true;
                    if (flag){
                        System.out.println("flag的值为true");
                        }
*/
        //if格式：if（关系表达式）{
        // 语句体
        //  }
//需求:键盘录入女婿酒量，如果大于 2 斤，老丈人给出回应，反之不回应
        //1.键盘录入女婿的酒量
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入女婿的酒量");
//        int wine = sc.nextInt();
//
//        //2.对酒量进行判断
//        if (wine > 2) {
//            System.out.println("酒量不错");
//        }

//需求：如果考试第一，就做你好兄弟
        //1.键盘录入考试名次
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入你的名次");
        int ranking = sc1.nextInt();

        //2.对名次进行判断
        if (ranking == 1) {
            System.out.println("小王成为了小明的好兄弟");
        }

/*需求：当汽车行驶的时候遇到了红绿灯，就会进行判断
        如果红灯亮，就停止
        如果黄灯亮，就减速
        如果绿灯亮，就行驶
*/
        //1.定义三个变量表示灯的状态
        boolean islightGreen = true;
        boolean islightRed = false;
        boolean islightYellow = false;

        //2.对灯的状态进行判断
        if (islightGreen) {
            System.out.println("绿灯通行");
        }

        if (islightRed) {
            System.out.println("红灯停");
        }

        if (islightYellow) {
            System.out.println("黄灯减速");
        }

    }
}
