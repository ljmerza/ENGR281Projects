public class FindGcd
{
	private static final int ZERO = 0;
	private static final int TWO = 2;
	private static final int THREE = 3;
	private static final int FOUR = 4;
	private static boolean isEndingProgram = false;

	public void findingGcd(int numberOfInterers, int enteredIntegerFive,
											int enteredIntegerFour, int enteredIntegerThree,
											int enteredIntegerTwo, int enteredIntegerOne,
											int greatestCommonDivisor)
	{
		/**
		*Precondition: The number of integers used and each number entered.
		*Postcondition: Finds and displays the GCD of all the numbers given.
		*/
		if (numberOfInterers == TWO)
		{
			do // While (isEndingProgram == false);
			{
				if ((enteredIntegerTwo % greatestCommonDivisor == ZERO) &&
					(enteredIntegerOne % greatestCommonDivisor == ZERO))
				{
					isEndingProgram = true;
				} // Ending bracket of if remainder of all numbers is 0
				else
				{
					--greatestCommonDivisor;
				} // Ending bracket of else GCD not found
			} // Ending bracket of do while (isEndingProgram == false);
			while (isEndingProgram == false);
		} // Ending bracket of if numberOfIntegers == two
		else if (numberOfInterers == THREE)
		{
			do // While (isEndingProgram == false);
			{
				if ((enteredIntegerThree % greatestCommonDivisor == ZERO) &&
					(enteredIntegerTwo % greatestCommonDivisor == ZERO) &&
					(enteredIntegerOne % greatestCommonDivisor == ZERO))
				{
					isEndingProgram = true;
				} // Ending bracket of if remainder of all numbers is 0
				else
				{
					--greatestCommonDivisor;
				} // Ending bracket of else GCD not found
			} // Ending bracket of do while (isEndingProgram == false);
			while (isEndingProgram == false);
		} // Ending bracket of if else numberOfIntegers == three
		else if (numberOfInterers == FOUR)
		{
			do // While (isEndingProgram == false);
			{
				if ((enteredIntegerFour % greatestCommonDivisor == ZERO) &&
					(enteredIntegerThree % greatestCommonDivisor == ZERO) &&
					(enteredIntegerTwo % greatestCommonDivisor == ZERO) &&
					(enteredIntegerOne % greatestCommonDivisor == ZERO))
				{
					isEndingProgram = true;
				} // Ending bracket of if remainder of all numbers is 0
				else
				{
					--greatestCommonDivisor;
				} // Ending bracket of else GCD not found
			} // Ending bracket of do while (isEndingProgram == false);
			while (isEndingProgram == false);
		} // Ending bracket of if else numberOfIntegers == four
		else
		{
			do // While (isEndingProgram == false);
			{
				if ((enteredIntegerFive % greatestCommonDivisor == ZERO) &&
					(enteredIntegerFour % greatestCommonDivisor == ZERO) &&
					(enteredIntegerThree % greatestCommonDivisor == ZERO) &&
					(enteredIntegerTwo % greatestCommonDivisor == ZERO) &&
					(enteredIntegerOne % greatestCommonDivisor == ZERO))
				{
					isEndingProgram = true;
				} // Ending bracket of if remainder of all numbers is 0
				else
				{
					--greatestCommonDivisor;
				} // Ending bracket of else GCD not found
			} // Ending bracket of do while (isEndingProgram == false);
			while (isEndingProgram == false);
		} // Ending bracket of else numberOfIntegers == 5

		System.out.println();
		System.out.println("The greatest common divisor is: " + greatestCommonDivisor);
		System.out.println();
	} // Ending bracket of findingGcd method
} // Ending bracket of FindGCD class