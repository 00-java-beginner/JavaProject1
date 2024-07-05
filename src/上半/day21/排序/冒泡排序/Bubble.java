package 上半.day21.排序.冒泡排序;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 4};
        //外循环：表示需要执行多少轮，如果有n个数据，那么执行n-1轮
        for (int i = 0; i < arr.length - 1; i++) {
            //内循环：表示每一轮中如何比较数据并找到最大值
            //-1:防止索引越界
            //-i:提高效率，已经比较过的可以减去对应的轮数
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i);
        }
    }
}
