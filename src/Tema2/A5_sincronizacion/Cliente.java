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
        Boolean compraCompletada = tienda.comprarProducto(cantidadComprada);
        if (compraCompletada) {
            System.out.println("Cliente " + numCliente + " en el hilo " + Thread.currentThread().threadId() + " compró " + cantidadComprada + " productos.");
        } else {
            System.out.println("Cliente " + numCliente + " en el hilo " + Thread.currentThread().threadId() + " intentó comprar " + cantidadComprada + " productos, pero no hay suficiente stock.");
        }
    }
}
