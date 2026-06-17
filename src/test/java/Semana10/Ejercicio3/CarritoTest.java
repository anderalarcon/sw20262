/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Semana10.Ejercicio3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ander
 */
public class CarritoTest {

    private CarritoDeCompras carrito;

    @BeforeEach
    public void setUp() {
        carrito = new CarritoDeCompras();
    }

    @Test
    public void agregarProducto_DeberiaAgregarCorrectamente() {

        Producto producto = new Producto("Laptop", 2500, 2);

        carrito.agregarProducto(producto);

        assertTrue(carrito.contieneProducto("Laptop"));
    }

    @Test
    public void eliminarProducto_DeberiaEliminarCorrectamente() {

        Producto producto = new Producto("Mouse", 100, 1);

        carrito.agregarProducto(producto);
        carrito.eliminarProducto("Mouse");

        assertFalse(carrito.contieneProducto("Mouse"));
    }

    @Test
    public void calcularTotal_DeberiaRetornarElMontoCorrecto() {

        Producto p1 = new Producto("Laptop", 2500, 2);
        Producto p2 = new Producto("Mouse", 100, 3);

        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);

        double totalEsperado = 5300;

        assertEquals(totalEsperado, carrito.calcularTotal());
    }

    @Test
    public void calcularTotal_DeberiaSerDiferenteAUnValorIncorrecto() {

        Producto p1 = new Producto("Laptop", 2500, 2);

        carrito.agregarProducto(p1);

        assertNotEquals(1000, carrito.calcularTotal());
    }

    @Test
    public void producto_NoDeberiaSerNulo() {

        Producto producto = new Producto("Teclado", 150, 1);

        assertNotNull(producto);
    }

    @Test
    public void productoNulo_DeberiaSerNulo() {

        Producto producto = null;

        assertNull(producto);
    }

}
