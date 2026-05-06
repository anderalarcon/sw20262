/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana4.Ejercicio1.Despues;

/**
 *
 * @author ander
 */
public class StripeAdapter implements ProveedorPago {

    private PagoStripe stripe;

    public StripeAdapter(PagoStripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void procesarPago(double monto, String moneda) {
        if (!moneda.equalsIgnoreCase("USD")) {
            monto = convertirAUSD(monto, moneda);
        }

    }

    public double convertirAUSD(double monto, String moneda) {
        if (moneda.equalsIgnoreCase("EUR")) {
            return monto * 1.17;
        }
        return monto;
    }

}
