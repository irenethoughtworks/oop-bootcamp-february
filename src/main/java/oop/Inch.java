package oop;

import java.util.HashMap;
import java.util.Map;

public class Inch implements Measure {

    private final Map<String, Double> conversion = new HashMap<>();
    {
        conversion.put("yard", 0.0278);
    }

    private double value;

    public Inch(double value) {
        this.value = value;
    }

    @Override
    public String getName() {
        return "inch";
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
