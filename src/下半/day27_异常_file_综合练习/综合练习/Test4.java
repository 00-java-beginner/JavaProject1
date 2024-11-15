package 下半.day27_异常_file_综合练习.综合练习;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        //删除一个多级文件夹
        File file = new File("E:\\JavaProject1\\Myfile");
        delete(file);
    }

    public static void delete(File file){
        //1.进入文件夹
        File[] files = file.listFiles();
        if (files != null){
            //2.循环数组
            for (File f : files) {
                //3.进行判断
                if (f.isFile()){
                    //判断是否是文件，如果是直接删除
                    f.delete();
                }else {
                    //如果是文件夹则继续进入
                    delete(f);
                }
            }
            file.delete();
        }

    }
}
