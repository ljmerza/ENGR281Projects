import java.util.Scanner;

public class ExceptionDriver
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter the numerator:");
		int numerator = keyboard.nextInt();

		System.out.println("Please enter the denominator:");
		int denominator = keyboard.nextInt();

		try
		{
			System.out.println(numerator + " / " + denominator + " = " + numerator/denominator);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by zero!");
		}

	}
}