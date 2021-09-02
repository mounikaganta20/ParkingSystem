package parkinglot;

import java.util.HashMap;
import java.util.Scanner;


public class CarTest {
	

	public static void main(String[] args){  

		Scanner input = new Scanner(System.in);
		HashMap<Integer, Car> cars = new HashMap<Integer, Car>();
		ParkingLot cp  = new ParkingLot(10);

		System.out.println("Parking Space");
		while(true)
		{
		
		System.out.println("***********  Select the option: ******");
		System.out.println("1: Car parking");		
		System.out.println("2: RegistrationNum search");
		System.out.println("3: Color search");
		System.out.println("4: Display All Cars Parked ");
		System.out.println("5: Exit Car");
		System.out.println("6: Exit");
        int c = input.nextInt();
       
       
        if(c==1)
		{
        	System.out.println("Enter car Reg No :");
        	String rgno=input.next();
        	System.out.println("Enter car Color :");
        	String color=input.next();
        	
        	
         	int slotinfo = cp.parkCar(color,rgno);    	
        	
			if(slotinfo==0)
        		System.out.println("No slots available ,Parking is Full");
        	else
        		System.out.println("Your car is parked at "+slotinfo+" slot.");
        			
		}
        else if(c==2)
        {  
        	System.out.println("Search by Reg No");
        	String regNo=input.next();
        	cp.searchCarRegistrationNo(regNo);
        	
        	
        }
        else if(c==3)
        {
        	System.out.println("Search by Color");
        	String color=input.next();
        	cp.searchCarColor(color);
        	
        	
        	
        }
        else if(c==4)
        {
        	System.out.println("Showing All Cars Info in parking");
        	cp.showDetails();
        	
        	
        	
        }
        else if(c==5)
        {
        	System.out.println("Return Slot No to Unpark a Car");
         	int slot=input.nextInt();
         	cp.unParking(slot);  
           
        } 
        else if(c==6)
        {
        	System.out.println("Thank you for choosing parking");
      
        	System.exit(1);
        }
        else
        {
        	System.out.println("Enter valid input");
        }
        
		}
	    }

	

	 	
}
