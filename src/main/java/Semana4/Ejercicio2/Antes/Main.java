
package Semana4.Ejercicio2.Antes;

public class Main {

    public static void main(String[] args) {

        SistemaVuelos vuelos = new SistemaVuelos();
        SistemaHoteles hoteles = new SistemaHoteles();
        SistemaAutos autos = new SistemaAutos();

        // Flujo completo de reserva (cliente hace TODO)
        vuelos.buscarVuelos();
        vuelos.seleccionarVuelo();
        vuelos.pagarVuelo();

        hoteles.buscarHoteles();
        hoteles.seleccionarHotel();
        hoteles.pagarHotel();

        autos.buscarAutos();
        autos.seleccionarAuto();
        autos.pagarAuto();

        System.out.println("Reserva completa realizada.");
    }
}
