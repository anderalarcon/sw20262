/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana5.Ejercicio2.Despues;

/**
 *
 * @author ander
 */
public class Main {

    public static void main(String[] args) {

        MetodoPago metodo1 = new MetodoPaypal();
        MetodoPago metodo2 = new MetodoTarjeta();

        PagoService ps = new PagoService(metodo2);

        ps.procesarPago(100);

        PagoService ps2 = new PagoService(metodo1);

        ps2.procesarPago(1000);

    }
}
