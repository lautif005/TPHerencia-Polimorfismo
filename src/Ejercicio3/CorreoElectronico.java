package Ejercicio3;

import java.util.Scanner;

public class CorreoElectronico extends CanalNotificacion implements Personalizable {
    private String direccionCorreo;

    public CorreoElectronico(String usuario, String mensaje, String direccionCorreo) {
        super(usuario, mensaje);
        this.direccionCorreo = direccionCorreo;
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
        return "Usuario: " + usuario + " / Correo electrónico: " + direccionCorreo + " / Mensaje: " + mensaje;
    }
}
