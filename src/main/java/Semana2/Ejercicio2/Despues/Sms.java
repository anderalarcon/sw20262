/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana2.Ejercicio2.Despues;

/**
 *
 * @author ander
 */
public class Sms implements Canal {

    @Override
    public void enviarMensaje(String contenido) {
        System.out.println("Enviando SMS V2: " + contenido);

    }

}
