public class UncleWiggilyTournament
{

/**
*Author: Leonardo Merza
*Date: October 15, 2010
*Description: This program will ask you to enter the names of
*four players, then start a ten game tournament of
*Uncle Wiggily's board game. At the end, it will display the
*order of winners of the tournament.
*/
	public static final int ZERO = 0;
	public static final int TEN = 10;
	public static final int BOARD_END = 151;

	private static int gamesPlayed = ZERO;
	private static String firstWinner, secondWinner, thirdWinner, fourthWinner;

	public static void main(String[] args)
	{
		System.out.println("Four players will play Uncle Wiggily's board game ten times.");
		System.out.println("For each game, first place gets four points, second place gets three points,");
		System.out.println("third place gets two points, and fourth place gets one point.");
		System.out.println("At the end of the tournament, player scores will be added up and shown.");
		System.out.println();
		UncleWiggilyGame startGame = new UncleWiggilyGame();

		startGame.namingPlayers();

		while(UncleWiggilyTournament.gamesPlayed < UncleWiggilyTournament.TEN)
		{
			while((UncleWiggilyGame.playerOne.getCurrentSquareNumber() < UncleWiggilyTournament.BOARD_END) ||
					(UncleWiggilyGame.playerTwo.getCurrentSquareNumber() < UncleWiggilyTournament.BOARD_END) ||
					(UncleWiggilyGame.playerThree.getCurrentSquareNumber() < UncleWiggilyTournament.BOARD_END) ||
					(UncleWiggilyGame.playerFour.getCurrentSquareNumber() < UncleWiggilyTournament.BOARD_END))
			{
				startGame.startingGame(UncleWiggilyGame.playerOne, UncleWiggilyGame.playerTwo,
															UncleWiggilyGame.playerThree, UncleWiggilyGame.playerFour);
				startGame.startingGame(UncleWiggilyGame.playerTwo, UncleWiggilyGame.playerOne,
															UncleWiggilyGame.playerThree, UncleWiggilyGame.playerFour);
				startGame.startingGame(UncleWiggilyGame.playerThree, UncleWiggilyGame.playerOne,
															UncleWiggilyGame.playerTwo, UncleWiggilyGame.playerFour);
				startGame.startingGame(UncleWiggilyGame.playerFour, UncleWiggilyGame.playerOne,
															UncleWiggilyGame.playerTwo, UncleWiggilyGame.playerThree);
			} // ending bracket of while all player's squares are < 151

			startGame.displayGameResults();
			UncleWiggilyGame.resettingGameStats(UncleWiggilyGame.playerOne);
			UncleWiggilyGame.resettingGameStats(UncleWiggilyGame.playerTwo);
			UncleWiggilyGame.resettingGameStats(UncleWiggilyGame.playerThree);
			UncleWiggilyGame.resettingGameStats(UncleWiggilyGame.playerFour);
			UncleWiggilyTournament.gamesPlayed++;
		} // Ending bracket of while numberOfWins < 10

		setTournamentWinners(UncleWiggilyGame.playerOne, UncleWiggilyGame.playerTwo,
												UncleWiggilyGame.playerThree, UncleWiggilyGame.playerFour);
		setTournamentWinners(UncleWiggilyGame.playerTwo, UncleWiggilyGame.playerOne,
												UncleWiggilyGame.playerThree, UncleWiggilyGame.playerFour);
		setTournamentWinners(UncleWiggilyGame.playerThree, UncleWiggilyGame.playerOne,
												UncleWiggilyGame.playerTwo, UncleWiggilyGame.playerFour);
		setTournamentWinners(UncleWiggilyGame.playerFour, UncleWiggilyGame.playerOne,
												UncleWiggilyGame.playerTwo, UncleWiggilyGame.playerThree);
		UncleWiggilyTournament.displayWinners();
	} // Ending bracket of main method

	/**
	*Precondition: Four players of the Uncle Wiggily Tournament.
	*Postcondition: Sets the order of winners of the entire tournament.
	*/
	private static void setTournamentWinners(Player player, Player playerTwo,  Player playerThree, Player playerFour)
	{
		if((player.getNumberOfWins()  >= playerTwo.getNumberOfWins()) &&
		(player.getNumberOfWins()  >= playerThree.getNumberOfWins()) &&
		(player.getNumberOfWins()  >= playerFour.getNumberOfWins()))
		{
			UncleWiggilyTournament.firstWinner = player.getName();
		} // Ending bracket of if statement
		else if(((player.getNumberOfWins()  <= playerTwo.getNumberOfWins()) &&
		(player.getNumberOfWins()  >= playerThree.getNumberOfWins()) &&
		(player.getNumberOfWins()  >= playerFour.getNumberOfWins())) ||

		((player.getNumberOfWins()  >= playerTwo.getNumberOfWins()) &&
		(player.getNumberOfWins()  <= playerThree.getNumberOfWins()) &&
		(player.getNumberOfWins()  >= playerFour.getNumberOfWins())) ||

		((player.getNumberOfWins()  >= playerTwo.getNumberOfWins()) &&
		(player.getNumberOfWins()  >= playerThree.getNumberOfWins()) &&
		(player.getNumberOfWins()  <= playerFour.getNumberOfWins())))
		{
			UncleWiggilyTournament.secondWinner = player.getName();
		} // Ending bracket of else if statement
		else if(((player.getNumberOfWins()  <=playerTwo.getNumberOfWins()) &&
		(player.getNumberOfWins()  <= playerThree.getNumberOfWins()) &&
		(player.getNumberOfWins()  >= playerFour.getNumberOfWins())) ||

		((player.getNumberOfWins()  <= playerTwo.getNumberOfWins()) &&
		(player.getNumberOfWins()  >= playerThree.getNumberOfWins()) &&
		(player.getNumberOfWins()  <= playerFour.getNumberOfWins())) ||

		((player.getNumberOfWins()  >= playerTwo.getNumberOfWins()) &&
		(player.getNumberOfWins()  <= playerThree.getNumberOfWins()) &&
		(player.getNumberOfWins()  <= playerFour.getNumberOfWins())))
		{
			UncleWiggilyTournament.thirdWinner = player.getName();
		} // Ending bracket of esle if statement
		else
		{
			UncleWiggilyTournament.fourthWinner = player.getName();
		} // Ending bracket of else statement
	} // Ending bracket of setTournamentWinners method

	/**
	*Precondition: None.
	*Postcondition: Displays the winners of the Uncle Wiggily's tournament.
	*/
	private static void displayWinners()
	{
		System.out.println(UncleWiggilyGame.playerOne.getName() + "'s score is: " +
										UncleWiggilyGame.playerOne.getNumberOfWins());
		System.out.println(UncleWiggilyGame.playerTwo.getName() + "'s score is: " +
										UncleWiggilyGame.playerTwo.getNumberOfWins());
		System.out.println(UncleWiggilyGame.playerThree.getName() + "'s score is: " +
										UncleWiggilyGame.playerThree.getNumberOfWins());
		System.out.println(UncleWiggilyGame.playerFour.getName() + "'s score is: " +
										UncleWiggilyGame.playerFour.getNumberOfWins());
		System.out.println();
		System.out.println("First place of the tournament is " + UncleWiggilyTournament.firstWinner);
		System.out.println("Second place of the tournament is " + UncleWiggilyTournament.secondWinner);
		System.out.println("Third place of the tournament is " + UncleWiggilyTournament.thirdWinner);
		System.out.println("Fourth place of the tournament is " + UncleWiggilyTournament.fourthWinner);
	} // Ending bracket of displayWinners method
} // Ending bracket of UncleWiggilyTournament