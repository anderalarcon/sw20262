
package Semana3.EjercicioBonus.Antes;

public class Documento {

    private String nombre;

    public Documento(String nombre) {
        this.nombre = nombre;
    }

    public void mostrar() {
        System.out.println("Generando: " + nombre);
    }
}
