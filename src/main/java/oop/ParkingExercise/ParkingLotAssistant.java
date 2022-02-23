package oop.ParkingExercise;

import java.util.List;
import java.util.Optional;

import static java.util.function.Predicate.not;

public class ParkingLotAssistant {

  private final List<ParkingLot> parkingLots;

  public ParkingLotAssistant(List<ParkingLot> parkingLots) {
    this.parkingLots = parkingLots;
  }

  public String park(String myCar) {
    Optional<ParkingLot> parkingLot = parkingLots.stream()
        .filter(not(ParkingLot::isFull))
        .findFirst();

    if (parkingLot.isEmpty()) {
      return "Parkings are full!";
    }
    ParkingLot parking = parkingLot.get();
    parking.park(myCar);
    return parking.getName();
  }
}
