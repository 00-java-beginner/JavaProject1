package 下半.day29_io流;

import java.io.*;

public class io_25 {
    public static void main(String[] args) throws IOException {
        //高级流：字节缓冲流 25-27
        //1.创建对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\JavaProject1\\Myfile\\aaa\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\JavaProject1\\Myfile\\aaa\\copy1.txt"));

        //2.拷贝数据
        //单个
        /*int b;
        while ((b = bis.read()) != -1){
            bos.write(b);
        }*/

        //多个
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }

        //3.释放资源
        bos.close();
        bis.close();
    }
}
