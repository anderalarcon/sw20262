
package Semana3.EjercicioBonus.Antes;

public class Main {

    public static void main(String[] args) {

        GeneradorDocumentos generador = new GeneradorDocumentos();

        Documento doc1 = generador.crearDocumento("pdf");
        Documento doc2 = generador.crearDocumento("word");

        doc1.mostrar();
        doc2.mostrar();
    }
}
