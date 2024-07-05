package 上半.day5;

public class 数组_07_交换数据 {
    public static void main(String[] args) {
        /*
        需求：定义一个数组，存入1，2，3，4，5  交换首尾索引对应的元素
         */
        //1.定义一个数组，存入1，2，3，4，5
        int arr[] = {1, 2, 3, 4, 5};

        //2.利用循环交换数据
        //循环开始条件为i = 0索引，j = length - 1索引
        //循环结束条件为 i < j
        //每次循环i自增一次，j自减一次
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            //定义一个临时变量记录首位某个索引的值
            int temp = arr[i];
            //先将尾索引的值赋给首索引
            arr[i] = arr[j];
            //再将临时变量的值赋值给尾索引
            arr[j] = temp;
        }
        //循环结束后打印数组验证结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
