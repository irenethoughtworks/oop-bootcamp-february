package oop.measurelab;

import static org.testng.Assert.assertEquals;

import oop.measurelab.Inch;
import oop.measurelab.Meter;
import org.testng.annotations.Test;

public class InchTest {

  @Test
  public void itShouldAddTwoInchValues() {
    Inch inch1 = new Inch(2);
    Inch inch2 = new Inch(2);
    assertEquals(inch1.add(inch2), new Inch(4));
  }

  @Test
  public void itShouldAddInchesAndMeters() {
    Inch inches = new Inch(2);
    Meter meters = new Meter(1);
    assertEquals(inches.add(meters), new Inch(41.37008));
  }

}
