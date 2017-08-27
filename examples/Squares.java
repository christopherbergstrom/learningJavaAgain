package examples;

public class Squares
{
	public static void main(String[]args)
	{
		// opens the scanner
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		// define the variable used for this program
		int num = 0;
		int result = 0;
		int count = 0;
		// this for loop runs 5 time and produces the square of the inputted number each time
		for (count = 0; count < 5; count++)
		{
			System.out.println("Please enter a number: ");
			num = scanner.nextInt();
			if (num < 46341)
			{
				result = num * num;
				System.out.println("The result of squaring "+num+" is: "+result);
			}
			else
			{
				System.out.println("Input number "+num+" is too large");
			}
		}
		// closes the scanner
		scanner.close();
	}
}