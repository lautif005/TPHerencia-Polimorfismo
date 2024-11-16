package Ejercicio3;

public abstract class CanalNotificacion {
    protected String usuario;
    protected String mensaje;

    public CanalNotificacion(String usuario, String mensaje) {
        this.usuario = usuario;
        this.mensaje = mensaje;
    }

    protected abstract String enviarNotificacion();

    protected abstract String mostrarInfo();

}
