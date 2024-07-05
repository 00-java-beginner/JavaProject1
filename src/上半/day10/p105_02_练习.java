package 上半.day10;

public class p105_02_练习 {
    public static void main(String[] args) {
        //1.定义数组
        int [] arr = {1,2,3};

        //2.调用方法将数组变为字符串
        String str = arrToString(arr);
        System.out.println(str);
    }
    public static String arrToString(int [] arr){
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
}
