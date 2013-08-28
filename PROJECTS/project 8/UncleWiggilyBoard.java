public class UncleWiggilyBoard
{
	public static final int NEG_TWO = -2;
	public static final int NEG_THREE = -3;
	public static final int ZERO = 0;
	public static final int ONE = 1;
	public static final int TWO = 2;
	public static final int NINE = 9;
	public static final int THIRTEEN = 13;
	public static final int SEVENTEEN = 17;
	public static final int TWENTY_THREE = 23;
	public static final int TWENTY_EIGHT = 28;
	public static final int THIRTY_FIVE = 35;
	public static final int THIRTY_NINE = 39;
	public static final int FIFTY = 50;
	public static final int FIFTY_TWO = 52;
	public static final int SIXTY = 60;
	public static final int SIXTY_FOUR = 64;
	public static final int SIXTY_SEVEN = 67;
	public static final int SEVENTY_FIVE = 75;
	public static final int SEVENTY_SIX = 76;
	public static final int SEVENTY_NINE= 79;
	public static final int NINETY_FOUR = 94;
	public static final int HUNDRED = 100;
	public static final int  HUNDRED_ONE = 101;
	public static final int  HUNDRED_TEN = 110;
	public static final int  HUNDRED_FIFTEEN = 115;
	public static final int  HUNDRED_TWENTY_ONE = 121;
	public static final int  HUNDRED_THIRTY_ONE = 131;
	public static final int  HUNDRED_THIRTY_EIGHT = 138;
	public static final int  HUNDRED_FOURTY_ONE = 141;

	private int turnChange = ZERO;
	private int spaceChange = ZERO;
	private String playerThatWon;

	public int getSpaceTurnInstruction()
	{
		/**
		*Precondition: None.
		*Postcondition: returns the value of turnChange.
		*/
			return turnChange;
	} // Ending bracket of getSpaceInstruction method

	public int setSpaceTurnInstruction(int currentPlayerSpace)
	{
		/**
		*Precondition: The current player's current board space..
		*Postcondition: changes turnChange to the number of turns lost
		*or zero if no turns lost..
		*/
		if(currentPlayerSpace == NINE)
		{
			System.out.println("Skillery Skallery Alligator, Lose 1 turn.");
			turnChange = NEG_TWO;
		} // Ending bracket of if
		else if(currentPlayerSpace == THIRTY_NINE)
		{
			System.out.println("Woods, Lose 1 turn.");
			turnChange = NEG_TWO;
		} // Ending bracket of if else
		else if(currentPlayerSpace == SIXTY_SEVEN)
		{
			System.out.println("The Bad Pipsisewah, Lose 2 turns.");
			turnChange = NEG_THREE;
		} // Ending bracket of if else
		else if(currentPlayerSpace == SEVENTY_NINE)
		{
			System.out.println("Fox Den, Lose 2 turns.");
			turnChange = NEG_THREE;
		} // Ending bracket of if else
		else if(currentPlayerSpace == HUNDRED_ONE)
		{
			System.out.println("Trap, Lose 2 turns.");
			turnChange = NEG_THREE;
		} // Ending bracket of if else
		else if(currentPlayerSpace == HUNDRED_TEN)
		{
			System.out.println("Skeezicks, Lose 1 turn.");
			turnChange = NEG_TWO;
		} // Ending bracket of if else
		else if(currentPlayerSpace == HUNDRED_FIFTEEN)
		{
			System.out.println("Woods, Lose 1 turn.");
			turnChange = NEG_TWO;
		} // Ending bracket of if else
		else if(currentPlayerSpace == HUNDRED_THIRTY_ONE)
		{
			System.out.println("Trap, Lose 2 turns.");
			turnChange = NEG_THREE;
		} // Ending bracket of if else
		else if(currentPlayerSpace == HUNDRED_FOURTY_ONE)
		{
			System.out.println("Fox Den, Lose 2 turns.");
			turnChange = NEG_THREE;
		} // Ending bracket of if else
		else
		{
			turnChange = ZERO;
		} // Ending bracket of else statement
		return turnChange;
	} // Ending bracket of setSpaceTurnInstruction method

	public int getSpaceJumpInstruction()
	{
		/**
		*Precondition: None.
		*Postcondition: Return spaceChange value.
		*/
		return spaceChange;
	} // Ending bracket of getpaceJumpInstruction method

	public void setSpaceJumpInstruction(int currentPlayerSpace)
	{
		/**
		*Precondition: The current player's current board space.
		*Postcondition: sets the value space change.
		*/
		if(currentPlayerSpace == SEVENTEEN)
		{
			System.out.println("Cluck Cluck Chicken House, go to space 100.");
			spaceChange = HUNDRED;
		} // Ending bracket of if else
		else if(currentPlayerSpace == TWENTY_THREE)
		{
			System.out.println("Rabbit Hole, go back to space 13.");
			spaceChange = THIRTEEN;
		} // Ending bracket of if else
		else if(currentPlayerSpace == TWENTY_EIGHT)
		{
			System.out.println("Bow Wow Dog House, go to space 50.");
			spaceChange = FIFTY;
		} // Ending bracket of if else
		else if(currentPlayerSpace == FIFTY_TWO)
		{
			System.out.println("Rabbit Hole, go back to space 13.");
			spaceChange = THIRTEEN;
		} // Ending bracket of if else
		else if(currentPlayerSpace == SIXTY_FOUR)
		{
			System.out.println("Cluck Cluck Chicken House, go to space 100.");
			spaceChange = HUNDRED;
		} // Ending bracket of if else
		else if(currentPlayerSpace == SEVENTY_SIX)
		{
			System.out.println("Wibble Wobble Duck Pond, go to space 60.");
			spaceChange = SIXTY;
		} // Ending bracket of if else
			else if(currentPlayerSpace == NINETY_FOUR)
		{
			System.out.println("5 & 10 Cent Store, go to space 35.");
			spaceChange = THIRTY_FIVE;
		} // Ending bracket of if else
		else if(currentPlayerSpace == HUNDRED_TWENTY_ONE)
		{
			System.out.println("Bushytail Squirrel Tree, go to space 75.");
			spaceChange = SEVENTY_FIVE;
		} // Ending bracket of if else
		else if(currentPlayerSpace == HUNDRED_THIRTY_EIGHT)
		{
			System.out.println("5 & 10 Cent Store, go to space 35.");
			spaceChange = THIRTY_FIVE;
		} // Ending bracket of if else
		else
		{
			spaceChange = ZERO;
		} // Ending bracket of else statement
	} // Ending bracket of setSpaceJumpInstruction method
} // Ending bracket of UncleWiggilyBoard class