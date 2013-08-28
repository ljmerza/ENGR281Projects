import java.util.Scanner;
import java.text.DecimalFormat;

public class FlowerShop
{
	public static final String[] FLOWERS = {"petunia", "rose", "violet", "daisy"};
	public static final double[] COST = {1.50, 5.75, 2.25, 0.75};
	public static DecimalFormat df = new DecimalFormat("$#,##0.00");

	public static void main(String[] args)
	{

		System.out.print("Which flower would you like to buy?");
		Scanner keyboard = new Scanner(System.in);
		String flower = keyboard.nextLine();
		System.out.print("How many " + flower + "s do you want to buy?");
		int number = keyboard.nextInt();
		double cost = 0.00;

		for(int i = 0; i < FLOWERS.length; i++)
		{
			if(FLOWERS[i].equalsIgnoreCase(flower))
			{
				cost = number * COST[i];
				break;
			}
		}


		System.out.println("Your total cost will be " + df.format(cost));



	}
}