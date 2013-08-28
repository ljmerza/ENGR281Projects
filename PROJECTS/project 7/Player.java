public class Player
{
	private String name;
	private int currentSquareNumber;

	public int getCurrentSquareNumber()
	{
		/**
		*Precondition: None.
		*Postcondition: Returns the int currentSquareNumber
		*/
		return this.currentSquareNumber;
	} // Ending bracket of getCurrentSquareNumber method

	public void updateCurrentSquareNumber(int playerDieRoll)
	{
	/**
	*Precondition: The current die roll.
	*Postcondition: Updates the currentSquareNumber by adding the die roll.
	*/
		this.currentSquareNumber = this.currentSquareNumber + playerDieRoll;
	} // Ending bracket of updateCurrentSquareNumber method

	public String getName()
	{
	/**
	*Precondition: None.
	*Postcondition: Returns the value of name
	*/
		return this.name;
	} // Ending bracket of getName method

	public void setName(String newName)
	{
	/**
	*Precondition: A name of the current player being asked for.
	*Postcondition: Assigns the entered name to the String name.
	*/
		this.name = newName;
	} // Ending bracket of setName method
} // Ending bracket of Player class