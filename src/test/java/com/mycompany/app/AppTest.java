package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals; // Se espera que el resultado sea igual al valor esperado
import static org.junit.Assert.assertFalse; // Se espera que el resultado sea falso
import static org.junit.Assert.assertTrue; // Se espera que el resultado sea verdadero

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testAdd() {
        App app = new App(); // creamos la instancia
        int result = app.add(2, 3); // llamamos la funcion y la guardamos en la variable
        assertEquals(5, result); // comparamos la variable con el resultado que esperamos
    }

    @Test
    public void testCalculateArea() {
        App app = new App();
        int result = app.calculateArea(5, 3);
        assertEquals(15, result);
    }

    @Test
    public void testIsValidStringNull() {
        App app = new App();
        assertFalse(app.isValidString(null));
    }

    @Test
    public void testIsValidStringValid() {
        App app = new App();
        assertTrue(app.isValidString("hello"));
    }
}
