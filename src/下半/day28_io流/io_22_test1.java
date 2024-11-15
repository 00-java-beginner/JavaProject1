package 下半.day28_io流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class io_22_test1 {
    public static void main(String[] args) throws IOException {
        //拷贝文件，需要考虑子文件
        //1.创建对象表示数据源
        File src = new File("E:\\JavaProject1\\Myfile");

        //2.创建对象表示目的地
        File dest = new File("E:\\JavaProject1\\dest");

        //3.调用方法执行拷贝
        copydir(src, dest);
    }

    //方法的作用：拷贝文件夹  核心思想：递归
    //参数一：数据源   参数二：目的地
    private static void copydir(File src, File dest) throws IOException {
        dest.mkdirs();
        //1.进入数据源，获取到全部数据
        File[] files = src.listFiles();
        //2.遍历数组
        for (File file : files) {
            //3.判断是否文件，是拷贝，不是递归
            if (file.isFile()){
                //是文件，拷贝
                FileInputStream fis = new FileInputStream(file); //创建字节输入流对象  文件开始是这个数组
                FileOutputStream fos = new FileOutputStream(new File(dest,file.getName())); //创建字节输出流对象  文件结束是新创建的文件夹，并且得到文件开始的数组中的文件名
                byte[] bytes = new byte[1024]; //创建一个数组用于加快读取
                int len; //定义一个变量接收读取到的数据
                //利用循环将读取到的数据写入
                while ((len = fis.read(bytes)) != -1){
                    //写入时从0开始写，一直写入到等于len为止
                    fos.write(bytes,0,len);
                }
                //先开的后关，后开的先关
                fos.close();
                fis.close();
            }else {
                //不是文件，递归
                copydir(file,new File(dest,file.getName()));
            }
        }

    }
}
