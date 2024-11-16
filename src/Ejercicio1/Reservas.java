package Ejercicio1;

import java.util.ArrayList;

public class Reservas {

    private ArrayList<Vuelo> vuelos;

    public Reservas() {
        vuelos = new ArrayList<>();  // Inicialización del ArrayList
    }

    public void agregarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    public double calcularTotalReserva() {
        double total = 0;
        for (Vuelo vuelo : vuelos) {
            total += vuelo.calcularPrecio();
        }
        return total;
    }

    public void aplicarPromociones() {
        for (Vuelo vuelo : vuelos) {
            if (vuelo instanceof Promocionable) {
                ((Promocionable) vuelo).aplicarPromocion();
            }
        }
    }

    public void mostrarInfoVuelos() {
        for (Vuelo vuelo : vuelos) {
            System.out.println(vuelo.getInfo());
        }
    }
}
