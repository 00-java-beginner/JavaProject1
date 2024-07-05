package 上半.day5;

import java.util.Random;

public class 数组_08_打乱数据 {
    public static void main(String[] args) {
        /*
        需求：定义一个数组，打乱里面的顺序
        难点：如何获取随机索引
            可以利用随机数进行获取
         */
        //1.定义一个数组
        int arr[] = {1, 2, 3, 4, 5};

        //2.调用随机数
        Random r = new Random();

        //3.循环变量数组
        for (int i = 0; i < arr.length; i++) {
            //获取一个随机索引,赋值给定义的变量
            int randomindex = r.nextInt(arr.length);
            //定义一个临时变量记录索引的值
            int temp = arr[i];
            //进行数据交换
            arr[i] = arr[randomindex];
            arr[randomindex] = temp;
        }
        //循环结束后遍历数组，验证结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
