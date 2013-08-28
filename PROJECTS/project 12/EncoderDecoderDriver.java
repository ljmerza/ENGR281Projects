import java.util.Scanner;

public class EncoderDecoderDriver
{

	/**
	*Author: Leonardo Merza
	*Date: November 10, 2010
	*Description: This program will ask you to enter the number
	*of times the encoders will be used, then ask for a statement
	*to be encoded for both substitution and shuffle encoders.
	*/

	private static SubstitutionCipher substitute = new SubstitutionCipher();
	private static ShuffleCipher shuffle = new ShuffleCipher();
	private static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter the number of substitutions that will be used: ");
		substitute.SubstitutionCipher(keyboard.nextInt());
		keyboard.nextLine();
		System.out.println("Enter the message to be encoded: ");
		substitute.encode(keyboard.nextLine());
		System.out.println();
		System.out.println("The encoded message is:");
		System.out.println(substitute.getEncoded());
		System.out.println();
		substitute.decode(substitute.getEncoded());
		System.out.println("The decoded message is:");
		System.out.println(substitute.getDecoded());
		System.out.println();

		System.out.print("Enter the number of shuffles that will be used: ");
		shuffle.ShuffleCipher(keyboard.nextInt());
		keyboard.nextLine();
		System.out.println("Enter the message to be encoded: ");
		shuffle.encode(keyboard.nextLine());
		System.out.println();
		System.out.println("The encoded message is:");
		System.out.println(shuffle.getEncoded());
		System.out.println();
		shuffle.decode(shuffle.getEncoded());
		System.out.println("The decoded message is:");
		System.out.println(shuffle.getDecoded());
		System.out.println();

	} // Ending bracket of main method
} // Ending bracket of EncoderDecoderDriver class