package parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

	private int totalNumberofSlots;
	private Slot[] slotsInLot;
	private List<Token> activeTokens;
	private List<Token> tokenHistory;
	
	
	
	public ParkingLot(int totalNumberofSlots)
	{
		this.totalNumberofSlots=totalNumberofSlots;
		slotsInLot=new Slot[totalNumberofSlots];
		activeTokens=new ArrayList<>();
	}
	
	
	public Token parkACar(Car car)
	{
		if(isThereAFreeSlot())
		{
			Slot availableSlot=getTheNextFreeSlot();
			Token newToken=new Token(String.valueOf(System.currentTimeMillis()) ,availableSlot,car);
			this.activeTokens.add(newToken);
			
		}
		return null;
		
	}
    
	public void unparkCar(Token token)
	{
		for(Token tokenInLot: activeTokens)
		{
			
			if(tokenInLot.getTokenNumber()==token.getTokenNumber()){
				tokenHistory.add(token.updatecheckOutTime());
				activeTokens.remove(tokenInLot);
				
				
				
			}
			
		}
	}
	
	
	

	private Slot getTheNextFreeSlot() {
		// TODO Auto-generated method stub
		for(Slot slot:slotsInLot)
		{
			if(slot.isItFree())
			{
				return slot;
			}
		}
		
		return null;
	}


	private boolean isThereAFreeSlot() {
		// TODO Auto-generated method stub
		
		boolean isThereAFreeSlot=false;
		return false;
	}
	
}
