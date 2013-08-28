import java.util.Scanner;

public class TMRcalculator
{

	/**
	*Author: Leonardo Merza
	*Date: November 09, 2010
	*Description: This program will ask you how many destinations you wish to travel,
	*ask what those destinations are, then display the distanced traveled for each,
	*the total distance traveled, and the total reimbursement for the total trip.
	*/

	public static final double REIMBURSEMENT_RATE = .50;

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
	public static final int TEN =10;
	public static final int HUNDRED = 100;

	public static final int  ONE_ZERO_ZERO_FOUR = 1004;
	public static final int  ONE_SEVEN_FIVE_THREE = 1753;
	public static final int  TWO_SEVEN_FIVE_TWO = 2752;
	public static final int THREE_ZERO_ONE_SEVEN  = 3017;
	public static final int  ONE_FIVE_TWO_ZERO = 1520;
	public static final int ONE_FIVE_ZERO_SEVEN  =1507;

	public static final int  SIX_ZERO_NINE = 609;
	public static final int THREE_ONE_FIVE_FIVE  = 3155;
	public static final int  FOUR_FOUR_EIGHT = 448;
	public static final int NINE_TWO_ONE = 921;
	public static final int  ONE_SEVEN_EIGHT_ZERO= 1780;
	public static final int TWO_ZERO_FOUR_EIGHT = 2048;

	public static final int ONE_THREE_NINE_SEVEN = 1397;
	public static final int NINE_ONE_NINE = 919;
	public static final int FIVE_ONE_FIVE = 515;
	public static final int TWO_ONE_SEVEN_SIX = 2176;
	public static final int SEVEN_ZERO_NINE = 709;
	public static final int ONE_TWO_THREE_ZERO = 1230;

	public static final int ONE_THREE_NINE_NINE = 1399;
	public static final int ONE_THREE_FOUR_THREE = 1343;
	public static final int FIVE_ONE_SEVEN = 517;
	public static final int ONE_FOUR_THREE_FIVE = 1435;
	public static final int TWO_TWO_THREE_FOUR = 2234;
	public static final int ONE_THREE_ZERO_SEVEN = 1307;

	public static final int TWO_SEVEN_TWO = 272;
	public static final int TWO_FIVE_SEVEN_ZERO = 2570;
	public static final int ONE_SEVEN_THREE_TWO = 1732;
	public static final int TWO_TWO_FIVE_ONE = 2251;
	public static final int ONE_THREE_TWO_TWO = 1322;
	public static final int TWO_FOUR_TWO_ZERO = 2420;

	public static final int TWO_SEVEN_ONE_SIX = 2716;
	public static final int ONE_EIGHT_FIVE_EIGHT = 1858;
	public static final int TWO_FIVE_TWO_THREE = 2523;
	public static final int ONE_TWO_SEVEN_EIGHT = 1278;
	public static final int TWO_SIX_FOUR_SIX = 2646;
	public static final int EIGHT_SIX_ZERO = 860;

	public static final int ONE_FOUR_NINE_FOUR = 1494;
	public static final int THREE_FOUR_FOUR_SEVEN = 3447;
	public static final int ONE_ZERO_FIVE_SEVEN = 1057;
	public static final int ONE_ZERO_NINE_NINE = 1099;
	public static final int TWO_SEVEN_THREE_FOUR = 2734;
	public static final int TWO_EIGHT_TWO_ZERO = 2820;

	public static final int FIVE_SEVEN_ONE = 571;
	public static final int TWO_EIGHT_EIGHT_SEVEN = 2887;

	private static int[][] distance = new int[TEN][TEN];
	private static int[] traveledDistance;
	private static String[] currentCity = new String[TEN];
	private static String[] traveledCity;

	private static double reimbursement;
	private static int citiesVisited;
	private static int startingCity;
	private static int destinationCity;
	private static int totalDistance;

