package Ejercicio2;

public class PayPal extends MetodoPago implements Cancelable{
    private String correoElectronico;

    public PayPal(String titular, int numero, int pago, String correoElectronico) {
        super(titular, numero, pago);
        this.correoElectronico = correoElectronico;
    }

    @Override
    protected int realizarPago() {
        pago = 120;
        return pago;
    }

    @Override
    public int cancelarPago() {
        pago -= 120;
        return pago;
    }

    public String getInfo() {
        return "Titular: " + titular + " / Número: " + numero + " / Correo Electrónico: " + correoElectronico + " / Pago: " + pago;
    }
}
