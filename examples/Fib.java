package examples;

public class Fib
{
	public static void main(String[]args)
	{
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.println("0 : "+0);
		System.out.println("1 : "+1);
		for (int i = 0; i < 10; i++)
		{
// 			System.out.println(i+2+" : "+(a+b));
			c = b;
			b = a+b;
			a = c;
			for (int j = 0; j < (a+b); j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}