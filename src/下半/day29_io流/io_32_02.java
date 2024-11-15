package 下半.day29_io流;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class io_32_02 {
    public static void main(String[] args) throws IOException {
        //转换流
        //利用转换流按照指定的字符编码写出数据
        //仅作了解
        /*//1.创建对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\JavaProject1\\Myfile\\aaa\\b.txt"),"GBK");
        //2.写出数据
        osw.write("你好Java");
        //3.释放资源
        osw.close();*/

        //需要掌握
        //1.创建对象
        FileWriter fw = new FileWriter("E:\\JavaProject1\\Myfile\\aaa\\c.txt", Charset.forName("GBK"));
        //2.写出数据
        fw.write("你好Java");
        //3.释放资源
        fw.close();
    }
}
