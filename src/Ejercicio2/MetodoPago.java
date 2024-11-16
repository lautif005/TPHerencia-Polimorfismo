package Ejercicio2;

public abstract class MetodoPago {
    protected String titular;
    protected int numero;
    protected int pago;

    public MetodoPago(String titular, int numero, int pago) {
        this.titular = titular;
        this.numero = numero;
        this.pago = pago;
    }

    protected abstract int realizarPago();

    protected abstract String getInfo();

}
