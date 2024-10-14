package Tema2.A5_sincronizacion;

public class Tienda {
    private int stock;

    public Tienda(int stock) {
        this.stock = stock;
    }

    public synchronized void comprarProducto(int cantidadComprada, int cliente) {
        if (cantidadComprada < stock) {
            stock -= cantidadComprada;
            System.out.println("Cliente " + cliente + " en el hilo " + Thread.currentThread().threadId() + " compró " + cantidadComprada + " productos.");
            System.out.println("Stock disponible: " + stock);

        } else {
            System.out.println("Cliente " + cliente + " en el hilo " + Thread.currentThread().threadId() + " intentó comprar " + cantidadComprada + " productos, pero no hay suficiente stock.");
        }
    }
}
