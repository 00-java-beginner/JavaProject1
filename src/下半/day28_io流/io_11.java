package 下半.day28_io流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class io_11 {
    public static void main(String[] args) throws FileNotFoundException {
        //利用try...catch...finally捕获拷贝代码中出现的异常
        //1.创建对象  由于创建对象放在try中会变成局部变量导致其他地方无法使用 所以需要在外部创建
        //但是创建时需要注意，需要对他进行初始化  否则会在编译时报错
        /*FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //1.创建对象
            fis = new FileInputStream("E:\\JavaProject1\\Myfile\\aaa\\a.txt");
            fos = new FileOutputStream("E:\\JavaProject1\\Myfile\\aaa\\b.txt");

            //2.拷贝
            int len;
            byte[] bytes = new byte[1024 * 1024 * 5];
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //3.释放资源  规则：先开的最后关闭
            //注意：这里需要对两个变量进行非空判断，因为在try中创建对象时如果路径是错的或者空
            //      在这里就会用null去调用close方法，这样会导致空指针异常
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }*/

        /*//jdk7：io流捕获异常的方法
        try(FileInputStream fis = new FileInputStream("E:\\JavaProject1\\Myfile\\aaa\\a.txt");
            FileOutputStream fos = new FileOutputStream("E:\\JavaProject1\\Myfile\\aaa\\b.txt");){
            //2.拷贝
            int len;
            byte[] bytes = new byte[1024 * 1024 * 5];
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }*/

        //jdk9：io流捕获异常的方法
        FileInputStream fis = new FileInputStream("E:\\JavaProject1\\Myfile\\aaa\\a.txt");
        FileOutputStream fos = new FileOutputStream("E:\\JavaProject1\\Myfile\\aaa\\b.txt");
        try(fis;fos){
            //2.拷贝
            int len;
            byte[] bytes = new byte[1024 * 1024 * 5];
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
