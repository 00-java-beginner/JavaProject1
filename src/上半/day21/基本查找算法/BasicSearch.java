package 上半.day21.基本查找算法;

public class BasicSearch {
    public static void main(String[] args) {
        //需求：定义一个方法利用基本从查找，查询某个元素是否存在
        int [] arr = {1,2,3,4,5,6,7,8};
        System.out.println(basicSearch(arr, 111));
    }
    public static boolean basicSearch(int [] arr , int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                return true;
            }
        }
        return false;
    }
}
