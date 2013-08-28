public class FindLowestIntegers
{

	private static final int TWO = 2;
	private static final int THREE = 3;
	private static final int FOUR = 4;
	private static int greatestCommonDivisor;

	public int findingLowestInt(int numberOfIntegers, int enteredIntegerOne,
													int enteredIntegerTwo, int enteredIntegerThree,
													int enteredIntegerFour, int enteredIntegerFive)
	{
		/**
		*Precondition: The number of integers used and each number entered.
		*Postcondition: Returns the lowest number entered.
		*/

		if (numberOfIntegers == TWO)
		{
			if ((enteredIntegerTwo < enteredIntegerOne))
			{
				greatestCommonDivisor = enteredIntegerTwo;
			} // Ending bracket of if enteredIntegerTwo is lowest number
			else
			{
				greatestCommonDivisor = enteredIntegerOne;
			} // Ending bracket of if enteredIntegerOne is lowest number

		} //  Ending bracket of if (numberOfIntegersGcd == TWO)
		else if (numberOfIntegers == THREE)
		{
			if ((enteredIntegerThree < enteredIntegerTwo) &&
				(enteredIntegerThree < enteredIntegerOne))
			{
				greatestCommonDivisor = enteredIntegerThree;
			}// Ending bracket of if enteredIntegerThree is lowest number
			else if ((enteredIntegerTwo < enteredIntegerThree) &&
					(enteredIntegerTwo < enteredIntegerOne))
			{
				greatestCommonDivisor = enteredIntegerTwo;
			} // Ending bracket of if enteredIntegerTwo is lowest number
			else
			{
				greatestCommonDivisor = enteredIntegerOne;
			} // Ending bracket of if enteredIntegerOne is lowest number

		} // Ending bracket of else if (enteredInteger <= ZERO)
		else if (numberOfIntegers == FOUR)
		{
			if ((enteredIntegerFour < enteredIntegerThree) &&
				(enteredIntegerFour < enteredIntegerTwo) &&
				(enteredIntegerFour < enteredIntegerOne))
			{
				greatestCommonDivisor = enteredIntegerFour;
			} // Ending bracket of if enteredIntegerFour is lowest number
			else if ((enteredIntegerThree < enteredIntegerFour) &&
					(enteredIntegerThree < enteredIntegerTwo) &&
					(enteredIntegerThree < enteredIntegerOne))
			{
				greatestCommonDivisor = enteredIntegerThree;
			} // Ending bracket of if enteredIntegerThree is lowest number
			else if ((enteredIntegerTwo < enteredIntegerFour) &&
					(enteredIntegerTwo < enteredIntegerThree) &&
					(enteredIntegerTwo < enteredIntegerOne))
			{
				greatestCommonDivisor = enteredIntegerTwo;
			} // Ending bracket of if enteredIntegerTwo is lowest number
			else
			{
				greatestCommonDivisor = enteredIntegerOne;
			} // Ending bracket of if enteredIntegerOne is lowest number

		} // Ending bracket of else if (numberOfIntegersGcd == FOUR)
		else
		{
			if ((enteredIntegerFive < enteredIntegerFour) &&
				(enteredIntegerFive < enteredIntegerThree) &&
				(enteredIntegerFive < enteredIntegerTwo) &&
				(enteredIntegerFive < enteredIntegerOne))
			{
				greatestCommonDivisor = enteredIntegerFive;
			} // Ending bracket of if enteredIntegerFive is lowest number
			else if ((enteredIntegerFour < enteredIntegerFive) &&
					(enteredIntegerFour < enteredIntegerThree) &&
					(enteredIntegerFour < enteredIntegerTwo) &&
					(enteredIntegerFour < enteredIntegerOne))
			{
				greatestCommonDivisor = enteredIntegerFour;
			} // Ending bracket of if enteredIntegerFour is lowest number
			else if ((enteredIntegerThree < enteredIntegerFive) &&
					(enteredIntegerThree < enteredIntegerFour) &&
					(enteredIntegerThree < enteredIntegerTwo) &&
					(enteredIntegerThree < enteredIntegerOne))
			{
				greatestCommonDivisor = enteredIntegerThree;
			} // Ending bracket of if enteredIntegerThree is lowest number
			else if ((enteredIntegerTwo < enteredIntegerFive) &&
					(enteredIntegerTwo < enteredIntegerFour) &&
					(enteredIntegerTwo < enteredIntegerThree) &&
					(enteredIntegerTwo < enteredIntegerOne))
			{
				greatestCommonDivisor = enteredIntegerTwo;
			} // Ending bracket of if enteredIntegerTwo is lowest number
			else
			{
				greatestCommonDivisor = enteredIntegerOne;
			} // Ending bracket of if enteredIntegerOne is lowest number
		} // Ending bracket of else numberOfIntegersGcd
		return greatestCommonDivisor;
	} // Ending bracket of findingLowestInt method
} // Ending bracket of FindLowestIntegers class