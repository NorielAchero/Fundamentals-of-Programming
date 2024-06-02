import java.util.Scanner;

public class Dozen 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int eggs;
		
		System.out.print("Enter the number of eggs: ");
		eggs = input.nextInt();
		
		System.out.println("Number of dozen: " + determineDozen(eggs));
		
		System.out.println("Eggs less than a dozen: " + showLessDozen(eggs));
	}
	
	public static int determineDozen(int e)
	{	
		e = e/12;
		return e;
	}
	
	public static int showLessDozen(int e)
	{	
		e = e%12;
		return e;
	}

}


