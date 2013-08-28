import java.util.Random;

public class Player
{
	public static final int ZERO = 0;
	public static final int ONE = 1;
	public static final int EIGHT = 8;
	public static final int TEN = 10;

	private boolean hasWon = false;
	private String name;
	private int turn;
	private int currentSquareNumber;
	private int cardValue;
	private int value;
	private int timesWon = ZERO;
	private Random cardSelection = new Random();

	YellowDeck yellowSelection = new YellowDeck();
	RedDeck redSelection = new RedDeck();

	public void setName(String newName)
	{
		/**
		*Precondition: A name of the current player being asked for.
		*Postcondition: Assigns the entered name to the String name.
		*/
		this.name = newName;
	} // Ending bracket of setName method

	public String getName()
	{
		/**
		*Precondition: None.
		*Postcondition: Returns the value of name
		*/
		return this.name;
	} // Ending bracket of getName method

	public int getCardChosen()
	{
		/**
		*Precondition: None.
		*Postcondition: Returns the value of cardValue
		*/
		return this.cardValue;
	} // Ending bracket of getCardChosen method

	public void setCardChosen()
	{
		/**
		*Precondition: None.
		*Postcondition: Selects a yellow card and assigns a value
		*to cardValue based on the selection of a yellow
		*or red card.
		*/
		this.ChoosingYellow();
		yellowSelection.setCardSelection(this.getCardValue());

		if(yellowSelection.getCardSelection() == ZERO)
		{
			this.ChoosingRed();
			redSelection.setCardSelection(this.getCardValue());
			this.cardValue = redSelection.getCardSelection();
		} //Ending bracket of if yellowSelection == ZERO
		else
		{
			this.cardValue = yellowSelection.getCardSelection();
		} // Ending bracket of else yellowSelection == ZERO
	} // Ending bracket of setCardChosen method

	public void setPlayerTurn(int newTurn)
	{
		/**
		*Precondition: The change in a player's number of  turns.
		*Postcondition: Sets the player's next turn.
		*/
		this.turn = newTurn;
	} // Ending bracket of setPlayerTurn method

	public int getPlayerTurn()
	{
		/**
		*Precondition: None.
		*Postcondition: Returns the current player's turn.
		*/
		return this.turn;
	} // Ending bracket of getPlayerTurn method

	public void updateCurrentSquareNumber(int playerMove)
	{
		/**
		*Precondition: The current die roll.
		*Postcondition: Updates the currentSquareNumber by adding the die roll.
		*/
		this.currentSquareNumber = this.currentSquareNumber + playerMove;
	} // Ending bracket of updateCurrentSquareNumber method

	public void changeCurrentSquareNumber(int SquareChange)
	{
		this.currentSquareNumber = SquareChange;
	} // Ending bracket of changeCurrentSquareNumber method

	public int getCurrentSquareNumber()
	{
		/**
		*Precondition: None.
		*Postcondition: Returns the int currentSquareNumber
		*/
		return this.currentSquareNumber;
	} // Ending bracket of getCurrentSquareNumber method

	public void setHasWon(boolean setting)
	{
		this.hasWon = setting;
	} // Ending bracket of setHasWon method

	public boolean getHasWon()
	{
		return this.hasWon;
	} // Ending bracket of getHasWon method

	public void setNumberOfWins(int gameWinner)
	{
		/**
		*Precondition: The number of points a player scored in a game.
		*Postcondition: adds up the total number of points to timesWon.
		*/
		this.timesWon = this.timesWon + gameWinner;
	} // Ending bracket of setNumberOfWins method

	public int getNumberOfWins()
	{
		/**
		*Precondition: None.
		*Postcondition: Returns the value of timesWon..
		*/
		return this.timesWon;
	} // Ending bracket of getNumberOfWins method

	private int getCardValue()
	{
		/**
		*Precondition: None.
		*Postcondition: Returns the value of value.
		*/
		return this.value;
	} // Ending bracket of getCardValue method

	private void ChoosingYellow()
	{
		/**
		*Precondition: None.
		*Postcondition: Sets the value of int value.
		*/
		this.value = this.cardSelection.nextInt(TEN) + ONE;
	} // Ending bracket of YellowChooser method

	private void ChoosingRed()
	{
		/**
		*Precondition: None.
		*Postcondition: Sets the value of int value.
		*/
		this.value = this.cardSelection.nextInt(EIGHT) + ONE;
	} // Ending bracket of RedChooser method
} // Ending bracket of Player class