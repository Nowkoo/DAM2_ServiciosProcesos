package Tema2.Ejemplos;

class PrioridadRunnable implements Runnable {
@Override
public void run() {
        System.out.println("Hilo " + Thread.currentThread().getName() + " con prioridad " + Thread.currentThread().getPriority());}
}

public class EjemploPrioridad {
public static void main(String[] args) {
        Thread hilo1 = new Thread(new PrioridadRunnable());
        Thread hilo2 = new Thread(new PrioridadRunnable());
        Thread hilo3 = new Thread(new PrioridadRunnable());

        hilo1.setPriority(Thread.MIN_PRIORITY);
        hilo2.setPriority(Thread.NORM_PRIORITY);
        hilo3.setPriority(Thread.MAX_PRIORITY);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        }
 }
