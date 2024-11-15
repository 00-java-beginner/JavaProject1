package 下半.day27_异常_file_综合练习.综合练习;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        //定义一个方法，寻找某个文件夹中是否有avi结尾的电影
        File file = new File("E:\\JavaProject1\\Myflie");
        boolean b = haveQlv(file);
        System.out.println(b);

    }
    public static boolean haveQlv(File file){
        //1.进入文件夹，获取到里面的所有内容
        File[] files = file.listFiles();
        //2.遍历得到所有文件夹和文件
        for (File f : files) {
            //3.进行判断
                //isFile:判断是否是一个文件
                //getname.endsWith:获取到文件名以及后缀名后对后缀名做一个筛选
            if (f.isFile() && f.getName().endsWith(".qlv")){
                return true;
            }
        }
        return false;
    }
}
