package 上半.day5;

public class 循环高级综合练习_02_逢七过 {
    public static void main(String[] args) {
        //需求：打印1-100之间的数字，逢七过

        //1.打印1-100
        for (int i = 1; i <= 100; i++) {
            //2.判断1-100之间哪些数字满足逢七过
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                System.out.println("过");
            } else {
                System.out.println(i);
            }
        }
    }
}
