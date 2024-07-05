package 上半.day21.Arrays;

import java.util.Arrays;

public class MyArrays1 {
    public static void main(String[] args) {
        //1.toString：将数组变成字符串
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr1));

        //2.binarySearch：二分查找法
        //细节1:二分查找的前提:数组中的元素必须是有序，数组中的元素必须是升序的
        //细节2:如果要查找的元素是存在的，那么返回的是真实的索引
        //但是，如果要查找的元素是不存在的，返回的是-插入点-1/:为什么要减1呢?
        //解释:如果此时，我现在要查找数字0，那么如果返回的值是-插入点，就会出现问题了。
        //如果要查找数字0，此时0是不存在的，但是按照上面的规则-插入点，应该就是-0
        //为了避免这样的情况，Java在这个基础上又减一。
        System.out.println(Arrays.binarySearch(arr1, 10));

        //3.copyOf：拷贝数组
        //参数一:老数组
        //参数二:新数组的长度
        //方法的底层会根据第二个参数来创建新的数组
        //如果新数组的长度是小于老数组的长度，会部分拷贝
        //如果新数组的长度是等于老数组的长度，会完全拷贝
        //如果新数组的长度是大于老数组的长度，会补上默认初始值
        int [] newArr1 = Arrays.copyOf(arr1,10);
        System.out.println(Arrays.toString(newArr1));

        //4.copyOfRange：拷贝数组（指定范围）
        //细节：包左不包右，包头不包尾
        int [] newArr2 = Arrays.copyOfRange(arr1,0,9);
        System.out.println(Arrays.toString(newArr2));

        //5.fill：填充数组
        Arrays.fill(arr1,100);
        System.out.println(Arrays.toString(arr1));

        //6.sort：排序，默认情况下，给基本数据类型进行升序排序,底层使用的是快速排序
        int[] arr2 = {11, 2, 3, 8, 5, 6, 7, 8, 9, 10};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
