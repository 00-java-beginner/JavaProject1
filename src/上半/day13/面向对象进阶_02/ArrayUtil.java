package 上半.day13.面向对象进阶_02;

public class ArrayUtil {
    private ArrayUtil(){};
    //对数组进行拼接
    public static String printArr(int [] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    //求平均分
    public static double getAvg(double [] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        return sum / arr.length;
    }
}
