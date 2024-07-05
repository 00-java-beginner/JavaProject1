package 下半.day24;

import java.util.StringJoiner;
import java.util.TreeMap;

public class Test4 {
    public static void main(String[] args) {
        //定义一个字符串，统计每个字母出现的次数
        String str = "ababcddddcccaaa";

        TreeMap<Character, Integer> tm = new TreeMap<>();

        //遍历字符串，得到每一个字符
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //存在，表示当前字符又出现了一次
            if (tm.containsKey(c)) {
                int count = tm.get(c);
                count++;
                tm.put(c, count);
                //不存在，表示当前字符第一次出现
            } else {
                tm.put(c, 1);
            }
        }
        //分别用两种方式拼接字符串
        StringBuilder sb = new StringBuilder();
        tm.forEach((key, value) -> sb.append(key).append("(").append(value).append(") "));
        System.out.println(sb);

        StringJoiner sj = new StringJoiner("", "", "");
        tm.forEach((key, value) -> sj.add(key + "").add("(").add(value + "").add(") "));
        System.out.println(sj);
    }
}
