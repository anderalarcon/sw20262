package Semana5.Ejercicio3.Antes;


public class NotificacionService {

    public void enviar(String tipo, String mensaje) {

        if (tipo.equalsIgnoreCase("email")) {
            System.out.println("Enviando EMAIL: " + mensaje);
        } else if (tipo.equalsIgnoreCase("sms")) {
            System.out.println("Enviando SMS: " + mensaje);
        }
    }
}
