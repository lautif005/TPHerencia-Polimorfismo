package Ejercicio3;

import java.util.Scanner;

public class MensajeTexto extends CanalNotificacion implements Personalizable {
    private long numeroTelefono;

    public MensajeTexto(String usuario, String mensaje, long numeroTelefono) {
        super(usuario, mensaje);
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public String enviarNotificacion() {
        return "Notificación enviada";
    }

    @Override
    public String personalizarMensaje() {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Personaliza el mensaje:");
        mensaje = lectura.nextLine();
        return mensaje;
    }

    public String mostrarInfo() {
        return "Usuario: " + usuario + " / Número de teléfono: " + numeroTelefono + " / Mensaje: " + mensaje;
    }
}
