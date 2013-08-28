import java.util.Scanner;

public class UncleWiggilyGame
{
	public static final int ZERO = 0;
	public static final int ONE = 1;
	public static final int TWO = 2;
	public static final int THREE = 3;
	public static final int FOUR = 4;
	public static final int BOARD_END = 151;

	private static String firstWinner, secondWinner, thirdWinner, fourthWinner;

	private static UncleWiggilyBoard checkSpaces = new UncleWiggilyBoard();
	private static Scanner keyboard = new Scanner(System.in);
	static Player playerOne = new Player();
	static Player playerTwo = new Player();
	static Player playerThree = new Player();
	static Player playerFour = new Player();

	public void namingPlayers()
	{
		/**
		*Precondition: None.
		*Postcondition: Asks and sets the names of the four players.
		*/
		System.out.println("Please enter the name of the first player:");
		this.playerOne.setName(keyboard.nextLine());
		System.out.println("Please enter the name of the second player");
		this.playerTwo.setName(keyboard.nextLine());
		System.out.println("Please enter the name of the third player:");
		this.playerThree.setName(keyboard.nextLine());
		System.out.println("Please enter the name of the fourth player");
		this.playerFour.setName(keyboard.nextLine());
	} // Ending bracket of namingPlayers method

	public static void startingGame(Player player, Player playerTwo, Player playerThree, Player playerFour)
	{
		/**
		*Precondition: None.
		*Postcondition: Starts the Uncle Wiggily game..
		*/
			while ((player.getPlayerTurn() >= UncleWiggilyGame.ZERO) && (player.getHasWon() == false))
			{
				System.out.println(player.getName() + "'s turn.");
				player.setCardChosen();
				player.updateCurrentSquareNumber(player.getCardChosen());
				checkSpaces.setSpaceTurnInstruction(player.getCurrentSquareNumber());
				player.setPlayerTurn(checkSpaces.getSpaceTurnInstruction());
				checkSpaces.setSpaceJumpInstruction(player.getCurrentSquareNumber());
				if (checkSpaces.getSpaceJumpInstruction() != UncleWiggilyGame.ZERO)
				{
					player.changeCurrentSquareNumber(checkSpaces.getSpaceJumpInstruction());
				} // Ending bracket of if checkSpaces.getSpaceJumpInstruction() != 0
				System.out.println(player.getName() + "'s current square is " +
												player.getCurrentSquareNumber());
				if(player.getCurrentSquareNumber() >= UncleWiggilyGame.BOARD_END)
				{
					player.setHasWon(true);
					if((playerTwo.getHasWon() == false) && (playerThree.getHasWon() == false) && (playerFour.getHasWon() == false))
					{
						UncleWiggilyGame.firstWinner = player.getName();
						player.setNumberOfWins(UncleWiggilyGame.FOUR);
					} // Ending bracket of if statement
					else if(((playerTwo.getHasWon() == true) && (playerThree.getHasWon() == false) && (playerFour.getHasWon() == false))  ||
							((playerTwo.getHasWon() == false) && (playerThree.getHasWon() == true) && (playerFour.getHasWon() == false))  ||
							((playerTwo.getHasWon() == false) && (playerThree.getHasWon() == false) && (playerFour.getHasWon() == true)))
					{
						UncleWiggilyGame.secondWinner = player.getName();
						player.setNumberOfWins(UncleWiggilyGame.THREE);
					} // Ending bracket of else if statement
					else if(((playerTwo.getHasWon() == true) && (playerThree.getHasWon() == true) && (playerFour.getHasWon() == false))  ||
							((playerTwo.getHasWon() == false) && (playerThree.getHasWon() == true) && (playerFour.getHasWon() == true))  ||
							((playerTwo.getHasWon() == true) && (playerThree.getHasWon() == false) && (playerFour.getHasWon() == true)))
					{
						UncleWiggilyGame.thirdWinner = player.getName();
						player.setNumberOfWins(UncleWiggilyGame.TWO);
					} // Ending bracket of else if statement
					else
					{
						UncleWiggilyGame.fourthWinner = player.getName();
						player.setNumberOfWins(UncleWiggilyGame.ONE);
					} // Ending bracket of else statement
				} // Ending bracket of if statement
				System.out.println();
				break;
			} // Ending bracket of while playersquare <151 &  playerturn >= 0
			if(player.getPlayerTurn() < UncleWiggilyGame.ZERO)
			{
				player.setPlayerTurn(player.getPlayerTurn() + UncleWiggilyGame.ONE);
			} // Ending bracket of if player turn < zero
	} // Ending bracket of startingGame method

	public void displayGameResults()
	{
		/**
		*Precondition: None.
		*Postcondition: Displays the order of winners
		*of the Uncle Wiggily's tournament.
		*/
		System.out.println("The first winner of this game is " + firstWinner);
		System.out.println("The second winner of this game is " + secondWinner);
		System.out.println("The third winner of this game is " + thirdWinner);
		System.out.println("The fourth winner of this game is " + fourthWinner);
		System.out.println();
	} // Ending bracket of displayGameResults method

	public static void resettingGameStats(Player player)
	{
		/*
		*Precondition: None.
		*Postcondition: Resets player's hasWon,
		*CurrentSquareNumber, and PlayerTurn.
		*/
		player.setHasWon(false);
		player.changeCurrentSquareNumber(ZERO);
		player.setPlayerTurn(ZERO);
	} // Ending bracket of reset game stats
} // Ending bracket of UncleWiggilyGame class