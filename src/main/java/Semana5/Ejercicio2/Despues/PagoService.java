/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana5.Ejercicio2.Despues;

/**
 *
 * @author ander
 */
public class PagoService {

    private MetodoPago metodo;

    public PagoService(MetodoPago metodo) {
        this.metodo = metodo;
    }

    public void procesarPago(double monto) {
        metodo.pagar(monto);
    }

}
