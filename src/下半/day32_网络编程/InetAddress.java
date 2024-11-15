package 下半.day32_网络编程;

import java.net.UnknownHostException;

public class InetAddress {
    public static void main(String[] args) throws UnknownHostException {
        java.net.InetAddress address = java.net.InetAddress.getByName("FQ-CLEHXKHLGHIW");
        System.out.println(address);

        String name = address.getHostName();
        System.out.println(name);

        String ip = address.getHostAddress();
        System.out.println(ip);

    }
}
