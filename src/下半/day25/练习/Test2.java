package 下半.day25.练习;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        //概率问题，要求男生7，女生3
        //1.定义数组存储概率
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,1);
        Collections.addAll(list,0,0,0);

        //2.利用随机数获取数组中的随机数据
        Random r = new Random();
        int index = r.nextInt(list.size());
        int number = list.get(index);

        //3.创建数组存储对应的数据
        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();
        Collections.addAll(boyList,"范建","范闲","范病","范赌","范毒","宋河饭","梅心肺");
        Collections.addAll(girlList,"小龙女","王语嫣","黄蓉","小医仙");

        //4.判断number的数据是1还是0，输出不同的结果
        if (number == 1){
            int boyIndex = r.nextInt(boyList.size());
            String name = boyList.get(boyIndex);
            System.out.println(name);
        }else {
            int girlIndex = r.nextInt(girlList.size());
            String name = girlList.get(girlIndex);
            System.out.println(name);
        }
    }
}
