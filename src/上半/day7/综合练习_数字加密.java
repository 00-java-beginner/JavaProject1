package 上半.day7;

public class 综合练习_数字加密 {
    public static void main(String[] args) {
        //1.定义一个数组
        int[] arr = {1, 5, 8, 6};
        //2.利用循环将数组的值加密
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
        //3.利用循环将加密后的数组进行取余
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }
        //4.利用指针将取余后的数值反转
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //5.将反转后的数组进行拼接
        //定义一个新的变量用来接收数据
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        System.out.println(number);
    }
}
