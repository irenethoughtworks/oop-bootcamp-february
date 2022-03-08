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
        new ParkingLotAssistant(
            List.of(createFullParkingLot(PARKING_LOT_A), new ParkingLot(PARKING_LOT_B)));

    assertEquals(parkingLotAssistant.park(MY_CAR), PARKING_LOT_B);
  }

  @Test
  public void itShouldNotParkAndReturnMessageWhenThereIsAllParkingsAreFull() {
    ParkingLotAssistant parkingLotAssistant = new ParkingLotAssistant(List.of(
        createFullParkingLot(PARKING_LOT_A), createFullParkingLot(PARKING_LOT_B)));

    
    assertEquals(parkingLotAssistant.park(MY_CAR), "Parkings are full!");
  }

  @Test
  public void itShouldOnlyParkACarIfParkingLotIsLessThan80PercentOfCapacity() {
    ParkingLotAssistant parkingLotAssistant =
        new ParkingLotAssistant(List.of(createFullParkingLot(PARKING_LOT_B), createAParkingLot(PARKING_LOT_A)));
    assertEquals(parkingLotAssistant.park(MY_CAR), PARKING_LOT_A);


  }

  private ParkingLot createFullParkingLot(String name) {
    ParkingLot fullParkingLot = new ParkingLot(name);
    fullParkingLot.park(MY_CAR);
    fullParkingLot.park(MY_CAR);
    fullParkingLot.park(MY_CAR);
    return fullParkingLot;
  }

  private ParkingLot createAParkingLot(String name) {
    ParkingLot fullParkingLot = new ParkingLot(name);
    fullParkingLot.park(MY_CAR);
    fullParkingLot.park(MY_CAR);
    return fullParkingLot;
  }
}
