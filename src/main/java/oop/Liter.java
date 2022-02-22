package oop;

import java.util.HashMap;
import java.util.Map;

public class Liter extends VolumeMeasure {

  private final Map<MeasureType, Double> conversion = new HashMap<>();

  public Liter(double value) {
    super(MeasureType.LITER, value);
  }

  @Override
  Map<MeasureType, Double> getConversion() {
    return conversion;
  }
}
