/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testromanos;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Darien
 */
public class TestNumerosRomanos {

    public TestNumerosRomanos() {
    }

    // Insertar la anotación test
    @Test
    public void deberiaRetornarElNumeroRomano() {
        NumerosRomanos rn = new NumerosRomanos();
        String romano;
        romano = rn.convertir(1);
        assertEquals("I", rn.convertir(1));
        assertEquals("II", rn.convertir(2));
        assertEquals("III", rn.convertir(3));
        assertEquals("IV", rn.convertir(4));
        assertEquals("V", rn.convertir(5));
        assertEquals("VI", rn.convertir(6));
        assertEquals("VII", rn.convertir(7));
        assertEquals("VIII", rn.convertir(8));
        assertEquals("IX", rn.convertir(9));
        assertEquals("X", rn.convertir(10));
        assertEquals("XIV", rn.convertir(14));
        assertEquals("XIX", rn.convertir(19));
        assertEquals("XX", rn.convertir(20));
        assertEquals("XXXIII", rn.convertir(33));
        assertEquals("XXXIV", rn.convertir(34));
        assertEquals("XXXIX", rn.convertir(39));
        assertEquals("XLIX", rn.convertir(49));
        assertEquals("L", rn.convertir(50));
        assertEquals("LXXXIX", rn.convertir(89));
        assertEquals("XCIX", rn.convertir(99));
        assertEquals("CXLIX", rn.convertir(149));
        assertEquals("CCCXLIX", rn.convertir(349));
        assertEquals("CDLVI", rn.convertir(456));

        //assertEquals("CDLVI", rn.convertir(3000));

    }

}
