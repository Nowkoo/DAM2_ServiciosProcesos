package Tema2.A5_sincronizacion;

import java.util.ArrayList;

public class PrincipalTienda {
    public static void main(String[] args) {
        Tienda tienda = new Tienda(10);
        ArrayList<Thread> hilosCliente = new ArrayList<>();
        hilosCliente.add(new Thread(new Cliente(1, tienda, 5)));
        hilosCliente.add(new Thread(new Cliente(2, tienda, 3)));
        hilosCliente.add(new Thread(new Cliente(3, tienda, 8)));

        for (Thread thread : hilosCliente) {
            thread.start();
        }

        for (Thread thread : hilosCliente) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
