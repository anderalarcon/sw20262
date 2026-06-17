
package Semana10.Ejercicio2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ValidadorTest {

    private Validador validador;

    @BeforeEach
    public void setUp() {
        validador = new Validador();
    }

    @Test
    public void validarCorreoElectronico_DeberiaRetornarTrueSiCorreoEsValido() {

        String correo = "ander@gmail.com";

        assertTrue(validador.validarCorreoElectronico(correo));
    }

    @Test
    public void validarCorreoElectronico_DeberiaRetornarFalseSiCorreoEsInvalido() {

        String correo = "andergmail.com";

        assertFalse(validador.validarCorreoElectronico(correo));
    }

    @Test
    public void validarNumeroTelefono_DeberiaRetornarTrueSiNumeroEsValido() {

        String numero = "9876543210";

        assertTrue(validador.validarNumeroTelefono(numero));
    }

    @Test
    public void validarNumeroTelefono_DeberiaRetornarFalseSiNumeroEsInvalido() {

        String numero = "12345";

        assertFalse(validador.validarNumeroTelefono(numero));
    }

}