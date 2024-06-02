package assessment_2;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Mid_Switch_Case_Statement 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###,###.00");
		
		double fare = 0.0;
		char passenger_type;
		char business_class;
		double discount = 0.0;
		double business_class_charge = 0.0;
		double new_fare = 0.0; 
		
		
		//INPUT
		System.out.print("Enter Fare: ");
		fare = input.nextDouble();
		
		System.out.print("Passenger Type [O: Ordinary, S: Student, C: Senior Citizen]: ");
		passenger_type = input.next().charAt(0);
		
		//Passenger Type Switch-Case
		switch (passenger_type)
		{
			case 'O','o': discount = 0;
					  break;
			case 'S','s': discount = fare*0.05;
					  break;
			case 'C','c': discount = fare*0.10;
					  break;
			default: discount = 0;
					 fare = 0;
					  break; 
		
		}
		
		System.out.print("Travelling in business class? [Y/N]:");
		business_class = input.next().charAt(0);
		
		//Business Class Switch-Case
		switch (business_class)
		{
			case 'Y','y': 
					switch (passenger_type)
					{
						case 'O','o': business_class_charge = 1000;
								  break;
						case 'S','s': business_class_charge = 700;
								  break;
						case 'C','c': business_class_charge = 500;
					              break;
						default:  business_class_charge = 0;
							 	  fare = 0;
							 	  break; 
					}
					  break;
			case 'N','n': business_class_charge = 0;
					  break;
			default : business_class_charge = 0;
					  fare = 0;
					  break;		
		}
		
		//New Fare Formula
		new_fare = fare-discount+business_class_charge;
		
		
		//Output
		System.out.println("\nDiscount " +  df.format(discount));
		System.out.println("Business class charge: " + df.format(business_class_charge));
		System.out.println("New Fare: " +  df.format(new_fare));
		
	}

}
