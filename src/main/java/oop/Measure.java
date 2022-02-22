package oop;

import java.util.Map;

public abstract class Measure {

    private double value;
    private MeasureType name;

    public Measure(MeasureType name, double value) {
        this.name = name;
        this.value = value;
    }

    public MeasureType getName() {
        return this.name;
    }
    public double getValue() {
        return this.value;
    }

    public double to(MeasureType name) {
        return getConversion().get(name) * this.value;
    }

    abstract Map<MeasureType, Double> getConversion();

}
