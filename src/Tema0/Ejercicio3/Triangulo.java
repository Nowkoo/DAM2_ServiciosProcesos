package Tema0.Ejercicio3;

public class Triangulo implements Poligono {
    private double base;
    private double altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura / 2;
    }
}
