import java.util.Scanner;

public class Do_while 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int input_number;
		int odd = 1;
		int final_answer = 0;
		int ctrl = 1;
		
		System.out.print("Enter number: ");
		input_number = input.nextInt();
		
		System.out.print("Odd numbers are: ");
		
		do
		{
			System.out.print(odd + " ");
			final_answer = final_answer + odd;
			odd = odd + 2;
			ctrl++;
		}
		while(ctrl<=input_number);
		
		System.out.println("\nThe sum of odd numbers upto " + input_number + " term is " + final_answer);
		
		
	}
}

