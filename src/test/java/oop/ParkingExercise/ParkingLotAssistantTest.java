package oop.ParkingExercise;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ParkingLotAssistantTest {

    public static final String MY_CAR = "myCar";
    public static final String PARKING_LOT = "Parking lot A";

    @Test
    public void itShouldParkACarInTheFirstAvailableParkingLot() {
        ParkingLotAssistant parkingLotAssistant = new ParkingLotAssistant();

        assertEquals(parkingLotAssistant.park(MY_CAR), PARKING_LOT);

    }
}
