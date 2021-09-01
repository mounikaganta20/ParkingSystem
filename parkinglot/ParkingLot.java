package parkinglot;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {

	
	private Slot[] slotsInLot;
	private List<Token> activeTokens;
	private List<Token> tokenHistory;
	
	Map<Integer,Car> cars=new HashMap<Integer,Car>();
	Integer totalNumberofSlots=5;
	
	
	public int parkCar(String color,String regNo)
	   {
		   int slotno=getNextSlot();
		   
		   Car car=new Car(slotno, color,regNo);
		   cars.put(slotno, car);  
		   return slotno;
	   }
	   
	 public int getNextSlot()
	   {	 
		 System.out.println("Avilable cars in parking "+cars.size() );
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
	         System.out.println("\n *********  slots are empty ********* \n");
	         return;
	     }
	     for (Map.Entry<Integer,Car> entry : cars.entrySet()) {
	         System.out.println("\n **** car details slot :" + entry.getKey());
	         System.out.println("car registration number: " + entry.getValue().getRegistrationNumber());
	         System.out.println("car color: " + entry.getValue().getColor());
	     }
	 }
	 
	
	public Map<Integer, Car> unParking(String slot) 
	 {
	   String info = slot;
	   int slotinfo=Integer.parseInt(info);  
	  cars.remove(slotinfo);
	  System.out.println("Slot removed "+info);
	  return cars;
	 		 
	  }

//	public ParkingLot(int totalNumberofSlots)
//	{
//		this.totalNumberofSlots=totalNumberofSlots;
//		slotsInLot=new Slot[totalNumberofSlots];
//		activeTokens=new ArrayList<>();
//	}
//	
	

	

//	public ParkingLot() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public Token parkACar(Car car)
//	{
//		if(isThereAFreeSlot())
//		{
//			Slot availableSlot=getTheNextFreeSlot();
//			Token newToken=new Token(String.valueOf(System.currentTimeMillis()) ,availableSlot,car);
//			this.activeTokens.add(newToken);
//			
//		}
//		return null;
//		
//	}
//    
//	public void unparkCar(Token token)
//	{
//		for(Token tokenInLot: activeTokens)
//		{
//			
//			if(tokenInLot.getTokenNumber()==token.getTokenNumber()){
//				tokenHistory.add(token.updatecheckOutTime());
//				activeTokens.remove(tokenInLot);
//				
//				
//				
//			}
//			
//		}
//	}
//	
//	
//	
//
//	private Slot getTheNextFreeSlot() {
//		// TODO Auto-generated method stub
//		for(Slot slot:slotsInLot)
//		{
//			if(slot.isItFree())
//			{
//				return slot;
//			}
//		}
//		
//		return null;
//	}
//
//
//	private boolean isThereAFreeSlot() {
//		// TODO Auto-generated method stub
//		
//		boolean isThereAFreeSlot=false;
//		return false;
//	}
//	
//




}
