package oop;

import java.util.HashMap;
import java.util.Map;

public class Gallon extends VolumeMeasure {

  private final Map<MeasureType, Double> conversion = new HashMap<>();
  {
    conversion.put(MeasureType.LITER, 3.7854);
  }

  public Gallon(double value) {
    super(MeasureType.GALLON, value);
  }

  @Override
  Map<MeasureType, Double> getConversion() {
    return conversion;
  }

}
