package 上半.day7;

public class 综合练习_找质数 {
    public static void main(String[] args) {
        //判断101-200之间有多少个质数
        //1.循环得到101-200之间的数字
        int conut = 0;
        for (int i = 101; i <= 200; i++) {
            //定义一个变量认为一开始他是一个质数
            boolean flag = true;
            //2.循环2-i之间能否被整除，如果可以被整除就表示不是一个质数
            for (int j = 2; j < i; j++) {
                //3.判断是否为质数
                if (i % j == 0) {
                    //如果 i/j=0则表示不是一个质数，将false赋值给flag
                    flag = false;
                    //不是质数的情况下直接跳出循环进行下一次判断
                    break;
                }
            }
            if (flag == true) {
                System.out.println(i + "是一个质数");
                conut++;
            } else {
                System.out.println(i + "不是一个质数");
            }
        }
        System.out.println("一共有" + conut + "个质数");

    }
}
