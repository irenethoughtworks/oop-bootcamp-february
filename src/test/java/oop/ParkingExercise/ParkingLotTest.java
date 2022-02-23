package oop.ParkingExercise;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ParkingLotTest {

    private Car car;
    private ParkingLot parkingLot;

    @BeforeMethod
    public void setUp() {
        parkingLot = new ParkingLot();
        car = new Car();
    }

    @Test
    public void itShouldParkACarInTheParkingLot() {
        assertTrue(parkingLot.park(car));
    }

    @Test
    public void itShouldRetrieveMyCarFromTheParkingLot() {
        assertEquals(parkingLot.retrieveCar(car), car);
    }
}
