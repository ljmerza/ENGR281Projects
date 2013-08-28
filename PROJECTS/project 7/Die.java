import java.util.Random;

public class Die
{
	public static int NUMBER_OF_SIDES = 7;
	private int value = 0;
	private Random die = new Random();

	public int getValue()
	{
	/**
	*Precondition: None.
	*Postcondition: Returns the value of int value
	*/
		return this.value;
	} // Ending bracket of getValue method

	public int roll()
	{
	/**
	*Precondition: None.
	*Postcondition: Returns the value of the die roll
	*/
		this.value = this.die.nextInt(NUMBER_OF_SIDES);
		return this.value;
	} // Ending bracket of roll method
} // Ending bracket of Die class