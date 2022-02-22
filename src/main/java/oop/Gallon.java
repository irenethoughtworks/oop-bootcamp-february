package oop;

import java.util.HashMap;
import java.util.Map;

public class Gallon extends Volume {

  private final Map<MeasureName, Double> conversion = new HashMap<>();
  {
    conversion.put(MeasureName.LITER, 3.7854);
  }

  public Gallon(double value) {
    super(MeasureName.GALLON, value);
  }

  @Override
  Map<MeasureName, Double> getConversion() {
    return conversion;
  }

}
