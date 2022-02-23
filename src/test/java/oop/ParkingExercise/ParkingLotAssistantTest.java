package oop.ParkingExercise;

import java.util.List;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ParkingLotAssistantTest {

    public static final String MY_CAR = "myCar";
    public static final String PARKING_LOT_A = "Parking lot A";
    public static final String PARKING_LOT_B = "Parking lot B";

    @Test
    public void itShouldParkACarInTheFirstAvailableParkingLot() {
        ParkingLotAssistant parkingLotAssistant =
            new ParkingLotAssistant(List.of(getFullParkingLot(), new ParkingLot(PARKING_LOT_B)));

        assertEquals(parkingLotAssistant.park(MY_CAR), PARKING_LOT_B);
    }

    private ParkingLot getFullParkingLot() {
        ParkingLot fullParkingLot = new ParkingLot(PARKING_LOT_A);
        fullParkingLot.park(MY_CAR);
        fullParkingLot.park(MY_CAR);
        fullParkingLot.park(MY_CAR);
        return fullParkingLot;
    }
}
