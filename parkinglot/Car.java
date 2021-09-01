package parkinglot;

public class Car {

	private String carNumber;
	private String carColor;

  public Car (String carNumber,String carColor)
  {
	  if(carNumber == null || carColor == null) {
			throw new IllegalArgumentException("Both registrationNumber & Color should not be null");
		}
		this.carNumber = carNumber;
		this.carColor = carColor;
	}
 
  public String getColor() {
		return this.carColor;
	}
	
  public String getRegistrationNumber() {
		return this.carNumber;
}
}
