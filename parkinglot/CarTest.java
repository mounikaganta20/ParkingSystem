package parkinglot;

import java.util.Scanner;

public class CarTest {
	

	public static void main(String[] args){  

		Scanner input = new Scanner(System.in);
		
		System.out.println("Parking area");
		while(true)
		{
		
		System.out.println("***********  Select the option: ******");
		System.out.println("1: Car parking");		
		System.out.println("2: RegistrationNum search");
		System.out.println("3: Color search");
		System.out.println("4: Display all cars ");
		System.out.println("5: Exit Car");
		System.out.println("6: Exit");
        int c = input.nextInt();
        CarTest ticketingSystem = new CarTest();

    	int slot1 = ticketingSystem.parkACar(new Car("KA-01-HH-1234", "White"));
        
        if(c==1)
		{
        	System.out.println("Enter car Reg No :");
        	String rgno=input.next();
        	System.out.println("Enter car Color :");
        	String color=input.next();
        	
        	      	
        	int no = 1;
			if(no==0)
        		System.out.println("No slots available please come again later");
        	else
        		System.out.println("Your car is parked at "+no+" slot.");
        			
		}
        else if(c==2)
        {
        	System.out.println("searching by reg no");
        	
        }
        else if(c==4)
        {
        	System.out.println("Showing all cars in parking");
        	
        	
        }
        else if(c==5)
        {
        	System.out.println("Return Slot num to exit from parking");
         	String slot=input.next();
           
			// 
         
          	//controller.unParking(slot);
        	//System.exit(1);
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

	private int parkACar(Car car) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	 	
}
