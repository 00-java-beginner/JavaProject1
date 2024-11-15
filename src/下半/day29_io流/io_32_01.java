package 下半.day29_io流;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class io_32_01 {
    public static void main(String[] args) throws IOException {
        //转换流
        //利用转换流按照指定的字符编码读取数据
        //仅作了解
        /*//1.创建对象
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\JavaProject1\\Myfile\\aaa\\gbkfile.txt"),"GBK");
        //2.获取数据
        int ch;
        while ((ch = isr.read()) !=-1){
            System.out.print((char)ch);
        }
        //3.释放资源
        isr.close();*/

        //需要掌握
        //1.创建对象
        FileReader fr = new FileReader("E:\\JavaProject1\\Myfile\\aaa\\gbkfile.txt", Charset.forName("GBK"));

        //2.获取数据
        int ch;
        while ((ch = fr.read()) !=-1){
            System.out.print((char)ch);
        }
        //3.释放资源
        fr.close();
    }

}
