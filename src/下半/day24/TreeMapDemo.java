package 下半.day24;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        //1.按照id降序或者升序
        //默认升序，通过继续可以利用Comparator方法重写compare来实现
        TreeMap<Integer, String> tm = new TreeMap<>();
        //TreeMap<Integer, String> tm = new TreeMap<>((o1, o2) -> o2 - o1);

        tm.put(1, "奥利奥");
        tm.put(2, "康师傅");
        tm.put(3, "老坛");

        System.out.println(tm);
    }
}
