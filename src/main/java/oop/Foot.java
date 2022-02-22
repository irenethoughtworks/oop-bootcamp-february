package oop;

import java.util.HashMap;
import java.util.Map;

public class Foot implements Measure {

  private final Map<MeasureType, Double> conversion = new HashMap<>();
  {
    conversion.put(MeasureType.METER, 0.3048);
  }

  private double value;

  public Foot(double value) {
    this.value = value;
  }

  @Override
  public MeasureType getName() {
    return MeasureType.FOOT;
  }

  @Override
  public double getValue() {
    return this.value;
  }

  @Override
  public double to(MeasureType measureName) {
    return conversion.get(measureName) * this.value;
  }
}
