package 上半.day12;

import java.util.ArrayList;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        System.out.println(getCode());
    }
    private static String getCode(){
        //1.创建一个集合添加所有的大小写字母
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            //利用ascii码表的特性添加，强转为字符形式
            list.add((char)('a' + i));
            list.add((char)('A' + i));
        }
        //2.随机抽取四个
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            char c = list.get(index);
            sb.append(c);

        }
        //3.把一个随机数字添加到末尾
        int Number = r.nextInt(10);
        sb.append(Number);
        //先将字符串转换成数组
        char[] arr = sb.toString().toCharArray();
        //定义一个随机索引进行交换
        int randomIndex = r.nextInt(arr.length);
        char temp = arr[randomIndex];
        //将随机索引跟最大索引进行交换
        arr[randomIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        return new String(arr);
    }


}
