package 上半.day10;

import java.util.StringJoiner;

public class p106_Stringjoiner {
    public static void main(String[] args) {
        //1.创建一个对象，并制定中间分隔符
        //StringJoiner sj = new StringJoiner("---");
        StringJoiner sj = new StringJoiner(",","[","]");

        //2.添加元素
        sj.add("aaa").add("bbb").add("ccc");

        int len = sj.length();
        System.out.println(len);

        String str = sj.toString();
        System.out.println(str);
        //3.打印结果
        System.out.println(sj);

    }
}
