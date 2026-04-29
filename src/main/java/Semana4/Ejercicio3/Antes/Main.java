
package Semana4.Ejercicio3.Antes;


public class Main {

    public static void main(String[] args) {

        Notificador notificador = new Notificador();

        String usuario = "Ander";
        String mensaje = "Transacción aprobada";

        // Caso 1: Usuario básico
        notificador.enviar(usuario, mensaje);

        System.out.println("\n--- Escenarios reales ---");

        // Caso 2: Usuario VIP → email + SMS
        System.out.println("[EMAIL] Enviando a " + usuario + ": " + mensaje);
        System.out.println("[SMS] Enviando a " + usuario + ": " + mensaje);

        // Caso 3: Usuario crítico → email + SMS + WhatsApp
        System.out.println("[EMAIL] Enviando a " + usuario + ": " + mensaje);
        System.out.println("[SMS] Enviando a " + usuario + ": " + mensaje);
        System.out.println("[WHATSAPP] Enviando a " + usuario + ": " + mensaje);

        // Caso 4: Usuario internacional → push + email + traducción
        String mensajeTraducido = traducir(mensaje, "EN");
        System.out.println("[PUSH] Enviando a " + usuario + ": " + mensajeTraducido);
        System.out.println("[EMAIL] Enviando a " + usuario + ": " + mensajeTraducido);

        // Caso 5: Auditoría obligatoria
        registrarLog(usuario, mensaje);
    }

    private static String traducir(String mensaje, String idioma) {
        return mensaje + " (" + idioma + ")";
    }

    private static void registrarLog(String usuario, String mensaje) {
        System.out.println("[LOG] Registro: " + usuario + " - " + mensaje);
    }
}
