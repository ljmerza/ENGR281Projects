public class RedDeck
{
	public static final int NEG_TWO = -2;
	public static final int NEG_THREE = -3;
	public static final int NEG_FOUR = -4;
	public static final int NEG_FIVE = -5;
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
	public static final int THIRTEEN = 13;
	public static final int FIFTEEN = 15;

	private int cardValue;

	public int getCardSelection()
	{
		/**
		*Precondition: None.
		*Postcondition: Returns the value of cardValue.
		*/
		return cardValue;
	} // Ending bracket of getCardSelection method

	public void setCardSelection(int cardChooser)
	{
		/**
		*Precondition: The current card number chosen at random.
		*Postcondition: Sets the int cardValue to the chosen card.
		*/
		if(cardChooser == ONE)
		{
			System.out.print("We really hope you won't feel blue. ");
			System.out.println("But Uncle Wiggily must go back two.");
			cardValue = NEG_TWO;
		} // Ending bracket of if setCardSlection
		else if(cardChooser == TWO)
		{
			System.out.print("Uncle Wiggily must jump back three. ");
			System.out.println("It's not the best place for him to be.");
			cardValue = NEG_THREE;
		} // Ending bracket of if setCardSlection
		else if(cardChooser == THREE)
		{
			System.out.print("Uncle Wiggily must hop back four. ");
			System.out.println("Hope this won't happen any more.");
			cardValue = NEG_FOUR;
		} // Ending bracket of if setCardSlection
		else if(cardChooser == FOUR)
		{
			System.out.print("Uncle Wiggily must go back five. ");
			System.out.println("Nobody knows when he will arrive.");
			cardValue = NEG_FIVE;
		} // Ending bracket of if setCardSlection
		else if(cardChooser == FIVE)
		{
			System.out.print("Hurry! Hurry! Don't be late! ");
			System.out.println("Move Uncle Wiggily ahead by eight.");
			cardValue = EIGHT;
		} // Ending bracket of if setCardSlection
		else if(cardChooser == SIX)
		{
			System.out.print("Uncle Wiggily hops ahead by nine. ");
			System.out.println("He thinks this game is really fine.");
			cardValue = NINE;
		} // Ending bracket of if setCardSlection
		else if(cardChooser == SEVEN)
		{
			System.out.print("Hope you get this card again! ");
			System.out.println("Uncle Wiggily goes ahead by ten");
			cardValue = TEN;
		} // Ending bracket of if setCardSlection
		else if(cardChooser == EIGHT)
		{
			System.out.print("A card this good is not often seen. ");
			System.out.println("Move Uncle Wiggily ahead by thirteen!");
			cardValue = THIRTEEN;
		} // Ending bracket of if setCardSlection
		else
		{
			System.out.print("Uncle Wiggily hops ahead fifteen. ");
			System.out.println("You're one of the best he's ever seen!");
			cardValue = FIFTEEN;
		} // Ending bracket of else setCardSlection
	} // Ending bracket of setCardSelection method
} // Ending bracket of RedDeck class