/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana5.Ejercicio3.Despues;

/**
 *
 * @author ander
 */
public class Main {

    public static void main(String[] args) {

        NotificacionFactory f1 = new EmailFactory();

        f1.crearNotificacion();

        NotificacionFactory f2 = new SmsFactory();

        f2.crearNotificacion();
    }
}
