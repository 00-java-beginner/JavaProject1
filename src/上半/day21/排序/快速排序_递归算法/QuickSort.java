package 上半.day21.排序.快速排序_递归算法;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

        quickSort(arr, 0, arr.length - 1);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void quickSort(int[] arr, int i, int j) {
        //定义两个变量记录要查找的范围
        //开始索引为0
        int start = i;
        //结束索引为数组长度-1
        int end = j;

        //给递归设置出口：只有当start大于end时，递归才会结束执行
        if (start > end) {
            return;
        }

        //记录基准数
        int baseNumber = arr[i];

        //利用循环找到要交换的数字（只有开始和结束索引不相等时才执行，相等时交换）
        while (start != end) {
            //1.利用end，从后往前找比基准数小的数字
            while (true) {
                //end <= start：表示此时start的索引在end索引的右边，代表最右边的数据已经全部循环判断完成
                //arr[end] < baseNumber：表示当前数组中的数字小于记录的基准数，此时就可以证明较小的数字已经在左边
                if (end <= start || arr[end] < baseNumber) {
                    break;
                }
                //当循环没有进入到if时，表示if的条件还不满足，此时还不能结束循环
                //由于end是从右边开始从后往前，所以需要每次自减一次，直到满足if时break结束循环
                end--;
            }
            //2.利用start，从前往后找比基准数大的数字
            while (true) {
                //end <= start：表示此时start的索引在end索引的右边，代表最右边的数据已经全部循环判断完成
                //arr[start] > baseNumber：表示当前数组中的数字大于记录的基准数，此时就可以证明较大的数字已经在右边
                if (end <= start || arr[start] > baseNumber) {
                    break;
                }
                //当循环没有进入到if时，表示if的条件还不满足，此时还不能结束循环
                //由于start是从左边开始从前往后，所以需要每次自增一次，直到满足if时break结束循环
                start++;
            }
            //3.把end和start执行的元素进行交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        //上面循环结束后表示start和end指向的元素是同一个，此时循环结束
        //表示已经找到了此时基准数应该存入数组中的位置
        //此时拿着开始的数字跟start和end其中一个进行交换即可（此时start和end指向的元素是同一个，不需要区分）
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        //确定6左边的范围，重复前面的操作
        //在这里i为一开始传递的值：0
        //j为start-1：表示交换后的数据，由于是索引需要-1结束
        quickSort(arr, i, start - 1);
        //确定6右边的范围，重复前面的操作
        //在这里i交换后的数据，由于start是基准数本身，所以需要+1开始
        //j为一开始传递的值：arr.length - 1
        quickSort(arr, start + 1, j);
    }
}
