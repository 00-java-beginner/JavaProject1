package 下半.day28_io流;

import java.io.FileOutputStream;
import java.io.IOException;

public class io_05 {
    public static void main(String[] args) throws IOException {
        //换行与续写
        /*
        换行写:
        再次写出一个换行符就可以了
        windows:\r\n
        Linux:  \n
        Mac :   \r
        细节:在windows操作系统当中，java对回车换行进行了优化。虽然完整的是\r\n，但是我们写其中一个\r或者\n,java也可以实现换行，因为java在底层会补全。
        建议:不要省略，还是写全了。

        续写：在创建对象时打开开关即可

        */

        //1.创建对象
        FileOutputStream fos = new FileOutputStream("E:\\JavaProject1\\Myfile\\aaa\\a.txt",true);
        //2.写出数据
        String str1 = "abd";
        byte[] bytes1 = str1.getBytes();
        fos.write(bytes1);

        //增加换行符
        String wrap = "\r\n";
        byte[] bytes2 = wrap.getBytes();
        fos.write(bytes2);

        String str2 = "666";
        byte[] bytes3 = str2.getBytes();
        fos.write(bytes3);

        //3.释放资源
    }
}
