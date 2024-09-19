package 下半.day26_Stream流和方法引用.stream流test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 数据过滤 {
    public static void main(String[] args) {
        //定义一个集合，添加一些数据
        //过滤奇数留下偶数并将结果保存
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
        List<Integer> list1 = list.stream().filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(list1);
    }
}
