import java.util.Scanner;

public class EnterInteger
{
	private static final int ZERO = 0;
	private static int enteredInteger;


	public int enteringInteger(int loopAskingIntegers)
		{
			/**
			*Precondition: The iteration number of do
			*while (loopAskingIntegers <= numberOfIntegers)
			*Postcondition: Returns the entered integer that
			*will be used to find the GCD of.
			*/

			Scanner keyboard = new Scanner(System.in);
			System.out.println();
			System.out.print("Please enter integer number " + loopAskingIntegers +
										" that you want to use or enter\n" +
										"0 or a negative number to exit the program: ");
			enteredInteger = keyboard.nextInt();

			if ( enteredInteger <= ZERO)
			{
				System.exit(0);
			} // Ending bracket of if Integer <= ZERO
			else
			{
			} // Ending bracket of else then do nothing
			return enteredInteger;
	} // Ending bracket of enteringIntegers method
} // Ending bracket of EnterInteger class