package 下半.day27_异常_file_综合练习.综合练习;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //在当前模块下的aaa文件夹创建一个a.txt文件

        //1.创建aaa文件夹
        File file = new File("Myfile\\aaa");
        file.mkdirs();

        //2.拼接父级路径和子级路径
        File src = new File(file,"a.txt");
        boolean b = src.createNewFile();
        if (b){
            System.out.println("创建成功");
        }else {
            System.out.println("创建失败");
        }
    }
}
