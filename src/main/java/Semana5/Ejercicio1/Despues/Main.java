package Semana5.Ejercicio1.Despues;

public class Main {

    public static void main(String[] args) {

        ProductoElectronico laptop
                = new ProductoElectronico("Laptop", 3000, 24);

        ProductoAlimento leche
                = new ProductoAlimento("Leche", 8, "10/12/2025");

        System.out.println("=== PRODUCTO ELECTRÓNICO ===");
        laptop.mostrarInformacion();

        System.out.println();

        System.out.println("=== PRODUCTO ALIMENTO ===");
        leche.mostrarInformacion();
    }
}
