package Tema0.Ejercicio4;
//crear clase calculadora con cuatro metodos estaticos, sumar, restar, multiplicar y dividir. Todos tendran dos
//parametros de tipo doble. Cada uno hace la operacion que le corresponda excepto dividir con divisiones por 0 que dara error.
public class Ejercicio4 {
    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.depositar(100);
        banco.retirar(50);
        banco.retirar(200);

        System.out.println(banco.getSaldo());
    }
}
