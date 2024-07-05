package 上半.day7;

public class 综合练习_数字解密 {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr = {1, 9, 6, 3};
        //2.将数组反转
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //3.由于加密的时候是通过取余的方式获取的，所以解密的时候需要判断
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4) {
                arr[i] = arr[i] + 10;
            }
        }
        //4.加密是+5，所以解密是-5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 5;
        }
        //5.获取数组中的每一个数字进行拼接
        int number = 0;
        for (int j : arr) {
            number = number * 10 + j;
        }
        System.out.println(number);
    }
}
