package 上半.day5;

public class 数组_03_遍历 {
    public static void main(String[] args) {
        /*int[] arr = {1,2,3,4,5};
        //快速生成数组的遍历方式
        //通过数组名.length可以获取数组的长度   用来当做循环条件
        //i表示数组里面的每一个索引   arr[i]表示数组里面的每一个元素
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //累加遍历的数据
        int[] arr1 = {1,2,3,4,5};
        //定义一个变量接收求和的值
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum = sum + arr1[i];
        }
        System.out.println(sum);
        */

        /*
        //需求：统计个数，定义一个数组，遍历每个元素，统计数组中有多少个能被3整除的数字
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        //定义一个变量进行统计
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] % 3 == 0){
                count++;
            }
        }
        System.out.println(count);
         */

        //需求：定义一个数组，遍历每个元素
        // 如果是奇数，则将当前数字扩大两倍，如果是偶数，则将当前数字变成二分之一
        int[] arr3 = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] % 2 == 1) {
                arr3[i] = arr3[i] * 2;
                //System.out.println(arr3[i]);
            } else {
                arr3[i] = arr3[i] / 2;
                //System.out.println(arr3[i]);
            }
        }
        //循环结束后再进行打印，一个循环尽量只做一件事情
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}
