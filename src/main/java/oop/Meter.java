package oop;

import java.util.HashMap;
import java.util.Map;

public class Meter extends DistanceMeasure {

  private final Map<MeasureType, Double> conversion = new HashMap<>();
  {
    conversion.put(MeasureType.CENTIMETER, 100.);
  }

  public Meter(double value) {
    super(MeasureType.METER, value);
  }

  @Override
  Map<MeasureType, Double> getConversion() {
    return conversion;
  }
}
