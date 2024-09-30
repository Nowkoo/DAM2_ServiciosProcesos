package Tema2.A2;

public class ProgramaSecuencial {

    public static void main(String[] args) {
        long startingTime = System.currentTimeMillis();

        Primos.primosRango(1, 400000);
        System.out.println("Tiempo de ejecución: " + (System.currentTimeMillis() - startingTime));
    }
}
