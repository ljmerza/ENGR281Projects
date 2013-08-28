public class findingGcd
{


	public int findGCD(int enteredIntegerFive, int enteredIntegerFour, int enteredIntegerThree, int enteredIntegerTwo, int enteredIntegerOne)
	{

				int greatestCommonDivisor;

				//part 5
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
				}// Ending bracket of if enteredIntegerFour is lowest number
				else if ((enteredIntegerThree < enteredIntegerFive) &&
						(enteredIntegerThree < enteredIntegerFour) &&
						(enteredIntegerThree < enteredIntegerTwo) &&
						(enteredIntegerThree < enteredIntegerOne))
				{
					greatestCommonDivisor = enteredIntegerThree;
				}// Ending bracket of if enteredIntegerThree is lowest number
				else if ((enteredIntegerTwo < enteredIntegerFive) &&
						(enteredIntegerTwo < enteredIntegerFour) &&
						(enteredIntegerTwo < enteredIntegerThree) &&
						(enteredIntegerTwo < enteredIntegerOne))
				{
					greatestCommonDivisor = enteredIntegerTwo;
				}// Ending bracket of if enteredIntegerTwo is lowest number
				else
				{
					greatestCommonDivisor = enteredIntegerOne;
				}// Ending bracket of if enteredIntegerOne is lowest number

		return greatestCommonDivisor;
	}


}