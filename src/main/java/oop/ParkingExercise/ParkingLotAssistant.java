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
        return parkingLots.stream()
            .filter(parkingLot -> parkingLot.getCapacity() < 0.80d)
            .findFirst()
            .map(parking -> {
                parking.park(myCar);
                return parking.getName();
            })
            .orElse("Parkings are full!");
    }
}
