package oop;

import java.util.HashMap;
import java.util.Map;

public class Foot extends Distance {

  private final Map<MeasureName, Double> conversion = new HashMap<>();
  {
    conversion.put(MeasureName.METER, 0.3048);
  }

  public Foot(double value) {
    super(MeasureName.FOOT, value);
  }

  @Override
  Map<MeasureName, Double> getConversion() {
    return conversion;
  }

}
