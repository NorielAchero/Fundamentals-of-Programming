import java.util.Scanner;

public class Mutiple {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		String print = "";
		
		System.out.print("Enter first interger: ");
		num1 = input.nextInt();
		
		System.out.print("Enter 2nd Integer: ");
		num2 = input.nextInt();
		
		
		System.out.print("\n" + num2 + Multiple(print, num1, num2) + num1);
	}
	
	public static String Multiple(String p, int n1, int n2) 
	{
		if ((n1 % n2) == 0)
		{
			p = " is multiple to ";
		}	
		
		else
		{
			p = " is not multiple to ";
		}
		
		return p;
			
	}

}
