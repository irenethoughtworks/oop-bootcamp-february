package oop.ParkingExercise;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class CarTest {

  @Test
  public void itShouldParkMyCarSuccessfully() {
     Car car = new Car();
     assertTrue(car.park());
  }

}
