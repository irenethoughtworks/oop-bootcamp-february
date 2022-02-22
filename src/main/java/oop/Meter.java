package oop;

import java.util.HashMap;
import java.util.Map;

public class Meter extends Distance {

  private final Map<MeasureName, Double> conversion = new HashMap<>();
  {
    conversion.put(MeasureName.CENTIMETER, 100.);
  }

  public Meter(double value) {
    super(MeasureName.METER, value);
  }

  @Override
  Map<MeasureName, Double> getConversion() {
    return conversion;
  }
}
