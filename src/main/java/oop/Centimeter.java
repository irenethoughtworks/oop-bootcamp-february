package oop;

import java.util.HashMap;
import java.util.Map;

public class Centimeter extends Distance {

  private final Map<MeasureName, Double> conversion = new HashMap<>();
  {
    conversion.put(MeasureName.METER, 0.01);
  }

  public Centimeter(double value) {
    super(MeasureName.CENTIMETER, value);
  }

  @Override
  Map<MeasureName, Double> getConversion() {
    return conversion;
  }
}
