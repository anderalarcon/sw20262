/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana4.Ejercicio2.Despues;

/**
 *
 * @author ander
 */
public class SistemaDeReserva {

    private SistemaAutos sa;
    private SistemaHoteles sh;
    private SistemaVuelos sv;

    public SistemaDeReserva() {
        this.sa = new SistemaAutos();
        this.sh = new SistemaHoteles();
        this.sv = new SistemaVuelos();
    }

    public void reservar() {
        sv.buscarVuelos();
        sv.seleccionarVuelo();
        sv.pagarVuelo();

        sh.buscarHoteles();
        sh.seleccionarHotel();
        sh.pagarHotel();

        sa.buscarAutos();
        sa.seleccionarAuto();
        sa.pagarAuto();

        System.out.println("Reserva completa realizada.");
    }

}
