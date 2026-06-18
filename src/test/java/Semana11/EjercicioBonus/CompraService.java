
package Semana11.EjercicioBonus;

public class CompraService {

    private DescuentoService descuentoService;

    public CompraService(DescuentoService descuentoService) {
        this.descuentoService = descuentoService;
    }

    public double calcularTotalRegular(double subtotal) {

        double descuento = descuentoService.obtenerDescuento("Regular");

        return subtotal - descuento;

    }

    public double calcularTotalPremium(double subtotal) {

        double descuento = descuentoService.obtenerDescuento("Premium");

        return subtotal - descuento;

    }

}
