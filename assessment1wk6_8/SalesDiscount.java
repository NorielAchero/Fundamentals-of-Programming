package assessment1wk6_8;
import java.util.Scanner;
import java.text.DecimalFormat;

public class SalesDiscount 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###,###.00");
		
		String product_name = "";
		double price = 0.0;
		double discount = 0.0;
		double net_price = 0.0;
		
		System.out.print("Enter product: ");
		product_name = input.nextLine();
		
		System.out.print("Enter price: ");
		price = input.nextDouble();	
		
		
		if ( price >= 0 && price <= 10000)
		{
			discount = 0;
		}
		
		else if ( price >= 10001 && price <= 20000)	
		{
			discount = price*0.05;
		}
		
		else if ( price >= 20001 && price <= 50000)
		{
			discount = price*0.1;
		}
		
		else if ( price >= 50001 && price <= 100000)
		{
			discount = price*0.15;
		}
		
		else if (price >= 100001)
		{
			discount = price*0.20;
		}
		
		else
		{
			discount = 0;
		}
		
		net_price = price-discount;

		System.out.print("\nPrice of " + product_name + " is " + df.format(price));
		System.out.print("\nDiscount is " + df.format(discount));
		System.out.print("\nNet Price is " + df.format(net_price));

		
		

	}

}
