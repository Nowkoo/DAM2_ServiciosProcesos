package Tema0.Ejercicio5;

public class Calculadora {

    static  double sumar(double num1, double num2) {
        return num1 + num2;
    }

    static  double restar(double num1, double num2) {
        return num1 - num2;
    }

    static  double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    static double dividir(double num1, double num2){
        if (num2 == 0) {
            throw new ArithmeticException("ERROR");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        System.out.println(dividir(1, 0));
    }
}
