package 上半.day10;

public class p110_test4 {
    public static void main(String[] args) {
        //定义一个字符串，由若干单词组成，返回字符串中最后一个单词的长度
        String str = "Hello World";
        char[] arr = str.toCharArray();
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == ' '){
                break;
            }else {
                count++;
            }
        }
        System.out.println(count);


    }
}
