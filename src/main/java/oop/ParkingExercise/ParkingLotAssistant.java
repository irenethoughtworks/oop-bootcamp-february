package oop.ParkingExercise;

import java.util.List;

public class ParkingLotAssistant {

    private List<ParkingLot> parkingLots;
    public ParkingLotAssistant(List<ParkingLot> parkingLots) {
     this.parkingLots = parkingLots;
    }

    public String park(String myCar) {
        return "Parking lot A";
    }
}
