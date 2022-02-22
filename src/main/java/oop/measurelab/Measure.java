package oop.measurelab;

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
        return (getConversion().get(name)/getConversion().get(this.name)) * this.value;
    }

    abstract Map<MeasureName, Double> getConversion();

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Measure measure = (Measure) o;
        return Double.compare(measure.value, value) == 0 &&
            name == measure.name;
    }
}

