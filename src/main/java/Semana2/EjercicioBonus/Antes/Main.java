package Semana2.EjercicioBonus.Antes;

public class Main {

    public static void main(String[] args) {

        CalculadoraDescuentos c = new CalculadoraDescuentos();

        double monto = 100;

        System.out.println("Descuento regular: " + c.calcularDescuento("regular", monto));
        System.out.println("Descuento VIP: " + c.calcularDescuento("vip", monto));
        System.out.println("Descuento premium: " + c.calcularDescuento("premium", monto));
    }
}
