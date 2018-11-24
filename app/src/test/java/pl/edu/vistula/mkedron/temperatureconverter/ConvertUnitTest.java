package pl.edu.vistula.mkedron.temperatureconverter;

import org.junit.Before;
import org.junit.Test;

import pl.edu.vistula.mkedron.temperatureconverter.util.ConvertUnitsHelper;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mkked on 24.11.2018.
 */

public class ConvertUnitTest {

    private ConvertUnitsHelper convertUnitsHelper;

    @Before
    public void init() {
        convertUnitsHelper = new ConvertUnitsHelper();
    }

    @Test
    public void testConvertFahrenheitToCelsius() {
        Float actual = convertUnitsHelper.convertCel2Fahr(new Float(100));
        // expected value is 212
        Float expected = new Float(212);
        // use this method because float is not precise
        assertEquals("Conversion from celsius to fahrenheit failed", expected, actual, 0.001);
    }

    @Test
    public void testConvertCelsiusToFahrenheit() {
        Float actual = convertUnitsHelper.convertFahtr2Cel(new Float(212));
        // expected value is 100
        Float expected = new Float(100);
        // use this method because float is not precise
        assertEquals("Conversion from celsius to fahrenheit failed", expected, actual, 0.001);
    }

}