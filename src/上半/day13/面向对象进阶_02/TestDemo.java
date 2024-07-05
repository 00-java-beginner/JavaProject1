package 上半.day13.面向对象进阶_02;

public class TestDemo {
    public static void main(String[] args) {
        //测试工具类中的两个方法是否正确
        int[] arr1 = {1, 2, 3, 4, 5};
        String str = ArrayUtil.printArr(arr1);
        System.out.println(str);

        double[] arr2 = {1.1, 5.7, 1.5, 4.5, 8.9};
        double avg = ArrayUtil.getAvg(arr2);
        System.out.println(avg);
    }
}
