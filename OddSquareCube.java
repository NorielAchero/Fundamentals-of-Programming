import java.util.Scanner;

public class OddSquareCube 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		
		
		int input_num;
		int input_num2;
		int square;
		int cube;
		int final_square = 0;
		int final_cube= 0;
		String converter;
		
		
		System.out.print("Enter number: ");
		input_num = input.nextInt();
		
		input_num2 = input_num + 2;
		
		System.out.println("\nNumber\t\tSquare\t\tCube");
		
		for(int a = 1; a <= input_num2; a++, a++)
		{
			
			converter = Integer.toString(a);
			
			square = a*a;
			cube = a*a*a;

			
			if(a >= input_num2)
			{
				converter = "TOTAL";
				square = final_square;
				cube = final_cube;
			}
			
			else
			{
				final_square = final_square+square;
				final_cube = final_cube+cube;
			}
			
			
			
			System.out.println(converter + "\t\t" + square + "\t\t" + cube);

			
		}	
		

		
		
		
		
	}
	

}

