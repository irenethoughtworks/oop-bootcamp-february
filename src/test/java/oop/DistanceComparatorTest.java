package oop;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class DistanceComparatorTest {

    @Test
    public void itShouldReturnTrueIfFeetAndMetersAreEquivalent() {
        assertTrue(DistanceComparator.areEquivalent(5.0, 1.524));
    }

    @Test
    public void itShouldReturnTrueIfInchesAndYardsAreEquivalent() {
        Inch inch = new Inch(5.0);
        Yard yard = new Yard(0.1389);
        assertTrue(DistanceComparator.areEquivalent(inch, yard));
    }

    @Test
    public void itShouldReturnFalseIfInchesAndYardsAreEquivalent() {
        Inch inch = new Inch(1.0);
        Yard yard = new Yard(1.0);
        assertFalse(DistanceComparator.areEquivalent(inch, yard));
    }
}
