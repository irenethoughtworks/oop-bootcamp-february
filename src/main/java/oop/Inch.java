package oop;

import java.util.HashMap;
import java.util.Map;

public class Inch extends DistanceMeasure {

    private final Map<MeasureName, Double> conversion = new HashMap<>();
    {
        conversion.put(MeasureName.YARD, 0.0278);
    }

    public Inch(double value) {
        super(MeasureName.INCH, value);
    }

    @Override
    Map<MeasureName, Double> getConversion() {
        return conversion;
    }
}
