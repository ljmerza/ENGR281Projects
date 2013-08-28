public class YellowDeck
{
	public static final int ZERO = 0;
	public static final int ONE = 1;
	public static final int TWO = 2;
	public static final int THREE = 3;
	public static final int FOUR = 4;
	public static final int FIVE = 5;
	public static final int SIX = 6;
	public static final int SEVEN = 7;
	public static final int EIGHT = 8;
	public static final int NINE = 9;
	public static final int TEN = 10;

	private int cardValue;

	public int getCardSelection()
	{
		/**
		*Precondition: None.
		*Postcondition: Returns the value of cardValue.
		*/
		return cardValue;
	} // Ending bracket of getCardSelection

	public void setCardSelection(int cardChooser)
	{
		/**
		*Precondition: The current card number chosen at random.
		*Postcondition: Sets the int cardValue to the chosen card.
		*/
		if(cardChooser == ONE)
		{
			System.out.print("Take a red card if you please. ");
			System.out.println("Hope you win this game with ease.");
			cardValue = ZERO;
		} // Ending bracket of if statement
		else if(cardChooser == TWO)
		{
			System.out.print("Uncle Wiggily moves ahead by one. ");
			System.out.println("He takes a walk and has some fun.");
			cardValue = ONE;
		} // Ending bracket of if else statement
		else if(cardChooser == THREE)
		{
			System.out.print("Uncle Wiggily hops forward by two. ");
			System.out.println("He moves right now and then he's through.");
			cardValue = TWO;
		} // Ending bracket of if else statement
		else if(cardChooser == FOUR)
		{
			System.out.print("How near the finish will you be? ");
			System.out.println("When Uncle Wiggily hops ahead three.");
			cardValue = THREE;
		} // Ending bracket of if else statement
		else if(cardChooser == FIVE)
		{
			System.out.print("Uncle Wiggily hops along by four.  ");
			System.out.println("Now he likes you even more.");
			cardValue = FOUR;
		} // Ending bracket of if else statement
		else if(cardChooser == SIX)
		{
			System.out.print("He'd rather walk than take a drive. ");
			System.out.println("Uncle Wiggily jumps ahead by five.");
			cardValue = FIVE;
		} // Ending bracket of if else statement
		else if(cardChooser == SEVEN)
		{
			System.out.print("Move Uncle Wiggily forward by six. ");
			System.out.println("The clever rabbit knows all the tricks.");
			cardValue = SIX;
		} // Ending bracket of if else statement
		else if(cardChooser == EIGHT)
		{
			System.out.print("Uncle Wiggily takes seven hops. ");
			System.out.println("He moves right now and then he stops.");
			cardValue = SEVEN;
		} // Ending bracket of if else statement
		else if(cardChooser == NINE)
		{
			System.out.print("Hurry! Hurry! Don't be late! ");
			System.out.println("Move Uncle Wiggily ahead by eight.");
			cardValue = EIGHT;
		} // Ending bracket of if else statement
		else if(cardChooser == TEN)
		{
			System.out.print("Uncle Wiggily hops ahead by nine. ");
			System.out.println("He thinks this game is really fine.");
			cardValue = NINE;
		} // Ending bracket of if else statement
		else
		{
			System.out.print("Hope you get this card again! ");
			System.out.println("Uncle Wiggily goes ahead by ten.”");
			cardValue = TEN;
		} // Ending bracket of else statement
	} // Ending bracket of getCardSelection method
} // Ending bracket of YellowDeck class