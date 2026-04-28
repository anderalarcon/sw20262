/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana3.Ejercicio3.Despues;

/**
 *
 * @author ander
 */
public class FabricaMueblesModernos extends FabricaAbstracta {

    @Override
    public Mesa crearMesa() {
        return new MesaModerna();
    }

    @Override
    public Silla crearSilla() {
        return new SillaModerna();
    }

}
