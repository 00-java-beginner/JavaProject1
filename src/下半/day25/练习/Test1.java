package 下半.day25.练习;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"小明","小红","小白","小黄","小黑","小绿","小蓝","小青","小紫","小橘");

        Collections.shuffle(list);
        String name = list.get(0);
        System.out.println(name);
    }
}
