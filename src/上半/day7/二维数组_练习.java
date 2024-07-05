package 上半.day7;

public class 二维数组_练习 {
    public static void main(String[] args) {
        //1.创建二维数组
        int[][] yearTwoArr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        //2.遍历二维数组，将得到的数据求和
        int yearSum = 0;
        for (int i = 0; i < yearTwoArr.length; i++) {
            int[] quarterArr = yearTwoArr[i];
            int sum = getSum(quarterArr);
            System.out.println("第" + (i + 1) + "个月营业额为：" + sum);
            yearSum = sum + yearSum;
        }
        System.out.println("全年的营业额为：" + yearSum);
    }
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        return sum;
    }
}
