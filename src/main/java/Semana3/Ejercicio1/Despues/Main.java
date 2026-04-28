/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana3.Ejercicio1.Despues;

/**
 *
 * @author ander
 */
public class Main {

    public static void main(String[] args) {
        Tienda telectronica = new TiendaElectronica();

        Tienda tropa = new TiendaRopa();

        telectronica.crearProducto("Celualr", 200, 50);

        tropa.crearProducto("Polo", 50, 10);
    }
}
