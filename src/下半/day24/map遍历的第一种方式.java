package 下半.day24;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class map遍历的第一种方式 {
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<>();

        m.put("郭靖", "黄蓉");
        m.put("韦小宝","沐剑屏");
        m.put("尹志平","小龙女");

        //需要先获取key，将key全部放入集合中
        Set<String> keys = m.keySet();

        //利用增强for循环获取所有key
        for (String key : keys) {
            String value = m.get(key);
            System.out.println(key + " = " + value);
        }
        //利用迭代器
        Iterator<String> it = keys.iterator();
        while (it.hasNext()){
            String key = it.next();
            String value = m.get(key);
            System.out.println(key + " = " + value);
        }
        //利用lambda表达式
        keys.forEach(key -> {
                    String value = m.get(key);
                    System.out.println(key + " = " + value);
                }
        );
    }
}
