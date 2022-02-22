package oop;

public class DistanceComparator {

  public static final double FEET_TO_METER_CONVERSION = 0.3048;

  public static boolean areEquivalent(double feet, double meters) {
    return feet * FEET_TO_METER_CONVERSION == meters;
  }
}
