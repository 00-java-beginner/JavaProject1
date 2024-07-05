package 上半.day9.p96andp110_字符串;

public class p109_调整字符串的内容并比较 {
    public static void main(String[] args) {
        //1.定义两个字符串
        String str1 = "abcde";
        String str2 = "cdeab";

        //2.调用方法旋转字符串
        boolean result = check(str1, str2);

        //3.输出
        System.out.println(result);
    }
    //定义一个方法旋转字符串
    //行参：旋转前的字符串
    //返回值：旋转后的字符串
    public static String rotate(String str) {
        //第一种方法：用substring进行截取，把左边的截取后拼接到右侧
        //获取最左边的
        char first = str.charAt(0);
        //获取剩下的
        String end = str.substring(1);
        //进行拼接并返回
        return end + first;
    }
    //定义一个方法进行循环旋转并比较
    public static boolean check(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            //1.进行旋转
            str1 = rotate1(str1);
            //2.进行比较
            if (str1.equals(str2)) {
                return true;
            }
        }
        return false;
    }
    public static String rotate1(String str) {
        //第二种方法：把字符串先变成一个数组，然后调整数组中的数据，再把他变成一个字符串
        char[] arr = str.toCharArray();
        //1.拿到0索引的值
        char first = arr[0];
        //2.把剩余字符往前挪一位
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        //3.把原来的索引放到最后
        arr[arr.length - 1] = first;

        //4.将数组转换成字符串
        String result = new String(arr);
        return result;
    }
}
