package 上半.day7;

public class 综合练习_数字加密_01 {
    public static void main(String[] args) {
        //1.计算出数组的长度
        int number = 12345;
        //定义一个临时变量记录number初始值，给后续使用
        int temp = number;
        //2.利用循环将数组的长度取出
        //定义变量接收数组的长度
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        //3.定义一个数组
        int[] arr = new int[count];

        //4.把整数上的每一位都添加到数组中
        //定义一个变量作为索引
        int index = arr.length - 1;
        while (temp != 0) {//12345
            int ge = temp % 10;
            temp = temp / 10;
            arr[index] = ge;
            index--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
