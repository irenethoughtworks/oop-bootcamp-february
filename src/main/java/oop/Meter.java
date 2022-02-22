package oop;

import java.util.HashMap;
import java.util.Map;

public class Meter implements Measure {

  private final Map<String, Double> conversion = new HashMap<>();
  {
    conversion.put("centimeter", 100.);
  }

  private double value;

  public Meter(double value) {
    this.value = value;
  }

  @Override
  public String getName() {
    return "meter";
  }

  @Override
  public double getValue() {
    return this.value;
  }

  @Override
  public double to(String measureName) {
    return conversion.get(measureName) * this.value;
  }
}
