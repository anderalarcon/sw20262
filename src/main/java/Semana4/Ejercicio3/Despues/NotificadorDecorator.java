
package Semana4.Ejercicio3.Despues;


public abstract class NotificadorDecorator implements Notificador {

    protected Notificador notificador;

    public NotificadorDecorator(Notificador notificador) {
        this.notificador = notificador;
    }

    @Override
    public void enviar(String usuario, String mensaje) {
        notificador.enviar(usuario, mensaje);
    }
}