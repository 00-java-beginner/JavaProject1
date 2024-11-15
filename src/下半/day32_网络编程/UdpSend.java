package 下半.day32_网络编程;

import java.io.IOException;
import java.net.*;
import java.net.InetAddress;

public class UdpSend {
    public static void main(String[] args) throws IOException {
        //1.创建对象
        DatagramSocket ds = new DatagramSocket();

        //2.打包数据
        String str = "Hellow Word";
        byte[] bytes = str.getBytes();
        int port = 10086;
        InetAddress address = InetAddress.getByName("127.0.0.1");
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);

        //3.发送数据
        ds.send(dp);

        //4.释放资源
        ds.close();
    }
}
