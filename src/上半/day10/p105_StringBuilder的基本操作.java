package 上半.day10;

public class p105_StringBuilder的基本操作 {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb = new StringBuilder("abc");

        //2.添加元素
        sb.append(1);
        sb.append(6.6);
        sb.append(true);

        //3.反转
        sb.reverse();

        //4.获取长度
        int len = sb.length();
        System.out.println(len);

        //5.再把StringBuilder变回字符串
        String str = sb.toString();
        System.out.println(str);


        System.out.println(sb);
    }
}
