package oop;

import java.util.HashMap;
import java.util.Map;

public class Yard implements Measure {

    private final Map<MeasureType, Double> conversion = new HashMap<>();

    private double value;

    public Yard(double value) {
        this.value = value;
    }

    @Override
    public MeasureType getName() {
        return MeasureType.YARD;
    }

    @Override
    public double getValue() {
        return this.value;
    }

    @Override
    public double to(MeasureType measureName) {
        return conversion.get(measureName) * this.value;
    }
}
