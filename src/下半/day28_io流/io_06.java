package 下半.day28_io流;

import java.io.FileInputStream;
import java.io.IOException;

public class io_06 {
    public static void main(String[] args) throws IOException {
        //06-08
        //字节输入流：FileInputStream
        //实现：读取文件中的数据
        //实现步骤：1.创建对象  2.读取数据  3.释放资源
        /*
        字节输入流的细节:
        1.创建字节输入流对象
            细节1:如果文件不存在，就直接报错。
            Java为什么会这么设计呢?
            输出流:不存在，创建
                把数据写到文件当中

            输入流:不存在，而是报错呢?
                因为创建出来的文件是没有数据的，没有任何意义。
                所以Java就没有设计这种无意义的逻辑，文件不存在直接报错

            程序中最重要的是:数据。
        2.写数据
            细节1:一次读一个字节，读出来的是数据在ASCII上对应的数字
            细节2:读到文件末尾了，read方法返回-1。

        3.释放资源
            细节:每次使用完流之后都要释放资源
        */
        //1.创建对象
        FileInputStream fis = new FileInputStream("E:\\JavaProject1\\Myfile\\aaa\\a.txt");

        //2.读取数据
//        int read = fis.read();
//        System.out.println((char)read);

        //循环读取
        //细节：这里必须定义第三方变量记录每一次循环得到的值，否则循环的方法体中再去调用read方法时会将上一次的值覆盖
        //      因为read在底层是利用指针，调用一次往右移动一次，如果一次循环调用两次那么会丢失数据
        int b ;
        while ((b = fis.read()) != -1){
            System.out.println((char)b);
        }

        //3.释放资源
        fis.close();
    }
}
