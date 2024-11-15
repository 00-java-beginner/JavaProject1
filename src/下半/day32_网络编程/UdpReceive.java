package 下半.day32_网络编程;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpReceive {
    public static void main(String[] args) throws IOException {
        //1.创建对象
        DatagramSocket ds = new DatagramSocket(10086);

        //2.接收数据
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        ds.receive(dp);

        //3.解析数据
        byte[] data = dp.getData();
        InetAddress address = dp.getAddress();
        int port = dp.getPort();
        int length = dp.getLength();
        System.out.println("接收到" + new String(data,0,length));
        System.out.println("接收了" + length + "个数据");
        System.out.println("发送的IP地址是" + address + "发送的端口号是" + port);

        //4.释放资源
        ds.close();
    }
}
