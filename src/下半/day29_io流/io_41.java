package 下半.day29_io流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class io_41 {
    public static void main(String[] args) throws IOException {
        //压缩流，压缩单个文件
        //1.创建对象表示需要压缩的文件
        File src = new File("E:\\JavaProject1\\Myfile\\aaa\\csb.txt");
        //2.创建对象表示压缩后文件存放的位置
        File dest = new File("E:\\JavaProject1\\Myfile\\aaa");
        //3.调用方法
        tozip(src,dest);
    }

    private static void tozip(File src, File dest) throws IOException {
        //1.创建压缩流并关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest,"csb.zip")));
        //2.创建ZipEntry对象，表示压缩包中的文件或者文件夹
        ZipEntry entry = new ZipEntry("csb.txt");
        //3.把ZipEntry对象放到压缩包当中
        zos.putNextEntry(entry);
        //4.将文件中的数据写入到压缩包当中
        FileInputStream fis = new FileInputStream(src);
        int b;
        while ((b = fis.read()) !=-1){
            zos.write(b);
        }
        fis.close();
        zos.closeEntry();
        zos.close();
    }
}
