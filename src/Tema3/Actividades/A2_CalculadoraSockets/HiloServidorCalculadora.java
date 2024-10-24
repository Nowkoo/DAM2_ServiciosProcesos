package Tema3.Actividades.A2_CalculadoraSockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class HiloServidorCalculadora extends Thread {
    DataInputStream fentrada;
    Socket socket = null;

    public HiloServidorCalculadora(Socket socket) {
        this.socket = socket;

        try {
            fentrada = new DataInputStream(socket.getInputStream());
        } catch (IOException e) {
            System.out.println("Error al leer el servidor");
            e.printStackTrace();
        }
    }

    public void run() {
        while (true) {
            String cadena = "";
            try {
                cadena = fentrada.readUTF();
                DataOutputStream fsalida = new DataOutputStream(socket.getOutputStream());
                fsalida.writeUTF(String.valueOf(ServidorCalculadora.operar(cadena)));

            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
