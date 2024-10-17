package Tema3.Ejemplos;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class EjemploUsoInetAddress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("www.ejemplo.com");
        System.out.println("Host: " + address.getHostName());
        System.out.println("IP Address: " + address.getHostAddress());
    }
}