	public static void main(String[] args)
	{
		distance [ZERO] [ZERO] = ZERO;
		distance [ZERO] [ONE] = ONE_ZERO_ZERO_FOUR;
		distance [ZERO] [TWO] = ONE_SEVEN_FIVE_THREE;
		distance [ZERO] [THREE] = TWO_SEVEN_FIVE_TWO;
		distance [ZERO] [FOUR] = THREE_ZERO_ONE_SEVEN;
		distance [ZERO] [FIVE] = ONE_FIVE_TWO_ZERO;
		distance [ZERO] [SIX] = ONE_FIVE_ZERO_SEVEN;
		distance [ZERO] [SEVEN] = SIX_ZERO_NINE;
		distance [ZERO] [EIGHT] = THREE_ONE_FIVE_FIVE;
		distance [ZERO] [NINE] = FOUR_FOUR_EIGHT;

		distance [ONE] [ZERO] =ONE_ZERO_ZERO_FOUR ;
		distance [ONE] [ONE] = ZERO;
		distance [ONE] [TWO] = NINE_TWO_ONE;
		distance [ONE] [THREE] = ONE_SEVEN_EIGHT_ZERO;
		distance [ONE] [FOUR] = TWO_ZERO_FOUR_EIGHT;
		distance [ONE] [FIVE] = ONE_THREE_NINE_SEVEN;
		distance [ONE] [SIX] = NINE_ONE_NINE;
		distance [ONE] [SEVEN] = FIVE_ONE_FIVE;
		distance [ONE] [EIGHT] = TWO_ONE_SEVEN_SIX;
		distance [ONE] [NINE] =SEVEN_ZERO_NINE;

		distance [TWO] [ZERO] = ONE_SEVEN_FIVE_THREE;
		distance [TWO] [ONE] = NINE_TWO_ONE;
		distance [TWO] [TWO] = ZERO;
		distance [TWO] [THREE] = ONE_TWO_THREE_ZERO;
		distance [TWO] [FOUR] = ONE_THREE_NINE_NINE;
		distance [TWO] [FIVE] = ONE_THREE_FOUR_THREE;
		distance [TWO] [SIX] = FIVE_ONE_SEVEN;
		distance [TWO] [SEVEN] = ONE_FOUR_THREE_FIVE;
		distance [TWO] [EIGHT] = TWO_TWO_THREE_FOUR;
		distance [TWO] [NINE] = ONE_THREE_ZERO_SEVEN;

		distance [THREE] [ZERO] = TWO_SEVEN_FIVE_TWO;
		distance [THREE] [ONE] = ONE_SEVEN_EIGHT_ZERO;
		distance [THREE] [TWO] = ONE_TWO_THREE_ZERO;
		distance [THREE] [THREE] = ZERO;
		distance [THREE] [FOUR] = TWO_SEVEN_TWO;
		distance [THREE] [FIVE] = TWO_FIVE_SEVEN_ZERO;
		distance [THREE] [SIX] = ONE_SEVEN_THREE_TWO;
		distance [THREE] [SEVEN] = TWO_TWO_FIVE_ONE;
		distance [THREE] [EIGHT] = ONE_THREE_TWO_TWO;
		distance [THREE] [NINE] = TWO_FOUR_TWO_ZERO;

		distance [FOUR] [ZERO] = THREE_ZERO_ONE_SEVEN;
		distance [FOUR] [ONE] = TWO_ZERO_FOUR_EIGHT;
		distance [FOUR] [TWO] = ONE_THREE_NINE_NINE;
		distance [FOUR] [THREE] =TWO_SEVEN_TWO ;
		distance [FOUR] [FOUR] = ZERO;
		distance [FOUR] [FIVE] = TWO_SEVEN_ONE_SIX;
		distance [FOUR] [SIX] =ONE_EIGHT_FIVE_EIGHT ;
		distance [FOUR] [SEVEN] = TWO_FIVE_TWO_THREE;
		distance [FOUR] [EIGHT] = ONE_TWO_SEVEN_EIGHT;
		distance [FOUR] [NINE] = TWO_SIX_FOUR_SIX;

		distance [FIVE] [ZERO] = ONE_FIVE_TWO_ZERO;
		distance [FIVE] [ONE] = ONE_THREE_NINE_SEVEN;
		distance [FIVE] [TWO] = ONE_THREE_FOUR_THREE;
		distance [FIVE] [THREE] =TWO_FIVE_SEVEN_ZERO ;
		distance [FIVE] [FOUR] = TWO_SEVEN_ONE_SIX;
		distance [FIVE] [FIVE] = ZERO;
		distance [FIVE] [SIX] = EIGHT_SIX_ZERO;
		distance [FIVE] [SEVEN] = ONE_FOUR_NINE_FOUR;
		distance [FIVE] [EIGHT] = THREE_FOUR_FOUR_SEVEN;
		distance [FIVE] [NINE] = ONE_ZERO_FIVE_SEVEN;

		distance [SIX] [ZERO] = ONE_FIVE_ZERO_SEVEN;
		distance [SIX] [ONE] = NINE_ONE_NINE;
		distance [SIX] [TWO] = FIVE_ONE_SEVEN;
		distance [SIX] [THREE] = ONE_SEVEN_THREE_TWO;
		distance [SIX] [FOUR] = ONE_EIGHT_FIVE_EIGHT;
		distance [SIX] [FIVE] = EIGHT_SIX_ZERO;
		distance [SIX] [SIX] = ZERO;
		distance [SIX] [SEVEN] = ONE_THREE_ZERO_SEVEN;
		distance [SIX] [EIGHT] = TWO_SEVEN_THREE_FOUR;
		distance [SIX] [NINE] = ONE_ZERO_NINE_NINE;

		distance [SEVEN] [ZERO] = SIX_ZERO_NINE;
		distance [SEVEN] [ONE] = FIVE_ONE_FIVE;
		distance [SEVEN] [TWO] = ONE_FOUR_THREE_FIVE;
		distance [SEVEN] [THREE] = TWO_TWO_FIVE_ONE;
		distance [SEVEN] [FOUR] = TWO_FIVE_TWO_THREE;
		distance [SEVEN] [FIVE] = ONE_FOUR_NINE_FOUR;
		distance [SEVEN] [SIX] = ONE_THREE_ZERO_SEVEN;
		distance [SEVEN] [SEVEN] = ZERO;
		distance [SEVEN] [EIGHT] = TWO_EIGHT_TWO_ZERO;
		distance [SEVEN] [NINE] = FIVE_SEVEN_ONE;

		distance [EIGHT] [ZERO] = THREE_ONE_FIVE_FIVE;
		distance [EIGHT] [ONE] = TWO_ONE_SEVEN_SIX;
		distance [EIGHT] [TWO] = TWO_TWO_THREE_FOUR;
		distance [EIGHT] [THREE] = ONE_THREE_TWO_TWO;
		distance [EIGHT] [FOUR] = ONE_TWO_SEVEN_EIGHT;
		distance [EIGHT] [FIVE] = THREE_FOUR_FOUR_SEVEN;
		distance [EIGHT] [SIX] = TWO_SEVEN_THREE_FOUR;
		distance [EIGHT] [SEVEN] = TWO_EIGHT_TWO_ZERO;
		distance [EIGHT] [EIGHT] = ZERO;
		distance [EIGHT] [NINE] = TWO_EIGHT_EIGHT_SEVEN;

		distance [NINE] [ZERO] = FOUR_FOUR_EIGHT;
		distance [NINE] [ONE] = SEVEN_ZERO_NINE;
		distance [NINE] [TWO] = ONE_THREE_ZERO_SEVEN;
		distance [NINE] [THREE] = TWO_FOUR_TWO_ZERO;
		distance [NINE] [FOUR] = TWO_SIX_FOUR_SIX;
		distance [NINE] [FIVE] = ONE_ZERO_FIVE_SEVEN;
		distance [NINE] [SIX] = ONE_ZERO_NINE_NINE;
		distance [NINE] [SEVEN] = FIVE_SEVEN_ONE;
		distance [NINE] [EIGHT] = TWO_EIGHT_EIGHT_SEVEN;
		distance [NINE] [NINE] = ZERO;

		currentCity[ZERO] = "Boston"; currentCity[ONE] = "Chicago"; currentCity[TWO] = "Dallas";
		currentCity[THREE] = "Reno"; currentCity[FOUR] = "Los Angeles"; currentCity[FIVE] = "Miami";
		currentCity[SIX] = "New Orleans"; currentCity[SEVEN] = "Toronto"; currentCity[EIGHT] = "Vancouver";
		currentCity[NINE] = "Washington D.C.";

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter the number cities visited this trip: ");
		citiesVisited = keyboard.nextInt();
		traveledDistance = new int[citiesVisited];
		traveledCity = new String[citiesVisited + ONE];
		System.out.println();

		System.out.println("Please enter the starting point city: \n" +
										"(Enter 1 for Boston, 2 for Chicago, 3 for Dallas,\n" +
										"4 for Reno, 5 for Los Angeles, 6 for Miami,\n" +
										"7 for New Orleans, 8 for Toronto, 9 for Vancouver,\n" +
										"or 10 for Washington D.C.)");
		startingCity = keyboard.nextInt() - ONE;
		System.out.println("Your starting City is " + currentCity[startingCity]);
		System.out.println();
		traveledCity[ZERO] = currentCity[startingCity];

		for( int i = ZERO; i < citiesVisited; i++)
		{
			System.out.println("Please enter the destination city: \n" +
											"(Enter 1 for Boston, 2 for Chicago, 3 for Dallas,\n" +
											"4 for Reno, 5 for Los Angeles, 6 for Miami,\n" +
											"7 for New Orleans, 8 for Toronto, 9 for Vancouver,\n" +
											"or 10 for Washington D.C.)");
			destinationCity= keyboard.nextInt() - ONE;

			traveledDistance[i] = distance[startingCity][destinationCity];
			totalDistance = totalDistance + traveledDistance[i];
			System.out.println();
			System.out.println("You traveled from " + currentCity[startingCity] + " to " + currentCity[destinationCity] + ".");
			System.out.println("You have just traveled " + traveledDistance[i] + " miles and");
			System.out.println("have traveled a total of " + totalDistance + " miles.");
			System.out.println();
			startingCity = destinationCity;
			traveledCity[i + ONE] = currentCity[destinationCity];
		} // Ending bracket of for loop

		System.out.println("These are the individual distances traveled from city to city:");
		for(int i = ZERO, j = ZERO; i < citiesVisited; i++)
		{
			System.out.print("From " + traveledCity[j] );
			j++;
			System.out.println(" to " + traveledCity[j] + ":");
			System.out.println(traveledDistance[i] + " miles.");
		} // Ending bracket of for loop

		System.out.println();
		System.out.println("Your total distance traveled is " + totalDistance + " miles.");
		reimbursement = totalDistance * REIMBURSEMENT_RATE;
		System.out.println();
		System.out.println("Your reimbursement for your travels is $" + reimbursement + "0.");

	} // Ending bracket of main method
} // Ending bracket of TMRcalculator class