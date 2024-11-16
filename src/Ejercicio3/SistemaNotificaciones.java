package Ejercicio3;

import java.util.Scanner;

public class SistemaNotificaciones {
    public static void main(String[] args) {
        Notificaciones notificacion = new Notificaciones();
        Scanner lectura = new Scanner(System.in);
        while (true) {
            System.out.println("Destinatario:");
            String destinatario = lectura.nextLine();
            System.out.println("Canal:");
            String enviar = lectura.nextLine();
            if (enviar.toUpperCase().equals("CORREO ELECTRONICO")) {
                System.out.println("Dirección de correo:");
                String direccion = lectura.nextLine();
                CanalNotificacion canal = new CorreoElectronico(destinatario, "Hola", direccion);
                notificacion.agregarCanales(canal);
                break;
            } else if (enviar.toUpperCase().equals("MENSAJE DE TEXTO")) {
                System.out.println("Número de teléfono:");
                long num = lectura.nextLong();
                lectura.nextLine();
                CanalNotificacion canal = new MensajeTexto(destinatario, "Hola", num);
                notificacion.agregarCanales(canal);
                break;
            } else {
                System.out.println("Canal no disponible");
            }
        }
        System.out.println("Ingrese 1 si desea personalizar el mensaje");
        int personalizar = lectura.nextInt();
        lectura.nextLine();
        if (personalizar == 1) {
            notificacion.personalizarMensaje();
        } else {
            notificacion.enviarNotificacion();
        }
        notificacion.mostrarInfo();
    }
}
