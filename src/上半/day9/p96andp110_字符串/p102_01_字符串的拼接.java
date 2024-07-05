package 上半.day9.p96andp110_字符串;

public class p102_01_字符串的拼接 {
    public static void main(String[] args) {
        //定义一个方法,把int数组中的数据按照指定的格式拼接成一个字符串返回,
        //调用该方法,并在控制台输出结果。
        int [] arr = {1,2,3};
        String str = arrToString(arr);
        System.out.println(str);
    }
    public static String arrToString(int[] arr){
        //1.先进行校验
        if (arr == null){
            return "";
        }
        if (arr.length == 0){
            return "[]";
        }
        //2.遍历数组，获取数组中的元素
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                result = result + arr[i];
            }else {
                result = result + arr[i] + ",";
            }
        }
        result = result + "]";
        return result;
    }
}
