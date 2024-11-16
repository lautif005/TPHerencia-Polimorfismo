package Ejercicio2;

public class SistemaDePagos {
    public static void main(String[] args) {
        Pagos pagos = new Pagos();
        MetodoPago tarjetaCredito = new TarjetaCredito("Lautaro", 2324, 100, "23/11/2024", 610);
        MetodoPago payPal = new PayPal("Jonatan", 9887, 120, "joniferreria@gmail.com");
        pagos.agregarMetodoPago(tarjetaCredito);
        pagos.agregarMetodoPago(payPal);
        System.out.println("Pago: ");
        pagos.realizarPago();
        pagos.infoMetodosPago();
        System.out.println("Cancelación: ");
        pagos.cancelarPago();
        pagos.infoMetodosPago();
    }
}
