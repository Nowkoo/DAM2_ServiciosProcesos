package Tema0.Ejercicio4;

public class Banco {
    private double saldo;

    public Banco() {
        this.saldo = 0;
    }

    public void depositar(double cantidad) {
        this.saldo += cantidad;
    }

    public void retirar(double cantidad) {
        this.saldo -= cantidad;
        if (this.saldo < 0) {
            this.saldo = 0;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
