package 上半.day21.Lambda;

import java.util.Arrays;

public class LambdaTest {
    public static void main(String[] args) {
        /*定义数组并存储一些字符串，利用Arrays中的sort方法进行排序要求:
        按照字符串的长度进行排序，短的在前面，长的在后面。*/

        String[] arr = {"a", "aaaa", "aaa", "aa"};
        Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());

        System.out.println(Arrays.toString(arr));
    }
}
