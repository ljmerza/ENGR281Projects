import java.util.Scanner;

public class AskNumberOfIntegers
{
	private static final int ZERO = 0;
	private int numberOfIntegers;

	public void displayingProgramDefinition()
	{
		/**
		*Precondition: None.
		*Postcondition: Displays what the program will do.
		*/
		System.out.println("I will find the greatest common divisor");
		System.out.println("of all the integers that you enter.");
		System.out.println();
	} // Ending bracket of displayProgramDefinition

	public int askingForIntergers(int LEAST_NUMBER_OF_INTEGERS, int MOST_NUMBER_OF_INTEGERS)
	{
		/**
		*Precondition: The least and most number of integers that will be used to find the GCD
		*Postcondition: Returns the number of integers the user has
		*decided to use for finding the GCD.
		*/
		Scanner keyboard = new Scanner(System.in);

		do // While numberOfIntegers < 5 && numberOfIntegers > 2
		{
			System.out.println("Please enter the number of integers from " +
											LEAST_NUMBER_OF_INTEGERS +
											" to " + MOST_NUMBER_OF_INTEGERS);
			System.out.println("that you want to find the GCD for or enter 0");
			System.out.print("or a negative number to exit the program: ");
			numberOfIntegers = keyboard.nextInt();

			if (numberOfIntegers > ZERO)
			{
				if ((numberOfIntegers > MOST_NUMBER_OF_INTEGERS) ||
					(numberOfIntegers < LEAST_NUMBER_OF_INTEGERS))
				{
					System.out.println();
					System.out.println("Error. Not a number between " +
													LEAST_NUMBER_OF_INTEGERS + " and " +
													MOST_NUMBER_OF_INTEGERS + ".");
				} // Ending bracket of if 1 > numberOfIntergers > 5
				else
				{
				} // Ending bracket of else statement
			} // Ending bracket of if numberOfIntegers <= 0
			else
			{
				System.exit(0);
			} // Ending bracket of else System.exit
		} // Ending bracket of do while numberOfIntegers > 5 && numberOfIntegers < 2
		while ((numberOfIntegers < LEAST_NUMBER_OF_INTEGERS) ||
					(numberOfIntegers > MOST_NUMBER_OF_INTEGERS));
		return numberOfIntegers;
	} // Ending bracket of askingForIntergers method
} // Ending bracket for askNumberOfIntegers class