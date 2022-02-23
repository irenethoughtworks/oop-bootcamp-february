package oop.ParkingExercise;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class ParkingLotTest {

  @Test
  public void itShouldParkACarIfThereIsAnAvailableSpot() {
    ParkingLot parkingLot = new ParkingLot();
    Car car = new Car();

    assertTrue(parkingLot.park(car));

  }

}
