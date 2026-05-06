
package Semana4.Ejercicio3.Despues;

public class LogDecorator extends NotificadorDecorator {

    public LogDecorator(Notificador notificador) {
        super(notificador);
    }

    @Override
    public void enviar(String usuario, String mensaje) {
        super.enviar(usuario, mensaje);
        System.out.println("[LOG] enviado a " + usuario);
    }
}