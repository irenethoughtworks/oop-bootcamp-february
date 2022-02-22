package oop;

import java.util.HashMap;
import java.util.Map;

public class Meter implements Measure {

  private final Map<MeasureType, Double> conversion = new HashMap<>();
  {
    conversion.put(MeasureType.CENTIMETER, 100.);
  }

  private double value;

  public Meter(double value) {
    this.value = value;
  }

  @Override
  public MeasureType getName() {
    return MeasureType.METER;
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
