package parkinglot;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {

	Map<Integer,Car> cars=new HashMap<Integer,Car>();
	Integer totalNumberofSlots=5;
	
	public ParkingLot(int totalNumberofSlots) {
		   this.totalNumberofSlots = totalNumberofSlots;
	   }
	
	public Integer getTotalNumberOfSlots() {
		return totalNumberofSlots;
	}
	public int parkCar(String color,String regNo)
	   {
		   int slotno=getNextSlot();
		   
		   Car car=new Car(slotno, color,regNo);
		   cars.put(slotno, car);  
		   return slotno;
	   }
	   
	 public int getNextSlot()
	   {	 
		 System.out.println("Cars Parked in ParkingLot "+cars.size() );
		   int next=0;
		   for(int i=1;i<=totalNumberofSlots;i++ )
		   {	
			  
			   if(cars.get(i) == null)
			   {
			   System.out.println("Avilable slot is "+i);
			   return i;		   
			   }
		   }	   
		   return next;	   
	   }
	 
	 
	 public void showDetails() {
	     if((cars.size())== 0) {
	         System.out.println("\n ********* No cars is parked in the Parking Slot ********* \n");
	         return;
	     }
	     for (Map.Entry<Integer,Car> entry : cars.entrySet()) {
	         System.out.println("\n **** car details slot :" + entry.getKey());
	         System.out.println("car registration number: " + entry.getValue().getRegistrationNumber());
	         System.out.println("car color: " + entry.getValue().getColor());
	     }
	 }
	 
	
	public Map<Integer, Car> unParking(int slot) 
	 {  
	  cars.remove(slot);
	  System.out.println("Slot removed "+slot);
	  return cars; 		 
	  }
	public  void searchCarRegistrationNo(String regno) {
		 if(cars.size()==0) {
			 System.out.println("\n No Cars in parking lot \n");
		 }else {
			 boolean status = false;
		      for (Map.Entry<Integer, Car> entry : cars.entrySet()) {
		          if(entry.getValue().getRegistrationNumber().equalsIgnoreCase(regno)) {
		              System.out.println("slot number:" + entry.getValue().getSlotNumber());
		              status = true;
		              break;
		          }
		      }
		      if(!status) {
		          System.out.println("\n Given RegNo Car is Not Present in Parking Lot \n");
		      }
		 }
		 
		
	 }
	 public void searchCarColor(String color) {
		 if(cars.size()==0) {
			 System.out.println("\n No Cars in parking lot \n");
		 }else {
			 boolean status = false;
		      for (Map.Entry<Integer, Car> entry : cars.entrySet()) {
		          if(entry.getValue().getColor().equalsIgnoreCase(color)) {
		              System.out.println("slot number: " + entry.getValue().getSlotNumber());
		              System.out.println("Reg number: " + entry.getValue().getRegistrationNumber());
		              status = true;
		             
		          }
		      }
		      if(!status) {
		          System.out.println("\n Given Colour Car is Not Present in Parking Lot \n");
		      }
		 }
	 }

	

}
