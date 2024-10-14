package Tema2.A5_sincronizacion;

public class Cliente implements Runnable {
    int numCliente;
    private Tienda tienda;
    int cantidadComprada;

    public Cliente(int numCliente, Tienda tienda, int cantidadComprada) {
        this.numCliente = numCliente;
        this.tienda = tienda;
        this.cantidadComprada = cantidadComprada;
    }

    @Override
    public void run() {
        tienda.comprarProducto(cantidadComprada, numCliente);
    }
}
