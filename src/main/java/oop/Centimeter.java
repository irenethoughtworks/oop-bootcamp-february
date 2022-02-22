package oop;

import java.util.HashMap;
import java.util.Map;

public class Centimeter extends DistanceMeasure {

  private final Map<MeasureType, Double> conversion = new HashMap<>();
  {
    conversion.put(MeasureType.METER, 0.01);
  }

  public Centimeter(double value) {
    super(MeasureType.CENTIMETER, value);
  }

  @Override
  Map<MeasureType, Double> getConversion() {
    return conversion;
  }
}
