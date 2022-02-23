package oop.ParkingExercise;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParkingLotTest {

  private ParkingLot parkingLot;
  private static final String MY_CAR = "myCar";
  private static final String PARKING_LOT = "ParkingA";

  @BeforeMethod
  public void setUp() {
    parkingLot = new ParkingLot(PARKING_LOT);
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

  @Test
  public void itShouldNotParkMyCarIfTheParkingIsFull() {
    ParkingLot parkingLot = new ParkingLot(PARKING_LOT);
    parkingLot.park("car 1");
    parkingLot.park("car 2");
    parkingLot.park("car 3");
    assertFalse(parkingLot.park(MY_CAR));
  }

  @Test
  public void itShouldReturnTheCapacity() {

    assertEquals(parkingLot.getCapacity(), 0.75);

  }
}
