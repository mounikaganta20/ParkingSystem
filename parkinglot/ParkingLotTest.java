package parkinglot;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class ParkingLotTest {

	@Test
	void checkParkinglotWithGivenNumSlots() {
		ParkingLot sampleLot = new ParkingLot(10);
		assertEquals(10,sampleLot.getTotalNumberOfSlots());
	}
	
	@Test
	public void CheckwithGivenCarColor() {
		Car c = new Car("White","KA-01-HH-3141");
		assertEquals("White", c.getColor()); 
	}
	@Test
	public void CheckwithGivenCarRegNo() {
		Car c = new Car("White","KA-01-HH-3141");
		assertEquals("KA-01-HH-3141", c.getRegistrationNumber()); 
	}
	
	@Test
	public void GiveAvailableSlotWhenSlotIsAvailable() {
	ParkingLot parkingLot = new ParkingLot(1);
	int slot = parkingLot.getNextSlot();
    assertEquals(1, slot);
     }
	@Test
	public void CheckwithParkCar() {
		ParkingLot parkingLot = new ParkingLot(5);
		int slot1 = parkingLot.parkCar("White","KA-01-HH-3141");
	    assertEquals(1, slot1);
	    int slot2 = parkingLot.parkCar("Red","Ap-01-HH-3141");
	    assertEquals(2, slot2);
	    
	     }
	@Test
	public void CheckwithUnParkCar() {
		ParkingLot parkingLot = new ParkingLot(5);
		int slot1 = parkingLot.parkCar("White","KA-01-HH-3141");
	    assertEquals(1, slot1);
	    int slot2 = parkingLot.parkCar("Red","Ap-01-HH-3141");
	    assertEquals(2, slot2);
	     parkingLot.unParking(2);
	    int slot3 = parkingLot.parkCar("Black","Ts-01-HH-3141");
		assertEquals(2, slot3);
	     }
	@Test
	public void CheckwithParkCarwithFullSlots() {
		ParkingLot parkingLot = new ParkingLot(3);
		int slot1 = parkingLot.parkCar("White","KA-01-HH-3141");
	    assertEquals(1, slot1);
	    int slot2 = parkingLot.parkCar("Red","Ap-01-HH-3141");
	    assertEquals(2, slot2);
	    int slot3 = parkingLot.parkCar("Black","Ts-01-HH-3141");
		assertEquals(3, slot3);
		int slot4 = parkingLot.parkCar("Grey","Ts-01-HH-3171");
		assertEquals(0, slot4);
	    
	     }
	
	 
	
}
