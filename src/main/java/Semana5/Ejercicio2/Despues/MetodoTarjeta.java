/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana5.Ejercicio2.Despues;

/**
 *
 * @author ander
 */
public class MetodoTarjeta implements MetodoPago {

    @Override
    public void pagar(double monto) {
        System.out.println("Pagando con tarjeta el monto de : " + monto);
    }

}
