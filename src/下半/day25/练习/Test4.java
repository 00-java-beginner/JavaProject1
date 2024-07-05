package 下半.day25.练习;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        //集合嵌套
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        ArrayList<String> city1 = new ArrayList<>();
        ArrayList<String> city2 = new ArrayList<>();
        Collections.addAll(city1,"杭州市","温州市","嘉兴市","湖州市","丽水市");
        Collections.addAll(city2,"广州市","深圳市","佛山市","汕头市","汕尾市");

        hm.put("浙江省",city1);
        hm.put("广东省",city2);

        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            StringJoiner sj = new StringJoiner(",","","");
            for (String city : value) {
                sj.add(city);
            }
            System.out.println(key + " = " + sj);
        }
    }
}
