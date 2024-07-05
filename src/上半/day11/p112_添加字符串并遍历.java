package 上半.day11;

import java.util.ArrayList;

public class p112_添加字符串并遍历 {
    public static void main(String[] args) {
        //创建一个集合，添加字符串并遍历
        //1.创建集合
        ArrayList<String> list = new ArrayList<>();
        //2.添加元素
        list.add("吃饭");
        list.add("睡觉");
        list.add("打豆豆");
        //3.遍历集合
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1){
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.println("]");
    }
}
