package Semana2.EjercicioBonus.Antes;

public class CalculadoraDescuentos {

    public double calcularDescuento(String tipoCliente, double monto) {

        if (tipoCliente.equalsIgnoreCase("regular")) {
            return monto * 0.05;
        } else if (tipoCliente.equalsIgnoreCase("vip")) {
            return monto * 0.10;
        } else if (tipoCliente.equalsIgnoreCase("premium")) {
            return monto * 0.20;
        }

        return 0;
    }
}
