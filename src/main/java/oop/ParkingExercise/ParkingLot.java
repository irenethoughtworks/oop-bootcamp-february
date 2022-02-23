package oop.ParkingExercise;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

  private static final int MAX_CAPACITY = 3;
  private final List<String> cars;
  public boolean isFull = false;
  private final String name;

  public ParkingLot(String name) {
    cars = new ArrayList<>();
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public boolean park(String car) {
    return !isFull && addCarAndUpdateSize(car);
  }

  private boolean addCarAndUpdateSize(String car) {
    cars.add(car);
    if (cars.size() == MAX_CAPACITY) {
      isFull = true;
    }
    return true;
  }

  public String retrieveCar(String car) {
    cars.remove(car);
    if(cars.size() < MAX_CAPACITY) {
      isFull = false;
    }
    return car;
  }

  public List<String> getParkedCars() {
    return cars;
  }

  public boolean isFull() {
    return isFull;
  }
}
