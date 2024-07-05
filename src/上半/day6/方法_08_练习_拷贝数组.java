package 上半.day6;

public class 方法_08_练习_拷贝数组 {
    public static void main(String[] args) {
        //1.定义一个数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //2.调用方法
        int[] copyarr = copyofrange(arr, 3, 7);

        //循环遍历
        for (int i = 0; i < copyarr.length; i++) {
            System.out.print(copyarr[i] + " ");
        }
    }

    public static int[] copyofrange(int[] arr, int form, int to) {
        //2.定义一个新的数组
        int[] newarr = new int[to - form];

        //3.循环遍历将第一个数组中的内容copy到新数组中
        //定义一个临时变量用来伪造索引
        int index = 0;
        for (int i = form; i < to; i++) {
            //4.将取出来的数据赋值给新数组
            newarr[index] = arr[i];
            index++;
        }
        //5.返回新数组
        return newarr;
    }
}
