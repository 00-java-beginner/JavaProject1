package 下半.day29_io流;

import java.io.*;

public class io_28 {
    public static void main(String[] args) throws IOException {
        //高级流：字符缓冲流
        //1.创建对象
        BufferedReader br = new BufferedReader(new FileReader("Myfile\\aaa\\a.txt"));//输入
        BufferedWriter bw = new BufferedWriter(new FileWriter("Myfile\\aaa\\c.txt"));//输出

        //2.获取内容
        //单行
        /*String line1 = br.readLine();
        System.out.println(line1);*/

        //多行
        /*String line2;
        while (((line2 = br.readLine()) != null)){
            System.out.println(line2);
        }*/

        bw.write("哈哈哈哈哈");
        bw.newLine();

        //3.释放资源
        //br.close();
        bw.close();
    }
}
