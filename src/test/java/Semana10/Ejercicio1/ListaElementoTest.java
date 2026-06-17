/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Semana10.Ejercicio1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListaElementoTest {

    private ListaElementos lista;

    @BeforeEach
    public void setUp() {
        lista = new ListaElementos();
    }

    @Test
    public void agregarElemento_DeberiaAgregarCorrectamente() {

        String e1 = "Nike";

        lista.agregarElemento(e1);

        assertTrue(lista.contieneElemento(e1));
    }

    @Test
    public void contieneElemento_DeberiaRetornarFalseSiNoExiste() {

        assertFalse(lista.contieneElemento("Adidas"));
    }

}
