package 下半.day24;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map遍历的第二种方式 {
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<>();

        m.put("郭靖", "黄蓉");
        m.put("韦小宝","沐剑屏");
        m.put("尹志平","小龙女");

        //获取所有的键值对对象，返回集合
        Set<Map.Entry<String, String>> entries = m.entrySet();
        //遍历集合，得到里面的每一个键值对对象
        for (Map.Entry<String, String> entry : entries) {
            //分别调用方法获取键值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }

    }
}
