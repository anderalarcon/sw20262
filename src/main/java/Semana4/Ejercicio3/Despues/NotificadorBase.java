
package Semana4.Ejercicio3.Despues;


public class NotificadorBase implements Notificador {

    @Override
    public void enviar(String usuario, String mensaje) {
        System.out.println("[BASE] Notificación a " + usuario + ": " + mensaje);
    }
}