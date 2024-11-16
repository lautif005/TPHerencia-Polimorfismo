package Ejercicio1;

public class SistemaReservas {
    public static void main(String[] args) {
        Reservas reservas = new Reservas();
        Vuelo vueloRegular = new VueloRegular(101, "Madrid", "Barcelona", "20-11-2023", 150);
        Vuelo vueloCharter = new VueloCharter(102, "New York", "Los Ángeles", "15-12-2023", 100);
        reservas.agregarVuelo(vueloRegular);
        reservas.agregarVuelo(vueloCharter);
        System.out.println("Información de vuelo antes de promociones");
        reservas.mostrarInfoVuelos();
        reservas.aplicarPromociones();
        System.out.println("\nInformación de vuelos después de promociones");
        reservas.mostrarInfoVuelos();
        double total = reservas.calcularTotalReserva();
        System.out.println("\nTotal de reservas: $" + total);
    }
}
