package 上半.day4;

import java.util.Scanner;

public class 循环和判断_07_08_for循环 {
    public static void main(String[] args) {
        //格式：for(int i = 1; i <= 10;i++){}
        //快捷写法：100.fori
        //初始化语句只执行一次，判断语句为true，循环继续，false，循环结束
        //打印五次helloworld
//        for(int i = 1; i <=5; i++){
//            System.out.println("Hello World");
//        }
//
//        //输出数字 1.打印1-5
//        for(int a = 1; a <=5; a++){
//            System.out.println(a);
//        }
//
//        //输出数字 1.打印5-1
//        for(int b = 5; b >= 1; b--){
//            System.out.println(b);
//        }

        //求和  求和的变量不能定义在循环里面，因为只在所属大括号里面生效
        //如果定义在循环里面，那么变量只在本次循环中有效
        //当本次循环结束之后，变量就会从内存中消失，第二次循环开始的时候，又会重新定义一个新的变量
        //写累加求和的变量，可以把变量定义在循环的外面
//        int num = 0;
//        for(int a = 1; a <=5; a++){
//            num = num + a;
//        }
//        System.out.println(num);

        //求1-100之间的偶数和
        //1.获取1-100之间的每个数
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            //2.累加求和（先判断，再求和）
//            if(i % 2 == 0){
//                sum = sum + i;
//            }
//        }
//        System.out.println(sum);

        //统计满足条件的数字
        //键盘录入两个数字，表示一个范围，
        //统计既能被3整除，又能被5整除的数字有多少个
        //1.键盘录入两个数字
        Scanner sc = new Scanner(System.in);
        System.out.println("录入一个数字表示范围的开始");
        int start = sc.nextInt();
        System.out.println("录入一个数字表示范围的结束");
        int end = sc.nextInt();

        //统计变量
        int conut = 0;
        //2.利用循环获取这个范围中的每一个数字
        //开始条件：start  结束条件：end
        for (int i = start; i <= end; i++) {
            //3.对每一个数字进行判断，统计有多少个满足要求的数字
            if (i % 3 == 0 && i % 5 == 0) {
                conut++;
            }
        }
        System.out.println(conut);


    }
}
