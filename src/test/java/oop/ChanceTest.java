package oop;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class ChanceTest {

  @Test
  public void itShouldCalculateTheChanceOfTwoEvents() {
    double eventA = 0.1;
    double eventB = 0.2;
    assertEquals(Chance.calculateChanceOfTwoEvents(eventA, eventB), 0.02, 0.01);
  }

  @Test
  public void itShouldCalculateTheChanceOfOccurrenceOfOneEventOrTheOther() {
    double eventA = 0.1;
    double eventB = 0.2;
      assertEquals(Chance.calculateChanceOfOccurrenceOfOneEventOrTheOther(eventA, eventB), 0.28, 0.01);
  }
}


