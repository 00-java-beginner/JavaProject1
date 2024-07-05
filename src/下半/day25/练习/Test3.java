package 下半.day25.练习;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        //要求，被抽到的名字不在被抽到，同时所有的都抽过一遍后需要开启第二轮
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"范建","范闲","范病","范赌","范毒","宋河饭","梅心肺","何凯水","何热水","吃冰");
        //定义一个变量记录数组的长度，防止在循环过程中数组长度发生变化
        int size = list.size();
        //定义一个临时数组存储被删除的数据
        ArrayList<String> list2 = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
            //利用循环得到数组中所有的数据
            for (int j = 0; j < size; j++) {
                int index = r.nextInt(list.size());
                //将获取到的数据提取出来
                String name = list.get(index);
                //将抽到的数据进行删除
                list.remove(name);
                //删除后的数据添加到临时数组中
                list2.add(name);
                System.out.println(name);
            }
            //循环结束后将临时数组中的数据重新存储到数组中
            list.addAll(list2);
            //清空临时数组的数据
            list2.clear();
        }

    }
}
