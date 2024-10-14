package Tema2.Ejemplos;

public class EjemploHilosThread {
    public static void main(String[] args) {
        MiHilo hilo1 = new MiHilo();
        hilo1.start(); // Inicia el hilo

        // Codigo que se ejecuta en el hilo principal
        for (int i = 0; i < 10; i++) {
            System.out.println("Hilo principal: " + i);
        }

        try {
            hilo1.join(); // Espera a que hilo1 termine
        } catch (InterruptedException e) {
            // Manejo de excepciones
        }
    }

    public static class MiHilo extends Thread {
        public void run() {
             // Codigo que se ejecutara en el hilo

             for (int i = 0; i < 10; i++) {
                 System.out.println("Hilo 1: " + i);
                 }
             }
    }
}