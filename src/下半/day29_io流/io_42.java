package 下半.day29_io流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class io_42 {
    public static void main(String[] args)throws IOException {
        //压缩流，压缩文件夹
        //1.创建需要压缩的对象
        File src = new File("E:\\JavaProject1\\Myfile");
        //2.创建压缩目的地的父级路径的对象
        File destParent = src.getParentFile();
        //3.创建压缩包路径的对象
        //参数一：表示压缩包最后放在哪的路径
        //参数二：表示压缩包的名字是什么，一般与被压缩的文件或者文件夹保持一致，所以只需要拼接上对应的后缀名即可
        File dest = new File(destParent,src.getName()+".zip");
        //4.创建压缩流关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
        //5.获取src里面的每一个文件，变成ZipEntry对象，并放入到压缩包当中
        //src.getName()：调用的时候进行传参，将当前路径的名字传入到方法中
        toZip(src,zos,src.getName());
        //6.关闭资源
        zos.close();
    }
    //作用：获取src里面的每一个文件，变成ZipEntry对象，并放入到压缩包当中
    //参数一：数据源
    //参数二：压缩流
    //参数三：压缩包内部的路径
    private static void toZip(File src, ZipOutputStream zos, String name) throws IOException {
        //1.进入src文件夹
        File[] files = src.listFiles();
        //2.遍历数组
        for (File file : files) {
            if (file.isFile()){
                //文件：变成ZipEntry对象，并放入到压缩包当中
                //1.创建ZipEntry对象
                //name + "\\" + file.getName()：表示这个对象的路径
                //name：表示传入的路径名称，等于src.getName()
                //"\\"：表示拼接的盘符
                //file.getName()：表示当前文件的名称
                ZipEntry entry = new ZipEntry(name + "\\" + file.getName());
                //2.放到压缩包当中
                zos.putNextEntry(entry);
                //3.创建获取数据的对象
                FileInputStream fis = new FileInputStream(file);
                int b;
                while ((b = fis.read()) != -1){
                    zos.write(b);
                }
                //4.释放资源
                fis.close();
                zos.closeEntry();
            }else {
                //文件夹：执行递归
                toZip(file,zos,name + "\\" + file.getName());
            }
        }
    }
}
