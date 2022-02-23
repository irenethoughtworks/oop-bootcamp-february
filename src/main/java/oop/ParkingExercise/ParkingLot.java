package oop.ParkingExercise;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

  private List<String> cars;
  private boolean isFull;

  public ParkingLot() {
    cars = new ArrayList<>();
    isFull = false;
  }

  public boolean park(String car) {
    if (isFull) {
      return false;
    } else {
      cars.add(car);
      return true;
    }
  }

  public String retrieveCar(String car) {
    cars.remove(car);
    return car;
  }

  public List<String> getParkedCars() {
    return cars;
  }
}
