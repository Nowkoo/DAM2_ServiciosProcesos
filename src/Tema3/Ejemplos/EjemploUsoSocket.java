package Tema3.Ejemplos;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class EjemploUsoSocket {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("Hola, servidor".getBytes());
        InputStream inputStream = socket.getInputStream();
        // Leer datos del flujo de entrada
    }
}
