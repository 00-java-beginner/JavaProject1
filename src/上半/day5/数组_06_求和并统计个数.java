package 上半.day5;

import java.util.Random;

public class 数组_06_求和并统计个数 {
    public static void main(String[] args) {

        /*
        需求：生成十个1-100之间的随机数存入数组
             1.计算数组的和
             2.计算数组的平均数
             3.统计有多少个数小于平均数
         */
        //1.定义一个数组（动态初始化）
        int arr[] = new int[10];

        //2.利用循环将随机数存入数组中
        for (int i = 0; i < arr.length; i++) {
            //获取随机数存入数组中
            Random r = new Random();
            //范围为1-100 所以需要破解 + 1
            int number = r.nextInt(100) + 1;
            //把生成的随机数存入数组中，格式为：数组名[索引] = 数据
            arr[i] = number;
        }
        //3.计算数组的和
        //定义一个变量接收数据
        int sum = 0;
        //循环数组，进行求和
        for (int i = 0; i < arr.length; i++) {
            //将每一次循环的值都赋值给sum进行累加
            sum = sum + arr[i];
        }
        System.out.println("数组的和为" + sum);

        //4.计算数组的平均数
        //定义一个变量接收数据
        double avg = 0;
        //循环数组得到总数
        for (int i = 0; i < arr.length; i++) {
            //进行平均数计算
            avg = sum / arr.length;
        }
        System.out.println("数组的平均数为" + avg);

        //5.统计有多少个数小于平均数
        //定义一个变量接收数据
        int count = 0;
        //循环数组，得到数组中的随机数
        for (int i = 0; i < arr.length; i++) {
            //对得到的随机数进行判断
            if (arr[i] < avg) {
                count++;
            }
        }
        System.out.println("比平均数小的数字有" + count + "个");

        //6.遍历数组验证答案
        for (int i = 0; i < arr.length; i++) {
            //print表示将下方打印的结果在一行展示
            System.out.print(arr[i] + " ");
        }
    }
}
