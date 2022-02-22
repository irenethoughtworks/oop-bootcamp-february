package oop;

public class DistanceComparator {

  public static final double PRECISION = 0.0001;

  public static boolean distancesAreEqual(DistanceMeasure measure1, DistanceMeasure measure2) {
    return Math.abs(measure1.to(measure2.getName()) - measure2.getValue()) < PRECISION;
  }

  public static boolean volumesAreEqual(VolumeMeasure measure1, VolumeMeasure measure2) {
    return Math.abs(measure1.to(measure2.getName()) - measure2.getValue()) < PRECISION;
  }
}
