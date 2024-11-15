package 下半.day27_异常_file_综合练习.综合练习;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        //寻找磁盘中所有文件夹中是否有avi结尾的电影

    findAvi();

    }
    //定义一个空参构造得到所有本地盘符
    public static void findAvi(){
        //1.获取到所有的本地盘符
        File[] arr = File.listRoots();
        //2.循环得到所有盘符元素
        for (File file : arr) {
            findAvi(file);
        }
    }


    //定义一个方法进行查找操作
    public static void findAvi(File file){
        //1.进入文件夹
        File[] files = file.listFiles();
        //由于listFiles底层会进行权限判断，如果调用者进入文件夹的权限不足是会直接返回null
        //如果这里不对files进行非空判断会导致报空指针异常
        if (files != null){
            //2.遍历数组
            for (File f : files) {
                //3.进行判断
                if (f.isFile()){
                    //如果是文件夹，执行查找的操作
                    String name = f.getName();
                    if (name.endsWith(".avi")){
                        System.out.println(f);
                    }
                }else {
                    //4.进行判断，如果不是文件，则继续循环查找
                    //使用递归继续循环
                    findAvi(f);
                }
            }
        }

    }
}
