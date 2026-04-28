/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana3.Ejercicio1.Despues;

/**
 *
 * @author ander
 */
public class TiendaRopa extends Tienda{

    @Override
    public Producto crearProducto(String nombre, double precio, double costoEnvio) {
        return new ProductoRopa(nombre, precio, costoEnvio);
    }
    
}
