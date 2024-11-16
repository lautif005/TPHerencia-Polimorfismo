package Ejercicio2;

import java.util.Scanner;

public class TarjetaCredito extends MetodoPago implements Cancelable {
    private String fechaExpiracion;
    private int codigoSeguridad;

    public TarjetaCredito(String titular, int numero, int pago, String fechaExpiracion, int codigoSeguridad) {
        super(titular, numero, pago);
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
    }

    @Override
    protected int realizarPago() {
        pago = 100;
        return pago;
    }

    @Override
    public int cancelarPago() {
        pago -= 100;
        return pago;
    }

    public String getInfo() {
        return "Titular: " + titular + " / Número: " + numero + " / Fecha de expiración: " + fechaExpiracion + " / Código de seguridad: " + codigoSeguridad + " / Pago: " + pago;
    }
}
