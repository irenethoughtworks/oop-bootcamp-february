package oop;

import java.util.HashMap;
import java.util.Map;

public class Centimeter implements Measure {

  private final Map<String, Double> conversion = new HashMap<>();
  {
    conversion.put("meter", 0.01);
  }

  private double value;

  public Centimeter(double value) {
    this.value = value;
  }

  @Override
  public String getName() {
    return "centimeter";
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
