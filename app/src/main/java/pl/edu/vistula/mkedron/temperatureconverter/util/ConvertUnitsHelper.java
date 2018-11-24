package pl.edu.vistula.mkedron.temperatureconverter.util;

/**
 * Created by mkked on 24.11.2018.
 */

public class ConvertUnitsHelper {

    public Float convertCel2Fahr(Float celValue) {
        return ((celValue * 9) / 5) + 32;
    }

    public Float convertFahtr2Cel(Float fahrValue) {
        return ((fahrValue - 32) * 5 / 9);
    }
}
