/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana5.Ejercicio3.Despues;

/**
 *
 * @author ander
 */
public class SmsFactory extends NotificacionFactory {

    @Override
    public Notificacion crearNotificacion() {
        return new SmsNotificacion();
    }

}
