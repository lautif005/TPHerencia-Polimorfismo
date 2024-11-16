package Ejercicio1;

public class VueloCharter extends Vuelo implements Promocionable {

    private double precioTotal;

    public VueloCharter(int numero, String origen, String destino, String fecha, double precioTotal) {
        super(numero, origen, destino, fecha);
        this.precioTotal = precioTotal;
    }

    @Override
    protected double calcularPrecioInicial() {
        return precioTotal;
    }

    @Override
    public void aplicarPromocion() {
        this.precio *= 0.85;
    }
}
