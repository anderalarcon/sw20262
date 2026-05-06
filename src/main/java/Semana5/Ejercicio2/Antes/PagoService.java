package Semana5.Ejercicio2.Antes;

public class PagoService {

    public void procesarPago(String tipo, double monto) {

        if (tipo.equalsIgnoreCase("paypal")) {
            System.out.println("Procesando pago con PayPal: " + monto);
        } else if (tipo.equalsIgnoreCase("tarjeta")) {
            System.out.println("Procesando pago con Tarjeta: " + monto);
        }
    }
}
