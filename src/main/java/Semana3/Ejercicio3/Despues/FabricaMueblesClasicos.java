/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana3.Ejercicio3.Despues;

/**
 *
 * @author ander
 */
public class FabricaMueblesClasicos extends FabricaAbstracta {

    @Override
    public Mesa crearMesa() {
        return new MesaClasica();
    }

    @Override
    public Silla crearSilla() {
        return new SillaClasica();
    }

}
