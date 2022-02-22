package oop;

import java.util.HashMap;
import java.util.Map;

public class Yard extends DistanceMeasure {

    private final Map<MeasureType, Double> conversion = new HashMap<>();

    public Yard(double value) {
        super(MeasureType.YARD, value);
    }

    @Override
    Map<MeasureType, Double> getConversion() {
        return conversion;
    }
}
