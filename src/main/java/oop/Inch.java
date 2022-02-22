package oop;

import java.util.HashMap;
import java.util.Map;

public class Inch extends DistanceMeasure {

    private final Map<MeasureType, Double> conversion = new HashMap<>();
    {
        conversion.put(MeasureType.YARD, 0.0278);
    }

    public Inch(double value) {
        super(MeasureType.INCH, value);
    }

    @Override
    Map<MeasureType, Double> getConversion() {
        return conversion;
    }
}
