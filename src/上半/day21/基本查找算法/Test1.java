package 上半.day21.基本查找算法;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        /*课堂练习1:
          需求:定义一个方法利用基本查找，查询某个元素在数组中的索引
          要求:不需要考虑数组中元素是否重复
        */
        int [] arr1 = {1,2,3,4,5,6,1,8};
        int number1 = 1;
        System.out.println(basicSearch1(arr1, number1));


        /*课堂练习2:
          需求:定义一个方法利用基本查找，查询某个元素在数组中的索引
          要求:需要考虑数组中元素有重复的可能性
        */
        int [] arr2 = {1,2,3,4,5,6,1,8};
        int number2 = 1;
        System.out.println(basicSearch2(arr2, number2));
    }


    //1.查询某个元素在数组中的索引（不需要考虑数组中元素有重复的可能性）
    public static int basicSearch1(int [] arr , int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                return i;
            }
        }
        return -1;
    }

    //2.查询某个元素在数组中的索引（需要考虑数组中元素有重复的可能性）
    //注意：返回多个时可以将数据放到列表或者集合中在进行返回
    public static List<Integer> basicSearch2(int [] arr , int number){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                list.add(i);
            }
        }
        return list;
    }
}
