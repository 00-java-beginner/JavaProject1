package 上半.day21.排序.插入排序;

public class Insert {
    public static void main(String[] args) {
        //插入排序
        int[] arr = {1, 6, 8, 12, 4, 22, 55, 11, 18, 43, 99, 66, 100, 88};
        //1.找到无序的那一组的索引是从哪开始的
        //定义一个变量记录开始的索引
        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                //一但判断条件成立当前i索引右边的索引就是无序开始的索引，所以需要+1
                startIndex = i + 1;
                //得到无序开始的索引就没有必要继续循环判断了，直接结束即可
                break;
            }
        }
        //2.遍历数组，得到无序开始的索引后面的数据
        for (int i = startIndex; i < arr.length; i++) {
            //将遍历到的数据，插入到前面有序的这一组当中
            //定义一个变量记录i的值，由于交换位置需要倒序循环判断
            //如果不记录i的值，i的值会随着while判断的成立而发生变化
            int j = i;
            //思考：什么样的情况下需要交换位置
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
