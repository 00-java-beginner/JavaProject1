package 上半.day16_day17;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        //1.定义一个一维数组，并打乱顺序
        int [] tempArr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        //2.循环遍历得到每一个元素
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            //定义一个临时变量记录最初的值
            int temp = tempArr[i];
            int index = r.nextInt(tempArr.length);
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }
        /*for (int i = 0; i < tempArr.length; i++) {
            System.out.print(tempArr[i] + " ");
        }
        System.out.println();*/

        //3.创建一个二维数组
        int [][] data = new int[4][4];

        //4.给二维数组添加数据
        //解法一
//        for (int i = 0; i < tempArr.length; i++) {
//            data[i / 4][i % 4] = tempArr[i];
//        }

        //解法二
        //遍历二维数组，给里面的每一个数据赋值(利用自增思想)
        //外循环：二维数组
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            //内循环data【i】表示一维数组
            for (int j = 0; j < data[i].length; j++) {
                //等号左边【i】【j】依次表示二维数组中的每一个位置
                //等号右边表示取值从哪来：从一维数组中来（利用索引取值）
                data[i][j] = tempArr[index];
                //每次赋值后index自增一次
                index++;
            }
        }
        //5.打印二维数组
        /*for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }*/
    }
}
