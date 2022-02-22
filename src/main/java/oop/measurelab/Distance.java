package oop.measurelab;

import java.util.HashMap;
import java.util.Map;

public abstract class Distance extends Measure {

    private final Map<MeasureName, Double> conversion = new HashMap<>();
    {
        conversion.put(MeasureName.CENTIMETER, 100.);
        conversion.put(MeasureName.INCH, 39.37008);
        conversion.put(MeasureName.METER, 1d);
        conversion.put(MeasureName.FOOT, 1/0.3048);
    }

    public Distance(MeasureName name, double value) {
        super(name, value);
    }

    @Override
    Map<MeasureName, Double> getConversion() {
        return conversion;
    }
}
