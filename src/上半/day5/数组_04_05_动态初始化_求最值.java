package 上半.day5;

public class 数组_04_05_动态初始化_求最值 {
    public static void main(String[] args) {
        //动态初始化
        int[] arr = {3};
        arr[0] = 4;
        System.out.println(arr[0]);

        //定义数组求最大值
        int[] arr1 = {11, 22, 33, 44};

        //定义一个变量记录最大值
        //max的初始化值不能为0，一定要是数组当中的值
        int max = arr1[0];
        //循环的开始条件可以写成1，提高代码的效率
        //因为写成0第一次就是自己跟自己比较，没有意义
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }
        System.out.println(max);
    }
}
