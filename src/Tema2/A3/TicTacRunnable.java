package Tema2.A3;

public class TicTacRunnable implements Runnable {
    String palabraImpresa;

    public TicTacRunnable(String palabraImpresa) {
        this.palabraImpresa = palabraImpresa;
    }

    @Override
    public void run() {
        System.out.println(palabraImpresa);
    }
}
