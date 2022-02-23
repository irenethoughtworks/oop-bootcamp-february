package oop.ParkingExercise;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParkingLotTest {

  private ParkingLot parkingLot;
  private String MY_CAR = "myCar";

  @BeforeMethod
  public void setUp() {
    parkingLot = new ParkingLot();
  }

  @Test
  public void itShouldParkMyCarInTheParkingLot() {
    assertTrue(parkingLot.park(MY_CAR));
    assertTrue(parkingLot.getParkedCars().contains(MY_CAR));
  }

  @Test
  public void itShouldRetrieveMyCarFromTheParkingLot() {
    parkingLot.park(MY_CAR);
    assertEquals(parkingLot.retrieveCar(MY_CAR), MY_CAR);
    assertTrue(parkingLot.getParkedCars().isEmpty());
  }
}
