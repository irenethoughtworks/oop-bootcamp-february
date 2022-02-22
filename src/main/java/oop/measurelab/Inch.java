package oop.measurelab;

import java.util.HashMap;
import java.util.Map;

public class Inch extends Distance {

    private final Map<MeasureName, Double> conversion = new HashMap<>();
    {
        conversion.put(MeasureName.YARD, 0.0278);
        conversion.put(MeasureName.INCH, 1d);
    }

    public Inch(double value) {
        super(MeasureName.INCH, value);
    }

    @Override
    Map<MeasureName, Double> getConversion() {
        return conversion;
    }

    public Inch add(Distance other) {
        return new Inch(other.to(this.getName()) + this.getValue());
    }
}
