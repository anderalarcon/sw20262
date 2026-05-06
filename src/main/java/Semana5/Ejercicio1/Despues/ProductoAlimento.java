
package Semana5.Ejercicio1.Despues;


public class ProductoAlimento extends Producto {

    private String fechaVencimiento;

    public ProductoAlimento(String nombre, double precio, String fechaVencimiento) {
        super(nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public double calcularPrecioFinal() {
        // Se agrega 5% de impuesto
        return precio * 1.05;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Fecha de vencimiento: " + fechaVencimiento);
    }
}