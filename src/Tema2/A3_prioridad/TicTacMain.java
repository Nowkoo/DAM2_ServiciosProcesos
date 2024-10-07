package Tema2.A3_prioridad;

public class TicTacMain {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Thread tic = new Thread(new TicTacRunnable("TIC"));
            tic.setPriority(Thread.MIN_PRIORITY);
            tic.start();

            Thread tac = new Thread(new TicTacRunnable("TAC"));
            tac.setPriority(Thread.MAX_PRIORITY);
            tac.start();
        }
    }
}