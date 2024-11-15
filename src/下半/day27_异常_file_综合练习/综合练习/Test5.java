package 下半.day27_异常_file_综合练习.综合练习;

import java.io.File;

public class Test5 {
    public static void main(String[] args) {
        //统计一个文件的总大小
        File file = new File("E:\\JavaProject1\\Myfile");
        long len = getLen(file);
        System.out.println(len);
    }
    //定义一个方法统计文件总大小
    public static long getLen(File file){
        //1.定义变量进行累加
        long len = 0;
        //2.进入文件夹
        File[] files = file.listFiles();
        //3.遍历数组
        for (File f : files) {
            if (f.isFile()){
                len = len + f.length();
            }else {
                len = len + getLen(f);
            }
        }
        return len;
    }

}
