package oop;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class ChanceTest {

  @Test
  public void itShouldCalculateTheChanceOfTwoEvents() {
    Chance chance = new Chance();
    double eventA = 0.1;
    double eventB = 0.2;
    assertEquals(chance.calculateChanceOfTwoEvents(eventA, eventB), 0.02);
  }

  @Test
  public void itShouldCalculateTheChanceOfTwoOtherEvents() {
    Chance chance = new Chance();
    double eventA = 0.1;
    double eventB = 0.15;
    assertEquals(chance.calculateChanceOfTwoEvents(eventA, eventB), 0.03);
  }
}
