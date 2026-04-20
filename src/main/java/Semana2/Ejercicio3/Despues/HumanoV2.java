/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana2.Ejercicio3.Despues;

/**
 *
 * @author ander
 */
public class HumanoV2 implements TrabajadorHumano {

    @Override
    public void trabajar() {
        System.out.println("Trabajando...");
    }

    @Override
    public void comer() {
        System.out.println("Comiendo...");
    }

    @Override
    public void descansar() {
        System.out.println("Descansando...");
    }

    @Override
    public void reunirse() {
        System.out.println("Reunión...");
    }

}
