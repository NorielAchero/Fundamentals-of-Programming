import java.util.Scanner;

public class Two_dim {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int input1;
		int input2;
		int[][] array; 
		
		System.out.println("Enter number of rows and columns in the matrix:");
		input1 = input.nextInt();
		
		System.out.print("");
		input2 = input.nextInt();
		
		System.out.println();
		
		array = new int [input1][input2];
		
		for(int a = 0; a < input1; a++)
		{
			for(int b = 0; b < input2; b++)
			{
				System.out.print("Enter element:");
				array[a][b] = input.nextInt();
			}
		}
		
		System.out.println();
		System.out.print("Matrix input:\n");
		
		for(int a = 0; a < input1; a++)
		{
			for(int b = 0; b < input2; b++)
			{
				System.out.print(array[a][b] + "\t");

			}
			System.out.println();
		}
		
		
		System.out.println("\nTransposed Matrix:");
		
		for(int a = 0; a < input2; a++)
		{
			for(int b = 0; b < input1; b++)
			{
				System.out.print(array[b][a] + "\t");

			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}

