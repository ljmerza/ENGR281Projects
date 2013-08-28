import java.util.Scanner;

public class GuessMyNumber

/**
*Author: Leonardo Merza
*Date: September 21, 2010
*Description: This program will guess a number
*from 0 to 999 that the user is thinking and detect
*if the user is cheating.
*/

{
	public static final int HIGH_BOUND = 999;
	public static final int LOW_BOUND = 0;

	public static final int STARTING_NUMBER_OF_GUESSES = 0;
	public static final int AVERAGE = 2;
	public static final int ELEVEN_GUESSES = 11;
	public static final int CHEAT_DETECT = 10; /*Maximum number of guesses
												*before no guesses left
												*/
	public static final int INITIALIZING_INT = -1; /*initializing ints
													*for compiler
													*/

	public static final String DEFAULT_ANSWER = "x"; /*Used for
													  *try again loop
													  */
	public static final String HIGHER = "h";
	public static final String LOWER = "l";
	public static final String CORRECT = "y";

	public static void main(String[] args)
	{
		String answer = DEFAULT_ANSWER; /*If answer = LOWER or HIGHER then
										 *continue with while loop until
										 *answer = CORRECT
									   	 */
		int guess = STARTING_NUMBER_OF_GUESSES; /*Initializing
												 *guess for compiler
												 */
		int currentGuess = (LOW_BOUND +
							HIGH_BOUND) / AVERAGE; /*Starting currentGuess
													*at average of
													*high/low bounds
															    */
		int correctAnswer = INITIALIZING_INT; /* Initializing correctAnswer
											   *for compiler
											   */
		int lowBound = LOW_BOUND;
		int highBound = HIGH_BOUND;
		int answerIsHighBound = HIGH_BOUND - AVERAGE; /*Used for int
													   *truncating bug
													   */
		int guessAnswer = INITIALIZING_INT;

		boolean isFalse = false; /* Used to override detectCheat for
								  *currentGuess = HIGH_BOUND
								  */

		//Initial question, instantiation of Scanner keyboard
		System.out.println("Think of a number from " +
							LOW_BOUND + " to " + HIGH_BOUND);
		System.out.println("and I will try to guess it.");
		System.out.println();
		Scanner keyboard = new Scanner(System.in);

		do // while (correctAnswer != currentGuess)
		{

			// Asking if currentGuess is correct or not entering only y, l, or h
			System.out.println("Is the number " + currentGuess + "?");
			System.out.println();
			System.out.print("(Enter " + CORRECT + " if it is,\n" +
								LOWER + " if you number is lower\n" +
								"or " + HIGHER + " if you number is higher)");
			answer = keyboard.nextLine();

			if (isFalse == false) /*Used to circumvent cheatDetect
								   *if currentGuess = HIGH_BOUND
								   */
			{
				++guess;
			} //Ending bracket of if isFalse = false
			else
			{
				guess = ELEVEN_GUESSES;
			} // Ending bracket of else isFalse = false

			if (lowBound != answerIsHighBound) /* If guessed number is 999 for
												*int truncating bug
												*/
			{
				do // while !(answer.equals(DEFAULT_ANSWER)
				{
					if(answer.equalsIgnoreCase(CORRECT))
					{
						answer = DEFAULT_ANSWER;
						correctAnswer = currentGuess;
						guessAnswer = guess;
						guess = STARTING_NUMBER_OF_GUESSES;
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
					else // If answer is not y, l, or h
					{
						do // Try again until answer = y, l, or h
						{
							System.out.print("Enter " + CORRECT + ", " +
											LOWER + ", or " + HIGHER +
											" only! Try again:");
							answer = keyboard.nextLine();
						} // Ending bracket of do try again
						// repeat try again until answer = y, l, or h
						while ( !(answer.equalsIgnoreCase(HIGHER)) &&
								!(answer.equalsIgnoreCase(CORRECT)) &&
								!(answer.equalsIgnoreCase(LOWER)) );
					} // Ending bracket of else answer if not y, l, or h
				} while (!(answer.equals(DEFAULT_ANSWER)));

				if (guess < CHEAT_DETECT) /*Detect if user is cheating.
										   *Maximum number of guesses
				    					   *is 10 unless answer is the
				    					   *HIGH_BOUND.
										   */
				{
					//Do nothing
				} // Ending bracket of if guess != detectCheat
				else
				{
					/*Display do not cheat and exit if guesses
					 *reach maximum of 10
					 */
					System.out.println();
					System.out.println("Do not cheat!");
					System.exit(0);
				} // Ending bracket of else maximum number of guesses reached
			} // Ending bracket of if lowBound != ANSWER_IS_HIGH_BOUND
			else
			{
				currentGuess = HIGH_BOUND;
				guess = STARTING_NUMBER_OF_GUESSES;
				isFalse = true;
				lowBound = LOW_BOUND;

			} /*Ending bracket of else guessed number is 999
			   *for int truncating bug
			   */
		} // Ending bracket of do set correctAnswer = currentGuess or do averages
		while (correctAnswer != currentGuess);

		System.out.println();
		System.out.print("I guessed your number, " + correctAnswer +
						", in " + guessAnswer);

		//If correctAnswer = first guess
		if (correctAnswer ==  ((LOW_BOUND + HIGH_BOUND) / AVERAGE) )
		{
			System.out.println(" guess.");
		} // Ending bracket for if guessAnswer = 1
		else
		{
			System.out.println(" guesses.");
		} // Ending bracket for else guessAnswer = 1

	} // Ending bracket of main method
} // Ending bracket of GuessMyNumber class