package oop;

import java.util.HashMap;
import java.util.Map;

public class Inch implements Measure {

    private final Map<MeasureType, Double> conversion = new HashMap<>();
    {
        conversion.put(MeasureType.YARD, 0.0278);
    }

    private double value;

    public Inch(double value) {
        this.value = value;
    }

    @Override
    public MeasureType getName() {
        return MeasureType.INCH;
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
