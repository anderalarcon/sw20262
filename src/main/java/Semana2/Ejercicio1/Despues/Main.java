
package Semana2.Ejercicio1.Despues;

public class Main {

    public static void main(String[] args) {

        Encriptador e = new Encriptador();
        RegistroUsuariosV2 r2 = new RegistroUsuariosV2("ander", "qwerty", e);

        r2.registrarUsuario();
    }
}
