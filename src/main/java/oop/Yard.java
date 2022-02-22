package oop;

import java.util.HashMap;
import java.util.Map;

public class Yard extends DistanceMeasure {

    private final Map<MeasureName, Double> conversion = new HashMap<>();

    public Yard(double value) {
        super(MeasureName.YARD, value);
    }

    @Override
    Map<MeasureName, Double> getConversion() {
        return conversion;
    }
}
