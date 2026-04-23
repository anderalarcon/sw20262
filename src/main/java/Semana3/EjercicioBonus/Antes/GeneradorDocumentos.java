
package Semana3.EjercicioBonus.Antes;

public class GeneradorDocumentos {

    public Documento crearDocumento(String tipo) {

        if (tipo.equalsIgnoreCase("pdf")) {
            return new Documento("Documento PDF");
        } else if (tipo.equalsIgnoreCase("word")) {
            return new Documento("Documento Word");
        }

        return null;
    }
}
