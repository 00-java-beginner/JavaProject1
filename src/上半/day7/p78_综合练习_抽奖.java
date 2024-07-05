package 上半.day7;

import java.util.Random;

public class p78_综合练习_抽奖 {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr = {88, 888, 8888, 88888, 888888};
        //2.定义一个新的数组用来接受
        int [] newArr = new int [arr.length];
        //3.抽奖
        Random r = new Random();
        for (int i = 0; i < 5; ) {
            //获取随机索引
            int randomIndex = r.nextInt(arr.length);
            //获取奖项
            int prize = arr[randomIndex];
            //判断奖项是否存在，如果存在则重新抽取，不存在则是有效奖项
            if(!(contains(newArr,prize))){
                //把抽取到的奖项放到newArr里面
                newArr[i] = prize;
                i++;//添加完毕后移动索引
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
    //定义方法判断prize在数组当中是否存在,存在返回true  不存在返回false
    public static boolean contains(int [] arr,int prize){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize){
                return true;
            }
        }
        return false;


    }
}
