package 上半.day7;

import java.util.Random;

public class p78_综合练习_抽奖_优化后 {
    public static void main(String[] args) {
        //1.把奖池里面的所有选项全部打乱
        int[] arr = {88, 888, 8888, 88888, 888888};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //获取随机索引
            int randomIndex = r.nextInt(arr.length);
            //用i跟随机索引randomIndex进行交换
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        for (int j : arr) {
            System.out.println(j);
        }

    }
}
