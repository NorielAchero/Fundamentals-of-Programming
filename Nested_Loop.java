import java.util.Scanner;

public class Nested_Loop 
{

	public static void main(String[] args) 	
	{
		Scanner input = new Scanner(System.in);
		
		int input_number;
		int row, col;
		int print_number = 0; 
		
		System.out.print("Enter matrix to  generate (n by n ): ");
		input_number = input.nextInt();
		
		row = 1;
		col = 1;
		
		while (row <= input_number) 
		{
			while(col <= input_number)
			{
				if (col == 1 && row == 1)
				{
					print_number = input_number*input_number;
				}
				
				else if ((row % 2) == 0 && col == 1)
				{
					print_number = print_number-input_number;
				}
				
				else if ((row % 2) == 0 && col != 1)
				{
					print_number = print_number+1;
				}
				
				else if ((row % 2) != 0 && col == 1)
				{
					print_number = print_number-input_number;
				}
				
				else 
				{
					print_number = print_number-1;
				}
				
				
				
				System.out.print(print_number + "\t");
				col++;
			}
			
		
				
			row++;
			col = 1;
			System.out.println();
		}
			
	}

}

