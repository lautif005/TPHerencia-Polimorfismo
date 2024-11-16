package Ejercicio1;

public class VueloRegular extends Vuelo implements Promocionable {

    private int numeroAsientos;
    private static final double PRECIO_BASE_POR_ASIENTO = 70.0;

    public VueloRegular(int numero, String origen, String destino, String fecha, int numeroAsientos) {
        super(numero, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
    }

    @Override
    protected double calcularPrecioInicial() {
        return PRECIO_BASE_POR_ASIENTO * numeroAsientos;
    }

    @Override
    public void aplicarPromocion() {
        this.precio *= 0.9;
    }
}
