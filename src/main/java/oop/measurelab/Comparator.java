package oop.measurelab;

public class Comparator {

  public static final double PRECISION = 0.0001;

  public static boolean distancesAreEqual(Distance measure1, Distance measure2) {
    return areMeasuresEqual(measure1, measure2);
  }

  public static boolean volumesAreEqual(Volume measure1, Volume measure2) {
    return areMeasuresEqual(measure1, measure2);
  }

  private static boolean areMeasuresEqual(Measure measure1, Measure measure2) {
    return Math.abs(measure1.to(measure2.getName()) - measure2.getValue()) < PRECISION;
  }
}
