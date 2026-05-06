
package Semana4.Ejercicio3.Despues;


public class EmailDecorator extends NotificadorDecorator {

    public EmailDecorator(Notificador notificador) {
        super(notificador);
    }

    @Override
    public void enviar(String usuario, String mensaje) {
        super.enviar(usuario, mensaje);
        System.out.println("[EMAIL] a " + usuario);
    }
}