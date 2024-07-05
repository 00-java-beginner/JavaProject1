package 下半.day24;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        //LinkedHashMap可以保证存取顺序一致
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();

        lhm.put("a",123);
        lhm.put("a",123);
        lhm.put("b",456);
        lhm.put("c",789);

        System.out.println(lhm);
    }
}
