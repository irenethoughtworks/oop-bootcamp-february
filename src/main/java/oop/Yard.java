package oop;

import java.util.HashMap;
import java.util.Map;

public class Yard implements Measure {

    private final Map<String, Double> conversion = new HashMap<>();

    private double value;

    public Yard(double value) {
        this.value = value;
    }

    @Override
    public String getName() {
        return "yard";
    }

    @Override
    public double getValue() {
        return this.value;
    }

    @Override
    public double to(String measureName) {
        return conversion.get(measureName) * this.value;
    }
}
