package Tema3.Actividades.A2_CalculadoraSockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClienteCalculadora {
    Socket socket = null;
    DataInputStream fentrada;
    DataOutputStream fsalida;
    boolean repetir = true;
    static Scanner scanner;

    public ClienteCalculadora(Socket socket) {
        this.socket = socket;
        try {
            fentrada = new DataInputStream(socket.getInputStream());
            fsalida = new DataOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int puerto = 12345;
        Socket socket = null;
        try {
            socket = new Socket("localhost", puerto);
        } catch (IOException e) {
            System.out.println("Error al conectar el servidor: " + e.getMessage());
            System.exit(0);
        }
        scanner = new Scanner(System.in);
        ClienteCalculadora cliente = new ClienteCalculadora(socket);
        cliente.ejecutar();
    }

    private void ejecutar() {
        String operacion = "";
        while (repetir) {
            System.out.println("Introduce tipo de operación: 1-Suma, 2-Resta, 3-Multiplicación, 4-División");
            String op = scanner.nextLine();
            System.out.println("Introduce primer valor: ");
            String valor1 = scanner.nextLine();
            System.out.println("Introduce segundo valor: ");
            String valor2 = scanner.nextLine();
            operacion = op + "#" + valor1 + "#" + valor2;

            try {
                fsalida.writeUTF(operacion);
                System.out.println("Resultado: " + fentrada.readUTF());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
