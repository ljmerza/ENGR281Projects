import java.util.Scanner;

public class Gotmilk
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the number of doughnuts");
		int donutCount = keyboard.nextInt();

		System.out.println("Enter the number of glasses of milk");
		int milkCount = keyboard.nextInt();

		if(milkCount < 1)
			System.out.println("no milk, go buy some milk!");
		else
		{
			double donutPerGlass = donutCount / milkCount;
			System.out.println(donutCount + " donuts " + milkCount + " glasses of milk");
			System.out.println("you have " + donutPerGlass + " donuts per glass of milk");
		}
	}
}