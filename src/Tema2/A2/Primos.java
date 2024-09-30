package Tema2.A2;

public class Primos {
    public static void primosRango(int inicio, int fin) {
        for (int i = inicio; i <= fin; i++) {
            String mensaje;
            boolean numPrimo = Primos.esPrimo(i);

            if (numPrimo) {
                mensaje = "El número " + i + " es primo";
            } else {
                mensaje = "El número " + i + " no es primo";
            }

            System.out.println(mensaje);
        }
    }


    public static boolean esPrimo(int numero) {
// Los números menores o iguales a 1 no son primos
        if (numero <= 1) {
            return false;
        }
// Comprobamos si es divisible por algún número desde 2 hasta 'numero - 1'
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false; // Si es divisible, no es primo
            }
        }
        return true; // Si no es divisible por ningún número, es primo
    }
}
