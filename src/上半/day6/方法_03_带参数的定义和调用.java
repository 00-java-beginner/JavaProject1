package 上半.day6;

public class 方法_03_带参数的定义和调用 {
    public static void main(String[] args) {
        getsum(1, 2);
    }

    //定义方法时将变量写在小括号内，在调用的时候进行赋值
    public static void getsum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);


    }
}
