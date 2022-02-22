package oop;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class DistanceComparatorTest {

    @Test
    public void itShouldReturnTrueIfFeetAndMetersAreEquivalent() {
        Meter meter = new Meter(1.524);
        Foot foot = new Foot(5);
        assertTrue(DistanceComparator.distancesAreEqual(foot, meter));
    }

    @Test
    public void itShouldReturnTrueIfInchesAndYardsAreEquivalent() {
        Inch inch = new Inch(5.0);
        Yard yard = new Yard(0.1389);
        assertTrue(DistanceComparator.distancesAreEqual(inch, yard));
    }

    @Test
    public void itShouldReturnFalseIfInchesAndYardsAreEquivalent() {
        Inch inch = new Inch(1.0);
        Yard yard = new Yard(1.0);
        assertFalse(DistanceComparator.distancesAreEqual(inch, yard));
    }

    @Test
    public void itShouldReturnTrueIfMetersAndCentimetersAreEquivalent() {
        Meter meters = new Meter(2);
        Centimeter centimeters = new Centimeter(200);
        assertTrue(DistanceComparator.distancesAreEqual(meters, centimeters));
    }

    @Test
    public void itShouldReturnTrueIfGallonsAndLitersAreEquivalent() {
        Gallon gallons = new Gallon(4);
        Liter liters = new Liter(15.1416);
        assertTrue(DistanceComparator.volumesAreEqual(gallons, liters));
    }
}
