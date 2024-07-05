package 上半.day7;

public class 综合练习_复制数组 {
    public static void main(String[] args) {
        //1.定义一个数组
        int[] arr = {1, 2, 3, 4, 5};
        //2.定义一个新的数组与老数组的长度保持一致
        int[] newarr = new int[arr.length];
        //3.将老数组进行循环取值并赋值给新数组
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];
        }
        for (int i = 0; i < newarr.length; i++) {
            System.out.println(newarr[i]);
        }
    }
}
