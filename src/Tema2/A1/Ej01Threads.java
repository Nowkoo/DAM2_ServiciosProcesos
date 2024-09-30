package Tema2.A1;

import java.util.ArrayList;

public class Ej01Threads extends Thread {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            Thread t = new Thread(new MiTarea());
            threads.add(t);
            t.start();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("El programa ha finalizado.");
    }
}
