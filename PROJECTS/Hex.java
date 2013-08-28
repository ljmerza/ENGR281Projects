import java.util.Scanner;

public class Hex

/**
*Author: Leonardo Merza
*Date: September 14, 2010
*Description: This program will take a three digit
*hexadecimal number and convert it to the decimal form.
*/

{
	public static final int SET_VARIABLE = 0;

	public static final int HEX_ZERO = 0;
	public static final int HEX_ONE = 1;
	public static final int HEX_TWO = 2;
	public static final int HEX_THREE = 3;
	public static final int HEX_FOUR = 4;
	public static final int HEX_FIVE = 5;
	public static final int HEX_SIX = 6;
	public static final int HEX_SEVEN = 7;
	public static final int HEX_EIGHT = 8;
	public static final int HEX_NINE = 9;
	public static final int HEX_A = 10;
	public static final int HEX_B =11;
	public static final int HEX_C = 12;
	public static final int HEX_D = 13;
	public static final int HEX_E = 14;
	public static final int HEX_F = 15;

	public static final int INT_ONE = 256;
	public static final int INT_TWO = 16;
	public static final int INT_THREE = 1;

	public static void main(String[] args)
	{
		String inString;
		int firstDigit = SET_VARIABLE;
		int secondDigit = SET_VARIABLE;
		int thirdDigit = SET_VARIABLE;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a three digit hexadecimal number");
		System.out.print("and I will convert it to decimal form: ");
		inString = keyboard.nextLine();

		if (inString.charAt(0) == '0')
		{
			firstDigit = HEX_ZERO * INT_ONE;
		} //Ending if statement
		if (inString.charAt(0) == '1')
		{
			firstDigit = HEX_ONE * INT_ONE;
		} //Ending if statement
		if (inString.charAt(0) == '2')
		{
			firstDigit = HEX_TWO * INT_ONE;
		} //Ending if statement
		if (inString.charAt(0) == '3')
		{
			firstDigit = HEX_THREE * INT_ONE;
		} //Ending if statement
		if (inString.charAt(0) == '4')
		{
			firstDigit = HEX_FOUR * INT_ONE;
		} //Ending if statement
		if (inString.charAt(0) == '5')
		{
			firstDigit = HEX_FIVE * INT_ONE;
		} //Ending if statement
		if (inString.charAt(0) == '6')
		{
			firstDigit = HEX_SIX * INT_ONE;
		} //Ending if statement
		if (inString.charAt(0) == '7')
		{
			firstDigit = HEX_SEVEN * INT_ONE;
		} //Ending if statement
		if (inString.charAt(0) == '8')
		{
			firstDigit = HEX_EIGHT * INT_ONE;
		} //Ending if statement
		if (inString.charAt(0) == '9')
		{
			firstDigit = HEX_NINE * INT_ONE;
		} //Ending if statement
		if (inString.charAt(0) == 'A')
		{
			firstDigit = HEX_A * INT_ONE;
		} //Ending if statement
		if (inString.charAt(0) == 'B')
		{
			firstDigit = HEX_B * INT_ONE;
		} //Ending if statement
		if (inString.charAt(0) == 'C')
		{
			firstDigit = HEX_C * INT_ONE;
		} //Ending if statement
		if (inString.charAt(0) == 'D')
		{
			firstDigit = HEX_D * INT_ONE;
		} //Ending if statement
		if (inString.charAt(0) == 'E')
		{
			firstDigit = HEX_E * INT_ONE;
		} //Ending if statement
		if (inString.charAt(0) == 'F')
		{
			firstDigit = HEX_F * INT_ONE;
		} //Ending if statement

		if (inString.charAt(1) == '0')
		{
			secondDigit = HEX_ZERO * INT_TWO;
		} //Ending if statement
		if (inString.charAt(1) == '1')
		{
			secondDigit = HEX_ONE * INT_TWO;
		} //Ending if statement
		if (inString.charAt(1) == '2')
		{
			secondDigit = HEX_TWO * INT_TWO;
		} //Ending if statement
		if (inString.charAt(1) == '3')
		{
			secondDigit = HEX_THREE * INT_TWO;
		} //Ending if statement
		if (inString.charAt(1) == '4')
		{
			secondDigit = HEX_FOUR * INT_TWO;
		} //Ending if statement
		if (inString.charAt(1) == '5')
		{
			secondDigit = HEX_FIVE * INT_TWO;
		} //Ending if statement
		if (inString.charAt(1) == '6')
		{
			secondDigit = HEX_SIX * INT_TWO;
		} //Ending if statement
		if (inString.charAt(1) == '7')
		{
			secondDigit = HEX_SEVEN * INT_TWO;
		} //Ending if statement
		if (inString.charAt(1) == '8')
		{
			secondDigit = HEX_EIGHT * INT_TWO;
		} //Ending if statement
		if (inString.charAt(1) == '9')
		{
			secondDigit = HEX_NINE * INT_TWO;
		} //Ending if statement
		if (inString.charAt(1) == 'A')
		{
			secondDigit = HEX_A * INT_TWO;
		} //Ending if statement
		if (inString.charAt(1) == 'B')
		{
			secondDigit = HEX_B * INT_TWO;
		} //Ending if statement
		if (inString.charAt(1) == 'C')
		{
			secondDigit = HEX_C * INT_TWO;
		} //Ending if statement
		if (inString.charAt(1) == 'D')
		{
			secondDigit = HEX_D * INT_TWO;
		} //Ending if statement
		if (inString.charAt(1) == 'E')
		{
			secondDigit = HEX_E * INT_TWO;
		} //Ending if statement
		if (inString.charAt(1) == 'F')
		{
			secondDigit = HEX_F * INT_TWO;
		} //Ending if statement

		if (inString.charAt(2) == '0')
		{
			thirdDigit = HEX_ZERO * INT_THREE;
		} //Ending if statement
		if (inString.charAt(2) == '1')
		{
			thirdDigit = HEX_ONE * INT_THREE;
		} //Ending if statement
		if (inString.charAt(2) == '2')
		{
			thirdDigit = HEX_TWO * INT_THREE;
		} //Ending if statement
		if (inString.charAt(2) == '3')
		{
			thirdDigit = HEX_THREE * INT_THREE;
		} //Ending if statement
		if (inString.charAt(2) == '4')
		{
			thirdDigit = HEX_FOUR * INT_THREE;
		} //Ending if statement
		if (inString.charAt(2) == '5')
		{
			thirdDigit = HEX_FIVE * INT_THREE;
		} //Ending if statement
		if (inString.charAt(2) == '6')
		{
			thirdDigit = HEX_SIX * INT_THREE;
		} //Ending if statement
		if (inString.charAt(2) == '7')
		{
			thirdDigit = HEX_SEVEN * INT_THREE;
		} //Ending if statement
		if (inString.charAt(2) == '8')
		{
			thirdDigit = HEX_EIGHT * INT_THREE;
		} //Ending if statement
		if (inString.charAt(2) == '9')
		{
			thirdDigit = HEX_NINE * INT_THREE;
		} //Ending if statement
		if (inString.charAt(2) == 'A')
		{
			thirdDigit = HEX_A * INT_THREE;
		} //Ending if statement
		if (inString.charAt(2) == 'B')
		{
			thirdDigit = HEX_B * INT_THREE;
		} //Ending if statement
		if (inString.charAt(2) == 'C')
		{
			thirdDigit = HEX_C * INT_THREE;
		} //Ending if statement
		if (inString.charAt(2) == 'D')
		{
			thirdDigit = HEX_D * INT_THREE;
		} //Ending if statement
		if (inString.charAt(2) == 'E')
		{
			thirdDigit = HEX_E * INT_THREE;
		} //Ending if statement
		if (inString.charAt(2) == 'F')
		{
			thirdDigit = HEX_F * INT_THREE;
		} //Ending if statement

		System.out.print("The decimal form of the hexadecimal " +
						inString + " is: ");
		System.out.println(firstDigit + secondDigit + thirdDigit);


	} //Ending main method
} //Ending Hex class