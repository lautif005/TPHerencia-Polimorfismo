package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Pagos {
    private ArrayList<MetodoPago> metodosPago;

    public Pagos() {
        metodosPago = new ArrayList<>();
    }

    public void agregarMetodoPago(MetodoPago metodo) {
        metodosPago.add(metodo);
    }

    public void cancelarPago() {
        for (MetodoPago metodo : metodosPago) {
            if (metodo instanceof Cancelable) {
                ((Cancelable) metodo).cancelarPago();
            }
        }
    }

    public int realizarPago() {
        int total = 0;
        for (MetodoPago metodo : metodosPago) {
            total += metodo.realizarPago();
        }
        return total;
    }

    public void infoMetodosPago() {
        for (MetodoPago metodo : metodosPago) {
            System.out.println(metodo.getInfo());
        }
    }

}
