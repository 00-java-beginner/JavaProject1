package 上半.day21.综合练习;

public class Test4 {
    public static void main(String[] args) {
        //爬楼梯,有时候爬一个，有时候爬两个
        //求20个台阶有多少种爬法
        System.out.println(getCount(20));

    }

    public static int getCount(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 4;
        }
        return getCount(n - 1) + getCount(n - 2) + getCount(n - 3);
    }
}
