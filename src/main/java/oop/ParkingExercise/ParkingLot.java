package oop.ParkingExercise;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

  private List<String> cars = new ArrayList();

  public boolean park(String car) {
    cars.add(car);
    return true;
  }

  public String retrieveCar(String car) {
    cars.remove(car);
    return car;
  }

  public List<String> getParkedCars() {
    return cars;
  }
}
