/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana2.Ejercicio1.Despues;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author ander
 */
public class RegistroUsuariosV2 {

    private String nombre;
    private String contrasena;
    private Encriptador encriptador;

    public RegistroUsuariosV2(String nombre, String contrasena, Encriptador encriptador) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.encriptador = encriptador;
    }

    public void registrarUsuario() {
        // Lógica para guardar el usuario en la base de datos
        System.out.println("Registrando usuario...");
        System.out.println("Encriptando contraseña...");
        System.out.println("Usuario registrado con nombre:" + nombre + " y contraseña: " + encriptador.encriptarContrasena(contrasena));
    }

}
