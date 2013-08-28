import java.util.Scanner;

public class GuessMyNumberOriginal

/**
*Author: Leonardo Merza
*Date: September 21, 2010
*Description: This program will guess a number
*from 0 to 999 that the user is thinking and detect
*if the user is cheating.
*/

{
	public static final int AVERAGE = 2;
	public static final int INITIALIZING_INT = -1;
	public static final int HIGH_BOUND = 999;
	public static final int LOW_BOUND = 0;
	public static final int STARTING_GUESS = 0;
	public static final int CHEAT_DETECT = 10;


	public static final String HIGHER = "h";
	public static final String LOWER = "l";
	public static final String CORRECT = "y";
	public static final String DEFAULT_ANSWER = "x";

	public static void main(String[] args)
	{
		String answer = DEFAULT_ANSWER;
		int correctAnswer = INITIALIZING_INT;
		int currentGuess = (LOW_BOUND + HIGH_BOUND) / AVERAGE;
		int guess = STARTING_GUESS;
		int lowBound = LOW_BOUND;
		int highBound = HIGH_BOUND;

		System.out.println("Think of a number from " +
							LOW_BOUND + " to " + HIGH_BOUND);
		System.out.println("and I will try to guess it.");
		System.out.println();

		Scanner keyboard = new Scanner(System.in);

		do //while(correctAnswer == LOOP);
		{
			if (guess != CHEAT_DETECT) //Detect if cheating
			{
				System.out.println("Is the number " + currentGuess + "?");
				System.out.println();
				System.out.print("(Enter " + CORRECT + " if it is,\n" +
									LOWER + " if you number is lower\n" +
									"or " + HIGHER + " if you number is higher)");
				answer = keyboard.nextLine();

				do //while answer = HIGHER LOWER or CORRECT
				{
					guess++;
					if(answer.equalsIgnoreCase(CORRECT))
					{
						answer = DEFAULT_ANSWER;
						correctAnswer = currentGuess;
					} // Ending bracket of if
					else if(answer.equalsIgnoreCase(LOWER))
					{
						answer = DEFAULT_ANSWER;
						highBound = currentGuess;
						currentGuess = (currentGuess + lowBound) / AVERAGE;
					} // Ending bracket of if
					else if(answer.equalsIgnoreCase(HIGHER))
					{
						answer = DEFAULT_ANSWER;
						lowBound = currentGuess;
						currentGuess = (currentGuess + highBound) / AVERAGE;
						} // Ending bracket of if
					else
					{
						guess--;
						do //while answer != HIGHER LOWER or CORRECT
						{
							System.out.print("Enter " + CORRECT + ", " + LOWER +
											", or " + HIGHER + " only! Try again:");
							answer = keyboard.nextLine();
						} // Ending bracket of do
						while ( !(answer.equalsIgnoreCase(HIGHER)) &&
								!(answer.equalsIgnoreCase(CORRECT)) &&
								!(answer.equalsIgnoreCase(LOWER)) );

					} // Ending bracket of else
				}  // Ending bracket of do
				while ( (answer.equalsIgnoreCase(HIGHER)) ||
						(answer.equalsIgnoreCase(LOWER)) ||
						(answer.equalsIgnoreCase(CORRECT)) );

			} // Ending bracket of if
			else
			{
				System.out.println();
				System.out.println("Do not cheat!");
				System.exit(0);
			} // Ending bracket of else
		} // Ending bracket of do loop
		while(correctAnswer != currentGuess);

		System.out.println();
		System.out.println("I guessed your number, " + correctAnswer +
							" in " + guess + " guesses.");

	} // Ending bracket of main method
} // Ending bracket of GuessMyNumber