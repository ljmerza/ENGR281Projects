import java.util.Scanner;

/**
*Author: Leonardo Merza
*Date: October 10, 2010
*Description: This program will ask you to enter the names
*of two players, play a game of chutes and ladders displaying
*the number of steps a player has climbed or fallen until
*a player reaches at least the 100th square, then display
*the winner of the game.
*/

public class ChutesAndLadders
{
	public static final int LADDER_UP = 10;
	public static final int LADDER_DOWN = 11;
	public static final int WINNING_SQUARE = 100;
	public static final int ZERO = 0;

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Player playerOne = new Player();
		Player playerTwo = new Player();
		Die rollDie = new Die();

		System.out.println("Please enter the name of the first player:");
		playerOne.setName(keyboard.nextLine());
		System.out.println("Please enter the name of the second player");
		playerTwo.setName(keyboard.nextLine());

		do //While playerOneCurrentSquare & playerTwoCurrentSquare < 100
		{
			rollDie.roll();
			playerOne.updateCurrentSquareNumber(rollDie.getValue());
			System.out.println(playerOne.getName() + " climbed up " +
											rollDie.getValue() + " steps.");
			rollDie.roll();
			playerTwo.updateCurrentSquareNumber(rollDie.getValue());
			System.out.println(playerTwo.getName() + " climbed up " +
											rollDie.getValue() + " steps.");

			while (playerOne.getCurrentSquareNumber() % LADDER_UP == ZERO)
			{
				rollDie.roll();
				playerOne.updateCurrentSquareNumber(rollDie.getValue());
				System.out.println(playerOne.getName() + " climbed up " +
												rollDie.getValue() + " steps.");
			} // Ending bracket of while playerOne ladderup
			while(playerTwo.getCurrentSquareNumber() % LADDER_UP == ZERO)
			{
				rollDie.roll();
				playerTwo.updateCurrentSquareNumber(rollDie.getValue());
				System.out.println(playerTwo.getName() + " climbed up " +
												rollDie.getValue() + " steps.");
			} // Ending bracket of while playerTwo ladderup
			while(playerOne.getCurrentSquareNumber() % LADDER_DOWN == ZERO)
			{
				rollDie.roll();
				playerOne.updateCurrentSquareNumber(0 - rollDie.getValue());
				System.out.println(playerOne.getName() + " fell down " +
												rollDie.getValue() + " steps.");
			} // Ending bracket of while playerOne ladderdown
			while(playerTwo.getCurrentSquareNumber() % LADDER_DOWN == ZERO)
			{
				rollDie.roll();
				playerTwo.updateCurrentSquareNumber(0 - rollDie.getValue());
				System.out.println(playerTwo.getName() + " fell down " +
												rollDie.getValue() + " steps.");
			} // Ending bracket of while playerTwo ladderdown

			System.out.println(playerOne.getName() + "'s current square number is " +
											playerOne.getCurrentSquareNumber());
			System.out.println(" and " + playerTwo.getName() +
											"'s current square number is " +
											playerTwo.getCurrentSquareNumber());
		} // Ending bracket of do while playerOne and Two <100
		while ((playerOne.getCurrentSquareNumber() < WINNING_SQUARE) &&
					(playerTwo.getCurrentSquareNumber() < WINNING_SQUARE));

		if (playerOne.getCurrentSquareNumber() < playerTwo.getCurrentSquareNumber())
		{
			System.out.println(playerTwo.getName() + " has won!");
		} // Ending bracket of if playerOne < playerTwo
		else if (playerOne.getCurrentSquareNumber() > playerTwo.getCurrentSquareNumber())
		{
			System.out.println(playerOne.getName() + " has won!");
		} // Ending bracket of else if playerOne > playerTwo
		else
		{
			System.out.println("The game is a tie.");
		} // Ending bracket of else game is tie
	} // Ending bracket of main method
} // Ending bracket of ChutesAndLadders class