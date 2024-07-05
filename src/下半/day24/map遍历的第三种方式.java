package 下半.day24;

import java.util.HashMap;
import java.util.Map;

public class map遍历的第三种方式 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        m.put("郭靖", "黄蓉");
        m.put("韦小宝", "沐剑屏");
        m.put("尹志平", "小龙女");

        m.forEach((key, value) -> System.out.println(key + " = " + value));
    }
}
