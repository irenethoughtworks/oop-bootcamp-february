package oop;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class InchTest {

  @Test
  public void itShouldAddTwoInchValues() {

    Inch inch2 = new Inch(2);
    Inch inch1 = new Inch(2);
    assertEquals(inch1.add(inch2), new Inch(4));
  }

}
