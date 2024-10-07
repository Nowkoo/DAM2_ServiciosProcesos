package Tema2.A5_sincronizacion;

public class Tienda {
    private int stock;

    public Tienda(int stock) {
        this.stock = stock;
    }

    public boolean comprarProducto(int cantidadComprada) {
        if (cantidadComprada < stock) {
            stock -= cantidadComprada;
            return true;
        }
        return false;
    }
}
