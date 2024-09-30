package Tema0.Ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5, 3);
        Triangulo triangulo = new Triangulo(5, 3);

        System.out.println(rectangulo.calcularArea());
        System.out.println(triangulo.calcularArea());
    }
}
