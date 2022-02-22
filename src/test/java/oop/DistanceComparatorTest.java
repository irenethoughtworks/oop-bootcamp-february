package oop;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class DistanceComparatorTest {

  @Test
  public void itShouldReturnTrueIfFeetAndMetersAreEquivalent() {
      assertTrue(DistanceComparator.areEquivalent(5.0, 1.524));
  }
}
