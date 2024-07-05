package 下半.day24;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        /*某个班级80名学生，现在需要组成秋游活动，
        班长提供了四个景点依次是(A、B、C、D)每个学生只能选择一个景点，
        请统计出最终哪个景点想去的人数最多。*/
        //1.需要让同学先投票
        //定义一个数组，存储四个景点
        String[] arr = {"a", "b", "c", "d"};
        //利用随机数模拟80个同学投票，并将结果存储起来
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            //利用索引获取到对应的景点名称
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }
        HashMap<String, Integer> hm = new HashMap<>();
        //2.利用循环将投票的数据添加到集合中
        for (String name : list) {
            if (hm.containsKey(name)) {
                //定义一个临时变量记录当前key对应的值
                int count = hm.get(name);
                //每次覆盖后进入if都需要自增一次
                count++;
                //将自增后变量的值重新赋值给集合
                hm.put(name, count);
            } else {
                //如果不存在，添加第一个
                hm.put(name, 1);
            }
        }
        System.out.println(hm);

        //3.统计去哪个景点的人最多
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            //定义一个临时变量记录当前的最大值
            int count = entry.getValue();
            if (count > max) {
                max = count;
            }
        }
        //4.进行比较获取投票人数最多的景点
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if (count == max) {
                System.out.println(entry.getKey());
            }
        }
    }
}
