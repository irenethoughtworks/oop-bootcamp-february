package oop;

import java.util.HashMap;
import java.util.Map;

public class Centimeter implements Measure {

  private final Map<MeasureType, Double> conversion = new HashMap<>();
  {
    conversion.put(MeasureType.METER, 0.01);
  }

  private double value;

  public Centimeter(double value) {
    this.value = value;
  }

  @Override
  public MeasureType getName() {
    return MeasureType.CENTIMETER;
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
