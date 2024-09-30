package Tema2.A1;

public class MiTarea implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Soy el hilo " + Thread.currentThread().threadId() + " y ejecuto el comando " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
