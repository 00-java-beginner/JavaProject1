package 下半.day29_io流;

import java.io.*;

public class io_33 {
    public static void main(String[] args) throws IOException {
        //利用字节流读取文件中的数据，每次读取一整行，而且不能乱码
        //1.字节流在读取中文的时候，是会出现乱码的，但是字符流可以搞定
        //2.字节流里面是没有读一整行的方法的，只有字符缓冲流才能搞定
        /*FileInputStream fis = new FileInputStream("E:\\JavaProject1\\Myfile\\aaa\\csb.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        System.out.println(line);
        br.close();*/

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\JavaProject1\\Myfile\\aaa\\csb.txt")));
        String line;
        while ((line = br.readLine())!= null){
            System.out.println(line);
        }
        br.close();

    }
}
