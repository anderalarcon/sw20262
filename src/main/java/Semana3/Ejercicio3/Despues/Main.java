/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana3.Ejercicio3.Despues;

/**
 *
 * @author ander
 */
public class Main {

    public static void main(String[] args) {

        FabricaAbstracta fclasica = new FabricaMueblesClasicos();
        FabricaAbstracta fmoderna = new FabricaMueblesModernos();

        fclasica.crearMesa();
        fclasica.crearSilla();

        fmoderna.crearMesa();
        fmoderna.crearSilla();
    }
}
