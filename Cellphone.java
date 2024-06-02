import java.text.DecimalFormat;
import java.util.Scanner;

public class Cellphone 
{

	 public static void main(String args[])
	 { 
       
	        Scanner input = new Scanner (System.in);
	        Scanner input2 = new Scanner (System.in);
	        DecimalFormat df = new DecimalFormat("#,###,###.00");
	        DecimalFormat df2 = new DecimalFormat("#");

	        String product_1 = "";
	        double product_1_price = 0.0; 
	        String product_2 = "";
	        double product_2_price = 0.0;
	        String product_3 = "";
	        double product_3_price = 0.0;
	        
	        double cash_discount = 0.0;
	        double three_months = 0.0;
	        double six_months = 0.0;
	        double twelve_months = 0.0;
	        
	        char item;
	        
	        int mode_of_payment;
	        
	        double discount_interest_percentage = 0.0;
	        double discount_interest = 0.0;
	        double total_amount = 0.0;
	        double monthly_amortization = 0.0;
	        
	        //Sales Input
	        System.out.println("Sales Input:");
	         
	        System.out.print("\nEnter Product 1:\t");
	 		product_1 = input.nextLine();
	 		
	 		System.out.print("Enter Price:\t\t");
	 		product_1_price = input2.nextDouble();
	 		
	 		System.out.print("\nEnter Product 2:\t");
	 		product_2 = input.nextLine();
	 		
	 		System.out.print("Enter Price:\t\t");
	 		product_2_price = input2.nextDouble();
	 		
	 		System.out.print("\nEnter Product 3:\t");
	 		product_3 = input.nextLine();
	 		
	 		System.out.print("Enter Price:\t\t");
	 		product_3_price = input2.nextDouble();
	 		
	 		//Mode of Payment Terms 
	 		System.out.println("\nInput Mode of Payement Terms");
	 		
	 		System.out.print("\nCash Discount:\t\t");
	 		cash_discount = input2.nextDouble();
	 		System.out.println("\tYou input " + df2.format(cash_discount) + "% Discount for Cash");
	 		
	 		System.out.print("\n3 Months Installment:\t");
	 		three_months = input2.nextDouble();
	 		System.out.println("\tYou input " + df2.format(three_months) + "% Interest for 3 Months Installment");
	 		
	 		System.out.print("\n6 Months Installment:\t");
	 		six_months = input2.nextDouble();
	 		System.out.println("\tYou input " + df2.format(six_months) + "% Interest for 6 Months Installment");
	 		
	 		System.out.print("\n12 Months Installment:\t");
	 		twelve_months = input2.nextDouble();
	 		System.out.println("\tYou input " + df2.format(twelve_months) + "% Interest for 12 Months Installment");
	 		
	 		
	 		
	 		//Selection of Product
	 		System.out.println("\nMain Menu");
	 		
	 		System.out.println("\nPress I/i: " + product_1 + "\t\t$" + df.format(product_1_price));
	 		System.out.println("Press S/s: " + product_2 + "\t$" + df.format(product_2_price));
	 		System.out.println("Press X/x: " + product_3 + "\t$" + df.format(product_3_price));
	 		
	 		System.out.print("\nEnter Item:\t");
	 		item = input.next().charAt(0);
	 		
	 		switch (item)
			{
				case 'I','i': 
					System.out.println("Your Item is " + product_1);
					System.out.println("Price:\t\t$" + df.format(product_1_price));
					break;
				case 'S','s':
					System.out.println("Your Item is " + product_2);
					System.out.println("Price:\t\t$" + df.format(product_2_price));
					break;
				case 'X','x':
					System.out.println("Your Item is " + product_3);
					System.out.println("Price:\t\t$" + df.format(product_3_price));
					break;
				default: 
					System.out.println("You have entered a wrong input");
					break;
					
			}
	 		
	 		
	 		//Selection of Mode of Payment
	 		System.out.println("\nSelect Mode of Payment");
	 		
	 		System.out.println("\nPress 1: Cash\t\t\t" + df2.format(cash_discount) + "% Discount");
	 		System.out.println("Press 2: 3 Months Installment\t"+ df2.format(three_months) + "% Interest");
	 		System.out.println("Press 3: 6 Months Installment\t"+ df2.format(six_months) + "% Interest");
	 		System.out.println("Press 4: 12 Months Installment\t"+ df2.format(twelve_months) + "% Interest");
	 		
	 		System.out.print("\nEnter Mode of Payment:\t");
	 		mode_of_payment = input.nextInt();
	 		
	 		switch (mode_of_payment) 
	 		{
	 			case 1:			
			 		switch (item)
					{
						case 'I','i': 
			 				System.out.println("Mode of Payment:\tCash");
							System.out.println("Item is:\t\t" + product_1);
							System.out.println("Price:\t\t\t$" + df.format(product_1_price));
							
							discount_interest_percentage = cash_discount/100;
							
							discount_interest = product_1_price*discount_interest_percentage;
							
							System.out.println("Discount/Interest:\t$" + df.format(discount_interest));
							
							total_amount = product_1_price-discount_interest;
							
							System.out.println("Total Amount:\t\t$" + df.format(total_amount));
							
							monthly_amortization = 0;
							
							System.out.println("Montly Amortization:\t$" + df.format(monthly_amortization));
							
							break;
							
						case 'S','s':
			 				System.out.println("Mode of Payment:\tCash");
							System.out.println("Item is:\t\t" + product_2);
							System.out.println("Price:\t\t\t$" + df.format(product_2_price));
							
							discount_interest_percentage = cash_discount/100;
							
							discount_interest = product_2_price*discount_interest_percentage;
							
							System.out.println("Discount/Interest:\t$" + df.format(discount_interest));
							
							total_amount = product_2_price-discount_interest;
							
							System.out.println("Total Amount:\t\t$" + df.format(total_amount));
							
							monthly_amortization = 0;
							
							System.out.println("Montly Amortization:\t$" + df.format(monthly_amortization));
							
							break;
						case 'X','x':
			 				System.out.println("Mode of Payment:\tCash");
							System.out.println("Item is:\t\t" + product_3);
							System.out.println("Price:\t\t\t$" + df.format(product_3_price));
							
							discount_interest_percentage = cash_discount/100;
							
							discount_interest = product_3_price*discount_interest_percentage;
							
							System.out.println("Discount/Interest:\t$" + df.format(discount_interest));
							
							total_amount = product_3_price-discount_interest;
							
							System.out.println("Total Amount:\t\t$" + df.format(total_amount));
							
							monthly_amortization = 0;
							
							System.out.println("Montly Amortization:\t$" + df.format(monthly_amortization));
							
							break;
						default: 
							System.out.println("You have entered a wrong input");
							break;
							
			
					}

			 		break;
			 	
	 			case 2:
			 		switch (item)
					{
						case 'I','i': 
			 				System.out.println("Mode of Payment:\t3 Months Installment");
							System.out.println("Item is:\t\t" + product_1);
							System.out.println("Price:\t\t\t$" + df.format(product_1_price));
							
							discount_interest_percentage = three_months/100;
							
							discount_interest = product_1_price*discount_interest_percentage;
							
							System.out.println("Discount/Interest:\t$" + df.format(discount_interest));
							
							total_amount = product_1_price+discount_interest;
							
							System.out.println("Total Amount:\t\t$" + df.format(total_amount));
							
							monthly_amortization = total_amount/3;
							
							System.out.println("Montly Amortization:\t$" + df.format(monthly_amortization));
							
							break;
							
						case 'S','s':
			 				System.out.println("Mode of Payment:\t3 Months Installment");
							System.out.println("Item is:\t\t" + product_2);
							System.out.println("Price:\t\t\t$" + df.format(product_2_price));
							
							discount_interest_percentage = three_months/100;
							
							discount_interest = product_2_price*discount_interest_percentage;
							
							System.out.println("Discount/Interest:\t$" + df.format(discount_interest));
							
							total_amount = product_2_price+discount_interest;
							
							System.out.println("Total Amount:\t\t$" + df.format(total_amount));
							
							monthly_amortization = total_amount/3;
							
							System.out.println("Montly Amortization:\t$" + df.format(monthly_amortization));
							
							break;
							
						case 'X','x':
			 				System.out.println("Mode of Payment:\t3 Months Installment");
							System.out.println("Item is:\t\t" + product_3);
							System.out.println("Price:\t\t\t$" + df.format(product_3_price));
							
							discount_interest_percentage = three_months/100;
							
							discount_interest = product_3_price*discount_interest_percentage;
							
							System.out.println("Discount/Interest:\t$" + df.format(discount_interest));
							
							total_amount = product_3_price+discount_interest;
							
							System.out.println("Total Amount:\t\t$" + df.format(total_amount));
							
							monthly_amortization = total_amount/3;
							
							System.out.println("Montly Amortization:\t$" + df.format(monthly_amortization));
							
							break;
				
						default: 
							System.out.println("You have entered a wrong input");
							break;
						
					}
			 		
			 		break;
	 			
	 			
	 			case 3:
	 			
			 		switch (item)
					{
						case 'I','i': 
			 				System.out.println("Mode of Payment:\t6 Months Installment");
							System.out.println("Item is:\t\t" + product_1);
							System.out.println("Price:\t\t\t$" + df.format(product_1_price));
							
							discount_interest_percentage = six_months/100;
							
							discount_interest = product_1_price*discount_interest_percentage;
							
							System.out.println("Discount/Interest:\t$" + df.format(discount_interest));
							
							total_amount = product_1_price+discount_interest;
							
							System.out.println("Total Amount:\t\t$" + df.format(total_amount));
							
							monthly_amortization = total_amount/6;
							
							System.out.println("Montly Amortization:\t$" + df.format(monthly_amortization));
							
							break;
							
						case 'S','s':
			 				System.out.println("Mode of Payment:\t6 Months Installment");
							System.out.println("Item is:\t\t" + product_2);
							System.out.println("Price:\t\t\t$" + df.format(product_2_price));
							
							discount_interest_percentage = six_months/100;
							
							discount_interest = product_2_price*discount_interest_percentage;
							
							System.out.println("Discount/Interest:\t$" + df.format(discount_interest));
							
							total_amount = product_2_price+discount_interest;
							
							System.out.println("Total Amount:\t\t$" + df.format(total_amount));
							
							monthly_amortization = total_amount/6;
							
							System.out.println("Montly Amortization:\t$" + df.format(monthly_amortization));
							
							break;
						case 'X','x':
			 				System.out.println("Mode of Payment:\t6 Months Installment");
							System.out.println("Item is:\t\t" + product_3);
							System.out.println("Price:\t\t\t$" + df.format(product_3_price));
							
							discount_interest_percentage = six_months/100;
							
							discount_interest = product_3_price*discount_interest_percentage;
							
							System.out.println("Discount/Interest:\t$" + df.format(discount_interest));
							
							total_amount = product_3_price+discount_interest;
							
							System.out.println("Total Amount:\t\t$" + df.format(total_amount));
							
							monthly_amortization = total_amount/6;
							
							System.out.println("Montly Amortization:\t$" + df.format(monthly_amortization));
							
							break;
				
						default: 
							System.out.println("You have entered a wrong input");
							break;
						
					}
	 			
			 		break;
			 		
	 			case 4:
			 		switch (item)
					{
						case 'I','i': 
			 				System.out.println("Mode of Payment:\t12 Months Installment");
							System.out.println("Item is:\t\t" + product_1);
							System.out.println("Price:\t\t\t$" + df.format(product_1_price));
							
							discount_interest_percentage = twelve_months/100;
							
							discount_interest = product_1_price*discount_interest_percentage;
							
							System.out.println("Discount/Interest:\t$" + df.format(discount_interest));
							
							total_amount = product_1_price+discount_interest;
							
							System.out.println("Total Amount:\t\t$" + df.format(total_amount));
							
							monthly_amortization = total_amount/12;
							
							System.out.println("Montly Amortization:\t$" + df.format(monthly_amortization));
							
							break;
							
						case 'S','s':
			 				System.out.println("Mode of Payment:\t12 Months Installment");
							System.out.println("Item is:\t\t" + product_2);
							System.out.println("Price:\t\t\t$" + df.format(product_2_price));
							
							discount_interest_percentage = twelve_months/100;
							
							discount_interest = product_2_price*discount_interest_percentage;
							
							System.out.println("Discount/Interest:\t$" + df.format(discount_interest));
							
							total_amount = product_2_price+discount_interest;
							
							System.out.println("Total Amount:\t\t$" + df.format(total_amount));
							
							monthly_amortization = total_amount/12;
							
							System.out.println("Montly Amortization:\t$" + df.format(monthly_amortization));
							
							break;
							
						case 'X','x':
			 				System.out.println("Mode of Payment:\t12 Months Installment");
							System.out.println("Item is:\t\t" + product_3);
							System.out.println("Price:\t\t\t$" + df.format(product_3_price));
							
							discount_interest_percentage = twelve_months/100;
							
							discount_interest = product_3_price*discount_interest_percentage;
							
							System.out.println("Discount/Interest:\t$" + df.format(discount_interest));
							
							total_amount = product_3_price+discount_interest;
							
							System.out.println("Total Amount:\t\t$" + df.format(total_amount));
							
							monthly_amortization = total_amount/12;
							
							System.out.println("Montly Amortization:\t$" + df.format(monthly_amortization));
							
							break;
				
						default: 
							System.out.println("You have entered a wrong input");
							break;
						
					}
	 			
			 		break;

			 	default:
			 	{
			 		System.out.println("You have chosen a wrong input.");
			 	}
			 			
	 		}
	 		
        }
		 
}
