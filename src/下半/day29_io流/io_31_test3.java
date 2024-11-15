package 下半.day29_io流;

import java.io.*;

public class io_31_test3 {
    public static void main(String[] args) throws IOException {
        //控制软件运行次数，只能免费三次
        //核心思想：利用计数器进行判断，由于是要控制软件运行，这里需要将计算器的值写入到本地文件中
        //          否则会导致每次运行时内存中的数据被清楚
        //1.创建对象
        //细节：在创建对象时不能把输入流和输出流一起创建，因为输出流在创建对象的时候会判断这个路径的文件是否有内容，如果有会清空
        //      清空后后面的代码就没有执行的意义了，所以在创建对象时需要遵守什么时候用什么时候创建
        BufferedReader br = new BufferedReader(new FileReader("E:\\JavaProject1\\Myfile\\aaa\\count.txt"));

        //2.读取文件中的数据
        String line = br.readLine();
        br.close();

        //3.将获取到的数据赋值给计算器
        int count = Integer.parseInt(line);
        count++;

        //4.判断次数
        if (count<=3){
            System.out.println("欢迎使用，剩余免费次数为："+count+"次");
        }else {
            System.out.println("免费次数已用完，请开通会员");
        }

        //5.写出数据到文件中
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\JavaProject1\\Myfile\\aaa\\count.txt"));
        //写出的时候需要注意加""才是字符串类型的数字，否则会变成ASCII码表对应的值
        bw.write(count + "");
        bw.close();
    }
}
