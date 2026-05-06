
package Semana4.Ejercicio3.Despues;
public class Main {

    public static void main(String[] args) {

        String usuario = "Ander";
        String mensaje = "Transacción aprobada";

        // Base
        Notificador n1 = new NotificadorBase();
        n1.enviar(usuario, mensaje);

        System.out.println("\n--- Con Email ---");
        Notificador n2 = new EmailDecorator(new NotificadorBase());
        n2.enviar(usuario, mensaje);

        System.out.println("\n--- Email + Log ---");
        Notificador n3 = new LogDecorator(
                                new EmailDecorator(
                                    new NotificadorBase()));
        n3.enviar(usuario, mensaje);
    }
}