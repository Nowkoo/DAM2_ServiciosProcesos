package Tema2.A2;

import java.util.ArrayList;

public class ProgramaHilos {
    public static void main(String[] args) throws InterruptedException {
        long startingTime = System.currentTimeMillis();

        ArrayList<Thread> threads = new ArrayList<>();
        threads.add(new Thread(new Hilo(1, 100000)));
        threads.add(new Thread(new Hilo(100001, 200000)));
        threads.add(new Thread(new Hilo(200001, 300000)));
        threads.add(new Thread(new Hilo(300001, 400000)));

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Tiempo de ejecución: " + (System.currentTimeMillis() - startingTime));
    }

    public static class Hilo implements Runnable {
        private int inicio;
        private int fin;

        public Hilo(int inicio, int fin) {
            this.inicio = inicio;
            this.fin = fin;
        }

        @Override
        public void run() {
            Primos.primosRango(inicio, fin);
        }
    }
}
