package oop;

import java.util.HashMap;
import java.util.Map;

public class Gallon implements Measure {

  private final Map<MeasureType, Double> conversion = new HashMap<>();
  {
    conversion.put(MeasureType.LITER, 3.7854);
  }

  private double value;

  public Gallon(double value) {
    this.value = value;
  }

  @Override
  public MeasureType getName() {
    return MeasureType.GALLON;
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
