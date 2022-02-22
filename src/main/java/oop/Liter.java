package oop;

import java.util.HashMap;
import java.util.Map;

public class Liter extends Volume {

  private final Map<MeasureName, Double> conversion = new HashMap<>();

  public Liter(double value) {
    super(MeasureName.LITER, value);
  }

  @Override
  Map<MeasureName, Double> getConversion() {
    return conversion;
  }
}
