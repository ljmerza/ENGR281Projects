public class GreatestCommonDivisorProject

/**
*Author: Leonardo Merza
*Date: September 29, 2010
*Description: This program will ask you to enter the number
*of integers you will input (from 2 - 5), ask you to enter the numbers,
*then find the greatest common divisor of those numbers entered.
*/

{
	// Part 1 variable declaration and initializing
	private static final int INITIALIZING_INT = 1;
	private static final int ONE = 1;
	private static final int TWO = 2;
	private static final int THREE = 3;
	private static final int FOUR = 4;
	private static final int LEAST_NUMBER_OF_INTEGERS = 2;
	private static final int MOST_NUMBER_OF_INTEGERS = 5;

	private static int numberOfIntegers;
	private static int greatestCommonDivisor;
	private static int loopAskingIntegers = INITIALIZING_INT;
	private static int enteredIntegerOne = INITIALIZING_INT;
	private static int enteredIntegerTwo = INITIALIZING_INT;
	private static int enteredIntegerThree = INITIALIZING_INT;
	private static int enteredIntegerFour = INITIALIZING_INT;
	private static int enteredIntegerFive = INITIALIZING_INT;

	public static void main(String[] args)
	{
		// Part 2 ask user how many integers wanting to use
		AskNumberOfIntegers askUser = new AskNumberOfIntegers();
		askUser.displayingProgramDefinition();
		numberOfIntegers = askUser.askingForIntergers(LEAST_NUMBER_OF_INTEGERS,
																						MOST_NUMBER_OF_INTEGERS);

		// Part 3 asking for integers wanting to use
		EnterInteger intAsk = new EnterInteger();
		do // While (loopAskingIntegers < numberOfIntegers)
		{
			if (loopAskingIntegers == ONE)
			{
				enteredIntegerOne = intAsk.enteringInteger(loopAskingIntegers);
			} // Ending bracket of if loopAskingIntegers = 1
			else if (loopAskingIntegers == TWO)
			{
				enteredIntegerTwo = intAsk.enteringInteger(loopAskingIntegers);
			} // Ending bracket of if loopAskingIntegers = 2
			else if (loopAskingIntegers == THREE)
			{
				enteredIntegerThree = intAsk.enteringInteger(loopAskingIntegers);
			} // Ending bracket of if loopAskingIntegers = 3
			else if (loopAskingIntegers == FOUR)
			{
				enteredIntegerFour = intAsk.enteringInteger(loopAskingIntegers);
			} // Ending bracket of if loopAskingIntegers = 4
			else
			{
				enteredIntegerFive = intAsk.enteringInteger(loopAskingIntegers);
			} // Ending bracket of else loopAskingInteger
			++loopAskingIntegers;
		} // Ending bracket of do while (loopAskingIntegers < numberOfIntegers)
		while (loopAskingIntegers <= numberOfIntegers);

		// Part 5 finding lowest integer of enteredIntegers
		FindLowestIntegers lowestInt = new FindLowestIntegers();
		greatestCommonDivisor = lowestInt.findingLowestInt(numberOfIntegers,
																									enteredIntegerOne,
																									enteredIntegerTwo,
																									enteredIntegerThree,
																									enteredIntegerFour,
																									enteredIntegerFive);

		// Part 6 finding the GCD of all enteredIntegers
		FindGcd gcdAnswer = new FindGcd();
		gcdAnswer.findingGcd(numberOfIntegers, enteredIntegerFive,
												enteredIntegerFour, enteredIntegerThree,
												enteredIntegerTwo, enteredIntegerOne,
												greatestCommonDivisor);

		// Part 7 asking to enter first integer again
		EnterIntegerAgain firstIntAgain = new EnterIntegerAgain();
		enteredIntegerOne = firstIntAgain.enteringAgain(enteredIntegerOne);
	} // Ending bracket of main method
} // Ending bracket of GreatestCommonDivisorProject class