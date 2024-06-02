import java.util.Scanner;

public class While_Class 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int input_number, no_1, no_2;
		
		System.out.print("Enter number: ");
		input_number = input.nextInt();
		no_2 = input_number-1;
		no_1 = input_number-no_2;
		
		while(no_2 >= 0) 
		{
			System.out.print(input_number + " " + no_1 + " ");
			no_1++;
			no_2--;
			input_number--;

		}
				
	}
	
}

