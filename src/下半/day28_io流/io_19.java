package 下半.day28_io流;

import java.io.FileWriter;
import java.io.IOException;

public class io_19 {
    public static void main(String[] args) throws IOException {
        //字符输出流:FileWriter
        //1.创建对象
        FileWriter fw = new FileWriter("Myfile\\aaa\\a.txt",true);

        //2.读取数据
        char[] chars = {'a','b','c','好'};
        fw.write(chars);

        //3.释放资源
        fw.close();
    }
}
