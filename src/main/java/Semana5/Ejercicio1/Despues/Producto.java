package Semana5.Ejercicio1.Despues;

public class Producto {

    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double calcularPrecioFinal() {
        return precio;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio base: " + precio);
        System.out.println("Precio final: " + calcularPrecioFinal());
    }
}