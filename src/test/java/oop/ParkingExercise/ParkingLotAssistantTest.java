package oop.ParkingExercise;

import java.util.List;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ParkingLotAssistantTest {

    public static final String MY_CAR = "myCar";
    public static final String PARKING_LOT = "Parking lot A";

    @Test
    public void itShouldParkACarInTheFirstAvailableParkingLot() {
        List<ParkingLot> parkingLots = List.of(new ParkingLot("parkingA"), new ParkingLot("ParkingB"), new ParkingLot(PARKING_LOT));
        ParkingLotAssistant parkingLotAssistant = new ParkingLotAssistant(parkingLots);

        assertEquals(parkingLotAssistant.park(MY_CAR), PARKING_LOT);
    }
}
