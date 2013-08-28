import java.util.Scanner;

public class EnterIntegerAgain
{
	private static final int ZERO = 0;
	private static boolean endLoop = false;
	private static int enteredInteger = ZERO;

	public int enteringAgain(int enteredIntegerOne)
	{
		/**
		*Precondition: The first number entered.
		*Postcondition: Asks user to enter the first integer enter
		*again and returns that value.
		*/

		Scanner keyboard = new Scanner(System.in);

		do // While (endLoop == false);
		{
			System.out.println("Please enter the first integer again or enter");
			System.out.print("0 or a negative number to exit the program: ");
			enteredInteger = keyboard.nextInt();

			if (enteredInteger <= ZERO)
			{
				System.exit(0);
			} // Ending bracket of if (enteredInteger <= ZERO)
			else if (enteredInteger == enteredIntegerOne)
			{
				endLoop = true;
			} // Ending bracket of if (enteredInteger = enteredIntegerOne)
			else
			{
			} // Ending bracket of else do nothing
		} // Ending bracket of do enter first integer again
		while (endLoop == false);

		return enteredInteger;
	} // Ending bracket of enteringAgain method
} // Ending bracket of EnterIntegerAgain class