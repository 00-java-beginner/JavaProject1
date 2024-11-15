package 下半.day29_io流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class io_40 {
    public static void main(String[] args) throws IOException {
        //解压缩流
        //1.创建需要解压的对象
        File src = new File("E:\\JavaProject1\\Myfile.zip");
        //2.创建解压目的地的对象
        File dest = new File("E:\\JavaProject1");
        //3.调用方法
        unzip(src, dest);

    }

    private static void unzip(File src, File dest) throws IOException {
        //解压的本质：把压缩包里面的每一个文件或者文件夹读取出来，按照层级拷贝到目的地当中
        //1.创建一个解压缩流用来读取压缩包中的数据
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));

        //2.获取到压缩包中的每一个zipentry对象
        ZipEntry entry;
        while ((entry = zip.getNextEntry()) != null) {
            System.out.println(entry);
            if (entry.isDirectory()){
                //文件夹:需要在目的地dest处创建一个相同的文件夹
                File file = new File(dest,entry.toString());
                file.mkdirs();
            }else {
                //文件：需要读取文件的数据并存放到目的地dest文件夹当中
                //3.创建输出流的对象
                FileOutputStream fos = new FileOutputStream(new File(dest,entry.toString()));
                int b;
                byte[] bytes = new byte[8192];
                while ((b = zip.read(bytes)) != -1){
                    fos.write(b);
                }
                fos.close();
                //表示一个文件夹处理完了进行关闭
                zip.closeEntry();
            }
        }
        zip.close();
    }
}
