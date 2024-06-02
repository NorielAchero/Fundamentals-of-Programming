import java.util.Scanner;

public class OneDimeArray {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int n1;
		int n2;
		int n3;
		
		String[] array1;
		String[] array2; 
		String[] array3; 
		
		System.out.print("Enter size of the 1st array: ");
		n1 = input.nextInt();
		
		array1 = new String[n1];
		
		System.out.print("Enter size of the 2nd array: ");
		n2 = input.nextInt();
		
		array2 = new String[n2];
		
		System.out.print("Enter size of the 3rd array: ");
		n3 = input.nextInt();
		
		array3 = new String[n3];
		
		input.nextLine();
		
		System.out.println();
		
		
		int[] final_array1 = new int[array1.length];
		int[] final_array2 = new int[array2.length];
		int[] final_array3 = new int[array3.length];
		
		
		System.out.print("Enter value of the 1st array: ");
		
		String space1 = input.nextLine();
		array1 = space1.split(" ");

		for(int a = 0; a < array1.length; a++)
		{
			final_array1[a] = Integer.parseInt(array1[a]);
		}	
		
		
		System.out.print("Enter value of the 2nd array: ");
		
		String space2 = input.nextLine();
		array2 = space2.split(" ");
		
		for(int b = 0; b < array2.length; b++)
		{
			final_array2[b] = Integer.parseInt(array2[b]);
		}
		
		System.out.print("Enter value of the 3rd array: ");
		
		String space3 = input.nextLine();
		array3 = space3.split(" ");
		
		for(int c = 0; c < array3.length; c++)
		{
			final_array3[c] = Integer.parseInt(array3[c]);
		}
		
		System.out.println();

		System.out.println("Output:" + "\nValue of arrays: ");
		
		System.out.print("Array 1: ");
		for(int a = 0; a < final_array1.length; a++)
		{
			System.out.print(final_array1[a] + " ");
		}
		
		System.out.println();
		
		System.out.print("Array 2: ");
		for(int b = 0; b < final_array2.length; b++)
		{
			System.out.print(final_array2[b] + " ");
		}
		
		System.out.println();
		
		System.out.print("Array 3: ");
		for(int c = 0; c < final_array3.length; c++)
		{
			System.out.print(final_array3[c] + " ");
		}
		
		System.out.println("");
		
		System.out.print("Common elements in sorted arrays: ");
		
		for(int a = 0; a < final_array1.length;a++)
		{
			for(int b = 0; b < final_array2.length;b++)
			{
				for(int c = 0; c < final_array3.length;c++)
				{
					if(final_array1[a] == final_array2[b] && final_array1[a] == final_array3[c])
					{
						System.out.print(final_array1[a] + " ");
					}
				}
			}
		}
	}
}

