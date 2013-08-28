import java.util.Scanner;

public class DimensionsConverterDemo
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		System.out.println("Enter a measurement in inches:");
		double inches = key.nextDouble();

		double feet = DimensionConverter.convertInchesToFeet(inches);
		System.out.println(inches + " inches = " + feet + " feet.");

		System.out.println("Enter a measurement in feet:");
		feet = key.nextDouble();
		inches = DimensionConverter.convertFeetToInches(feet);
		System.out.println(feet + " feet = " + inches + " inches.");
	}
}