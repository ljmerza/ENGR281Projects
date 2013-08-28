import java.util.Scanner;

public class TwoCatchesDemo
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Enter number of widets produced");
			Scanner keyboard = new Scanner(System.in);
			int widgets = keyboard.nextInt();
			if (widgets < 0)
			{
				throw new NegativeNumberException("widgets");
			}

			System.out.println("How many were defective?");
			int defective = keyboard.nextInt();
			if (defective < 0)
				throw new NegativeNumberException("defective widgets");

			double ratio = exceptionalDivision(widgets, defective);
			System.out.println("One in every " + ratio + " widgets is defective");
		} // end of try

		catch(DivideByZeroException e)
		{
			System.out.println("Congrats, no errors!");
		}
		catch(NegativeNumberException e)
		{
			System.out.println("cannot have a negative number of " + e.getMessage());
		}
	} // ending of main

	public static double exceptionalDivision(double numberator, double denominator) throws DivideByZeroException
	{
		if (denominator == 0)
			throw new DivideByZeroException();
		return numberator/denominator;
	} // end of exceptionalDivision

} // end of class
