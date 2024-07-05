package 上半.day7;

public class 二维数组_动态初始化 {
    public static void main(String[] args) {
        //1.创建数组
        //3表示可以放几个一维数组，5表示一维数组里面可以装几个元素
        int[][] arr = new int [3][5];
        //2.给二维数组赋值
        arr[0][0] = 10;
        //3.遍历二维数组
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
