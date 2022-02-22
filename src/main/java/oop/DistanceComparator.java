package oop;

public class DistanceComparator {

  public static final double FEET_TO_METER_CONVERSION = 0.3048;

  public static final double PRECISION = 0.0001;

  public static boolean areEquivalent(double feet, double meters) {
    return feet * FEET_TO_METER_CONVERSION == meters;
  }

  public static boolean areEquivalent(Measure measure1, Measure measure2) {
    return Math.abs(measure1.to(measure2.getName()) - measure2.getValue()) < PRECISION;
  }
}
