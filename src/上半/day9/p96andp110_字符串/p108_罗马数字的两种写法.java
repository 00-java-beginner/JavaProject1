package 上半.day9.p96andp110_字符串;

import java.util.Scanner;
import java.util.StringJoiner;

public class p108_罗马数字的两种写法 {
    public static void main(String[] args) {
        //1.键盘录入一个字符串，长度小于9，只能是数字
        Scanner sc = new Scanner(System.in);
        String str;
        while (true){
            System.out.println("请输入一个数字");
            str = sc.next();
            boolean flag = checkStr(str);
            if (flag){
                break;
            }else {
                System.out.println("当前输入的字符串非法，请重新输入");
            }
        }
        StringJoiner sb = new StringJoiner("");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int number = c - 48;
            String s = changLuoMa(number);
            if (number == str.length()){
                sb.add(s);
            }else {
                sb.add(s).add(",");
            }
        }
        System.out.println(sb);
    }
    //定义一个方法对录入的字符串进行校验
    public static boolean checkStr(String str){
        if (str.length() > 9){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            //表示把循环里面的每一个元素取出来
            char c = str.charAt(i);
            if (c < '0' || c > '9'){
                return false;
            }
        }
        //注意：只有当循环结束后才能返回true
        return true;
    }
    //定义一个方法让索引跟罗马数字产生关系
    public static String changLuoMa(int number){
        //由于罗马数字没有0，所以需要将索引与数字关联起来就需要将0索引变成一个空的字符串
        String [] arr = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        return arr[number];
    }
    //利用switch进行匹配
    public static String changLuoMa1(char number){
        String str = switch (number){
            case '0' -> "";
            case '1' -> "Ⅰ";
            case '2' -> "Ⅱ";
            case '3' -> "Ⅲ";
            case '4' -> "Ⅳ";
            case '5' -> "Ⅴ";
            case '6' -> "Ⅵ";
            case '7' -> "Ⅶ";
            case '8' -> "Ⅷ";
            case '9' -> "Ⅸ";
            default -> str = "";
        };
        return str;
    }
}
