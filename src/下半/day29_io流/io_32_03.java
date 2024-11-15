package 下半.day29_io流;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class io_32_03 {
    public static void main(String[] args) throws IOException {
        //将本地文件中的GBK文件转换成UTF-8
        //1.创建读取对象
        FileReader fr = new FileReader("E:\\JavaProject1\\Myfile\\aaa\\gbkfile.txt", Charset.forName("GBK"));
        //2.读取数据
        int ch;
        //3.创建写入对象
        FileWriter fw = new FileWriter("E:\\JavaProject1\\Myfile\\aaa\\c.txt",Charset.forName("UTF-8"));
        while ((ch = fr.read()) != -1){
            fw.write(ch);
        }
        //4.释放资源
        fw.close();
        fr.close();


    }
}
