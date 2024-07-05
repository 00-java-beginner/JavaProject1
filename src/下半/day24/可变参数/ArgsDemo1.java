package 下半.day24.可变参数;

public class ArgsDemo1 {
    public static void main(String[] args) {
        //需求:定义一个方法利用二分查找，查询某个元素在数组中的索引
        int[] arr = {10, 44, 88, 101, 155, 200, 388, 418};
        System.out.println(binarySearch(arr, 155));
    }
    public static int binarySearch(int[] arr, int number) {
        //表示要查找的范围
        int max = arr.length - 1;
        int min = 0;
        while (true){
            //当min>max时，表示当前数组中没有这个数字，直接返回-1
            if (min > max){
                return -1;
            }
            //mid是在中间范围
            int mid = (max + min) / 2;
            //拿着mid指向的元素跟要查找的元素进行比较
            if (arr[mid] > number){
                //1.number在mid的左边
                max = mid - 1;
            }else if (arr[mid] < number){
                //2.number在mid的右边
                min = mid + 1;
            }else{
                //3.number跟mid指向的元素一致
                return mid;
            }
        }
    }
}
