package 上半.day21.Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Lambda1 {
    public static void main(String[] args) {
        Integer[] arr = {2, 3, 5, 7, 9, 11, 23, 768, 8, 14};
        /*
        Lambda表达式的注意点:
        1.Lambda表达式可以用来简化匿名内部类的书写
        2.Lambda表达式只能简化函数式接口的匿名内部类的写法
        3.函数式接口:
            有且仅有一个抽象方法的接口叫做函数式接口，接口上方可以加@FunctionalInterface注解
        */

        /*
        1.利用匿名内部类的形式去调用下面的方法
        调用一个方法的时候，如果方法的形参是一个接口，那么我们要传递这个接口的实现类对象
        如果实现类对象只要用到一次，就可以用匿名内部类的形式进行书写
        */
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        //Lambda完整格式
        Arrays.sort(arr, (Integer o1, Integer o2) -> {
                    return o1 - o2;
                }
        );

        //Lambda省略格式
        Arrays.sort(arr, (o1, o2) -> o1 - o2);

        System.out.println(Arrays.toString(arr));
    }
}
