package 上半.day21.综合练习;

public class Test2 {
    public static void main(String[] args) {
        //不死神兔问题，求第十二个月有多少对兔子
        //1.利用循环
        int[] arr = new int[12];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[11]);

        //2.利用递归
        System.out.println(getSum(12));
    }

    public static int getSum(int mouth) {
        if (mouth == 1 || mouth == 2) {
            return 1;
        } else {
            return getSum(mouth - 1) + getSum(mouth - 2);
        }
    }
}
