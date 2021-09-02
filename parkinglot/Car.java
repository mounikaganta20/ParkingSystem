package parkinglot;

public class Car {
  
  int slotNum=0;
  String carColor;
  String registrationNum;
  
  public Car(int slot,String color,String regno)
  {
  	slotNum=slot;
  	carColor=color;
  	registrationNum=regno;
  	
  }
  public Car(String color,String regno)
  {
  	carColor=color;
  	registrationNum=regno;
  }
  public String getColor() {
		return this.carColor;
	}
	
  public String getRegistrationNumber() {
		return this.registrationNum;
   }
  
  public int getSlotNumber() {
	   	 return this.slotNum;
	    }
  
	 public void setSlotNumber(int slotNum) {
	   	 this.slotNum = slotNum;
	    }
	 
	 public void setCarColors(String carColor) {
		 this.carColor = carColor;
	 }
	 
	 
	 public void setRegistrationNumer(String registrationNum) {
	   	 this.registrationNum = registrationNum;
	   }
}
