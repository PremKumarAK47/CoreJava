package hotelMangement;

import java.util.Scanner;

public class Main {
	
	public Hotel provideFood(int amount)
	{
		Hotel hotel= null;
		
		if(amount>500)
		{
			hotel=new TajHotel();
		}
		else if(amount > 200 && amount <=500)
			hotel=new RoadSideHotel();
		
		
		return hotel;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Main m= new Main();
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter amount to get the food from Specific Hotel ");
            int amount= sc.nextInt();
            sc.close();
		Hotel h1= m.provideFood(amount);
		if(h1!=null)
		{
			h1.chickenBiryani();
			h1.masalaDosa();
		}
		else
		{
			System.out.println("Amount should be Greater than 200 ");
		}
	}

}
