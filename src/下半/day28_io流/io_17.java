package 下半.day28_io流;

import java.io.FileReader;
import java.io.IOException;

public class io_17 {
    public static void main(String[] args) throws IOException {
        //字符输入流:FileReader  io17-io18
        //1.场景对象
        FileReader fr = new FileReader("Myfile\\aaa\\a.txt");

        //2.读取数据  read
        //空参
        /*int ch;
        while ((ch = fr.read())!= -1){
            System.out.print((char)ch);
        }*/

        //有参
        char [] chars = new char[2];
        int len;
        while ((len = fr.read(chars)) != -1){
            System.out.print(new String(chars,0,len));
        }

        //3.释放资源
        fr.close();
    }
}
