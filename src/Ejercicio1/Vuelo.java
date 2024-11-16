package Ejercicio1;

public abstract class Vuelo {
    protected int numero;
    protected String origen;
    protected String destino;
    protected String fecha;
    protected double precio;
    protected boolean precioCalculado = false;  // Nuevo atributo

    public Vuelo(int numero, String origen, String destino, String fecha) {
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
    }

    protected abstract double calcularPrecioInicial();

    public double calcularPrecio() {
        if (!precioCalculado) {
            precio = calcularPrecioInicial();
            precioCalculado = true;
        }
        return precio;
    }

    public double getPrecio() {
        return precio;
    }

    public String getInfo() {
        calcularPrecio();
        return "Vuelo " + numero + " de " + origen + " a " + destino + " el " + fecha + " - Precio: $" + precio;
    }

}
