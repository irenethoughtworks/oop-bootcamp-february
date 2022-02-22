package oop.measurelab;

import java.util.HashMap;
import java.util.Map;

public abstract class Volume extends Measure {

    private final Map<MeasureName, Double> conversion = new HashMap<>();
    {
        conversion.put(MeasureName.LITER, 1d);
        conversion.put(MeasureName.GALLON, 1/3.7854);
    }

    public Volume(MeasureName name, double value) {
        super(name, value);
    }

    @Override
    Map<MeasureName, Double> getConversion() {
        return conversion;
    }
}
