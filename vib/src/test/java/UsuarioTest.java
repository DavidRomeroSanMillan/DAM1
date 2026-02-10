/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.mycompany.vib.Usuario;

public class UsuarioTest {

    // 1 Test: crear usuario
    @Test
    void crearUsuarioValido() {
        Usuario u = new Usuario("Ana", 25);

        assertEquals("Ana", u.getNombre());
        assertEquals(25, u.getEdad());
        assertTrue(u.isActivo());
    }

    // 2 Test: usuario activo por defecto
    @Test
    void usuarioNuevoEstaActivo() {
        Usuario u = new Usuario("David", 25);
        assertTrue(u.isActivo());
    }

    // 3 ️Test: desactivar usuario
    @Test
    void desactivarUsuarioCambiaEstado() {
        Usuario u = new Usuario("David", 25);
        u.desactivar();
        assertFalse(u.isActivo());
    }

    // 4 mayor de edad
    @Test
    void usuarioMayorDeEdad() {
        Usuario u = new Usuario("David", 25);
        assertTrue(u.getEdad() > 17);
    }

    // 5 menor de edad
    @Test
    void usuarioMenorDeEdad() {
        Usuario u = new Usuario("David", 17);
        assertTrue(u.getEdad() < 18);
    }

    // 6 nombre vacío lanza excepción
    // assertThrows -> Este código debe lanzar esta excepción. Si no la lanza, el test falla.”
    @Test
    void nombreVacioLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Usuario("h",20);
        }, "Fallo del test");
    }

    // 7 nombre null lanza excepción
    @Test
    void nombreNullLanzaExcepcion() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Usuario(null, 20);

        }, "Error");
    }

    // 8 edad negativa lanza excepción
    @Test
    void edadNegativaLanzaExcepcion() {
    assertThrows(IllegalArgumentException.class, () -> {
            new Usuario("Ana", -10);

        }, "Error");
    }

}
