package oop;

import java.util.HashMap;
import java.util.Map;

public class Foot extends DistanceMeasure {

  private final Map<MeasureType, Double> conversion = new HashMap<>();
  {
    conversion.put(MeasureType.METER, 0.3048);
  }

  public Foot(double value) {
    super(MeasureType.FOOT, value);
  }

  @Override
  Map<MeasureType, Double> getConversion() {
    return conversion;
  }

}
