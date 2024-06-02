
import java.util.Scanner;
import java.text.DecimalFormat;

public class Mid_Input_Output 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###,###.00");

		String name = "";
		double unit_enrolled = 0.0;
		double price_per_unit = 0.0;
		double tuition = 0.0;
		double cash_payment_discount = 0.0;
		double installment_2 = 0.0;
		double installment_3 = 0.0;
		
		
		System.out.print("Enter Name of Student:");
		name = input.nextLine();
		
		System.out.print("Enter number of units enrolled:");
		unit_enrolled = input.nextDouble();
		
		System.out.print("Enter price per unit:");
		price_per_unit = input.nextDouble();
		
		tuition = price_per_unit*unit_enrolled;
		cash_payment_discount = tuition*-0.1+tuition;
		installment_2 = tuition*0.05+tuition;
		installment_3 = tuition*0.10+tuition;
		
		
		System.out.print("\nComputed Tuition Fee:" + df.format(tuition) + " dollars");
		System.out.print("\n" + name + ", you could avail the following payment mode:");
		System.out.print("\n\nPayment Mode:");
		System.out.print("\nCash Payment:" + df.format(cash_payment_discount) + " dollars");
		System.out.print("\n2-installment:" + df.format(installment_2) + " dollars");
		System.out.print("\n3-installment:" + df.format(installment_3) + " dollars");
		

	}

}