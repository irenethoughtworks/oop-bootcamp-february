package oop;

import java.util.Map;

public abstract class Measure {

    private double value;
    private MeasureName name;

    public Measure(MeasureName name, double value) {
        this.name = name;
        this.value = value;
    }

    public MeasureName getName() {
        return this.name;
    }
    public double getValue() {
        return this.value;
    }

    public double to(MeasureName name) {
        return getConversion().get(name) * this.value;
    }

    abstract Map<MeasureName, Double> getConversion();

}
