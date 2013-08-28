public class TemperatureDriver
{
	/**
	*Author: Leonardo Merza
	*Date: October 30, 2010
	*Description: This program tests all the methods of
	*the Temperature class.
	*/

	public static final double ZERO = 0.0;
	public static final double THIRTY_TWO = 32.0;
	public static final double NEG_FORTY = -40.0;
	public static final double HUNDRED = 100.0;
	public static final double TWO_TWELVE = 212.0;

	public static void main(String[] args)
	{
		Temperature tempOne = new Temperature();
		System.out.println("The temperature default for this program is: " +
										tempOne.getDegrees()  + tempOne.getScale());

		Temperature tempTwo = new Temperature(THIRTY_TWO, Temperature.scale.F);
		System.out.println("Temperature two is " + tempTwo.getDegrees() +
										tempTwo.getScale());

		if(tempOne.equals(tempTwo.getCelsius(tempTwo.getDegrees())))
		{
			System.out.println("Temperature one and temperature two are equal.");
		} // Ending bracket of if statement
		else
		{
			System.out.println("Temperature one and temperature two are not equal.");
		} // Ending bracket of else statement
		System.out.println();

		Temperature tempThree = new Temperature(NEG_FORTY);
		Temperature tempFour = new Temperature(Temperature.scale.F);
		tempFour.setDegrees(tempThree.getDegrees());
		System.out.println("Temperature three is " + tempThree.getDegrees() + " " + tempThree.getScale());
		System.out.println("Temperature four is " + tempFour.getDegrees() + " " + tempFour.getScale());

		if(tempFour.greaterThan(tempThree.getFahrenheit(tempThree.getDegrees())))
		{
			System.out.println("Temperature four is greater than temperature three.");
		} // Ending bracket of if statement
		else
		{
			System.out.println("Temperature four is not greater than temperature three.");
		} // Ending bracket of else statement
		System.out.println();

		tempOne.setTemperature(HUNDRED, Temperature.scale.C);
		tempTwo.setDegrees(TWO_TWELVE);
		System.out.println("The new temperature for temperature one is " +
										tempOne.getDegrees() + tempOne.getScale());
		System.out.println("The new temperature for temperature two is " +
										tempTwo.getDegrees() + tempTwo.getScale());
		if(tempOne.lessThan(tempTwo.getCelsius(tempTwo.getDegrees())))
		{
			System.out.println("Temperature one is less than temperature two.");
		} // Ending bracket of if statement
		else
		{
			System.out.println("Temperature one is not less than temperature two.");
		} // Ending bracket of else statement
		System.out.println();

		tempOne.setScale(Temperature.scale.F);
		System.out.println("The new temperature for temperature one is " +
										tempOne.getDegrees() + tempOne.getScale());

	} // Ending bracket of main method
} // Ending bracket of TemperatureDriver class