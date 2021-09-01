package parkinglot;

public class Car {

	
	//private String carColor;

//  public Car (String carNumber,String carColor)
//  {
//	  if(carNumber == null || carColor == null) {
//			throw new IllegalArgumentException("Both registrationNumber & Color should not be null");
//		}
//		this.carNumber = carNumber;
//		this.carColor = carColor;
//	}
// 
  
  int slotNum=0;
	String carColor;
  String registrationNum;
  
  public Car(int slot,String color,String regno)
  {
  	slotNum=slot;
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
	   	 return slotNum;
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
