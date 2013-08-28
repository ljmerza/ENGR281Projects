import java.io.PrintWriter;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class ExtraCreditThree
{
	/**
	*Author: Leonardo Merza
	*Date: December 2, 2010
	*Description: This program will read a text file full of
	*names and create an new text file that organizes those
	*names with one name per line.
	*/
	public static final int ZERO = 0;

	private static String fileNameEntered;
	private static String newFileNameEntered;
	private static String[] nameArray;
	private static int numberOfWords = ZERO;
	private static Scanner inputStream = null;
	private static Scanner inputStreamTwo = null;
	private static Scanner keyboard = new Scanner(System.in);
	private static PrintWriter outputStream = null;

	public static void main(String[] args)
	{
		System.out.println("Please enter the name of the file you want to use:");
		fileNameEntered = keyboard.next();
		try
		{
			inputStream = new Scanner(new File(fileNameEntered));
			inputStreamTwo = new Scanner(new File(fileNameEntered));
		} // Ending bracket of try block
		catch(FileNotFoundException fnfe)
		{
			System.out.println("Error opening the file " + fileNameEntered + ".");
			System.exit(0);
		} // Ending bracket of catch block

		while(inputStream.hasNext())
		{
			++numberOfWords;
			inputStream.next();
		} // Ending bracket of while statement
		nameArray = new String[numberOfWords];

		for(int i = ZERO; i < numberOfWords; i++)
		{
			nameArray[i] = inputStreamTwo.next();
		} // Ending bracket of for loop

		inputStream.close();
		inputStreamTwo.close();
		System.out.println("Old file successfully read and closed.");
		System.out.println("Please enter the name of the new file you want to make:");
		newFileNameEntered = keyboard.next();

		try
		{
			outputStream = new PrintWriter(newFileNameEntered);
		} // Ending bracket of try block
		catch(FileNotFoundException fnfe)
		{
			System.out.println("Error creating the file " + newFileNameEntered + ".");
			System.exit(0);
		} // Ending bracket of catch block

		for(int i = ZERO; i < numberOfWords; i++)
		{
			outputStream.print(nameArray[i] + " ");
			++i;
			outputStream.println(nameArray[i]);
		} // Ending bracket of for loop

		outputStream.close();
		System.out.println("New file created and written to successfully.");

	} // Ending bracket of main method
} // Ending bracket of ExtraCreditThree class