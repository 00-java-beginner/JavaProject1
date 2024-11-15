package 下半.day28_io流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class io_09 {
    public static void main(String[] args) throws IOException {
        //09,11
        /*
        练习:
            文件拷贝
            把D:\itheima\movie.mp4拷贝到当前模块下。
        */

        long start = System.currentTimeMillis();

        //1.创建对象
        FileInputStream fis = new FileInputStream("E:\\JavaProject1\\Myfile\\aaa\\a.txt");
        FileOutputStream fos = new FileOutputStream("E:\\JavaProject1\\Myfile\\aaa\\b.txt");

        //2.拷贝  核心思想：边写边读
        //小文件  时间：15
//        int b;
//        while ((b = fis.read()) != -1) {
//            fos.write(b);
//        }

        //大文件
        int len;
        //一般一次循环都拷贝5m
        byte[] bytes = new byte[1024 * 1024 * 5];
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes,0,len);
        }
        //3.释放资源  规则：先开的最后关闭
        fos.close();
        fis.close();

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
