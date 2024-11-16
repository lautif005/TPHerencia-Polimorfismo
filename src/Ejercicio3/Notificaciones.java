package Ejercicio3;

import java.util.ArrayList;

public class Notificaciones {
    private ArrayList<CanalNotificacion> canales;

    public Notificaciones() {
        canales = new ArrayList<>();
    }

    public void agregarCanales(CanalNotificacion canal) {
        canales.add(canal);
    }

    public void enviarNotificacion() {
        for (CanalNotificacion canal : canales) {
            canal.enviarNotificacion();
        }
    }

    public void personalizarMensaje() {
        for (CanalNotificacion canal : canales) {
            if (canal instanceof Personalizable) {
                ((Personalizable) canal).personalizarMensaje();
            }
        }
    }

    public void mostrarInfo() {
        for (CanalNotificacion canal : canales) {
            System.out.println(canal.mostrarInfo());
        }
    }
}
