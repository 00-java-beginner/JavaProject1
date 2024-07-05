package 上半.day11;

import java.util.ArrayList;

public class p111_集合的基本使用 {
    public static void main(String[] args) {
        //1.创建集合的对象
        ArrayList<String> list = new ArrayList<>();

        //2.添加元素
        list.add("aaa");
        list.add("bbb");

        //3.删除元素
//        list.remove("aaa");
//        list.remove(0);

        //4.修改元素
        list.set(0,"ccc");

        //5.查询元素
        String s = list.get(0);

        //6.遍历
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }

    }
}
