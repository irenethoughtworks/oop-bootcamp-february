package oop.ParkingExercise;

import java.util.List;

import static java.util.function.Predicate.not;

public class ParkingLotAssistant {

    private List<ParkingLot> parkingLots;
    public ParkingLotAssistant(List<ParkingLot> parkingLots) {
     this.parkingLots = parkingLots;
    }

    public String park(String myCar) {
        return parkingLots.stream()
            .filter(not(ParkingLot::isFull))
            .findFirst()
            .map(parkingLot -> parkingLot.park(myCar) ? parkingLot.getName() : "Parkings are full!")
            .get();

    }
}
