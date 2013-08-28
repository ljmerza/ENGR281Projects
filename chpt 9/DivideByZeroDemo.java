import java.util.Scanner;

public class DivideByZeroDemo
{
	private int numberator, denominator;
	private double quotient;

	public static void main(String[] args)
	{
		DivideByZeroDemo oneTime = new DivideByZeroDemo();
		oneTime.doIt();
	}

	public void doIt()
	{
		try
		{
			System.out.println("Enter numberator");
			Scanner keyboard = new Scanner(System.in);
			numberator = keyboard.nextInt();
			System.out.println("Enter the denominator");
			denominator = keyboard.nextInt();

			if (denominator == 0)
				throw new DivideByZeroException();

				quotient = numberator / (double)denominator;
				System.out.println(numberator + "/" + denominator + " = " + quotient);
		}
		catch(DivideByZeroException e)
		{
			System.out.println(e.getMessage());
			giveSecondChance();
		}
	}

	public void giveSecondChance()
	{
		System.out.println("try again");
		Scanner keyboard = new Scanner(System.in);
		numberator = keyboard.nextInt();
		System.out.println("enter denominator");
		denominator = keyboard.nextInt();

		if(denominator == 0)
		{
			System.out.println("program will now end");
			System.exit(0);
		}
	}
}