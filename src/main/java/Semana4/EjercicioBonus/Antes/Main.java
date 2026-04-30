/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana4.EjercicioBonus.Antes;



public class Main {

    public static void main(String[] args) {

        String contenido = "Reporte de ventas";

        // Cliente usa directamente cada servicio
        ServicioPDF pdf = new ServicioPDF();
        pdf.generarPDF(contenido);

        ServicioExcel excel = new ServicioExcel();
        excel.crearExcel(contenido);

        // Problemas:
        // ❌ Cliente conoce las clases concretas
        // ❌ Métodos distintos
        // ❌ No hay interfaz común
        // ❌ No hay una operación única
    }
}
