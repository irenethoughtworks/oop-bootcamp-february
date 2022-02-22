package oop;

public class Chance {

  static public double calculateChanceOfTwoEvents(double eventA, double eventB) {
    return eventA * eventB;
  }

  static public double calculateChanceOfOccurrenceOfOneEventOrTheOther(double eventA, double eventB) {
    return eventA + eventB - (eventA * eventB);
  }
}
