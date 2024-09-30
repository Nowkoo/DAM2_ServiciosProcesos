package Tema0.Ejercicio3;

public class Rectangulo implements Poligono {
private double ancho, alto;

public Rectangulo(double ancho, double alto) {
    this.ancho = ancho;
    this.alto = alto;
}

    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}
