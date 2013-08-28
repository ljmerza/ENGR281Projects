import java.util.Scanner;

public class ExceptionDemo
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		try
		{
			System.out.println("Enter the number of doughnuts");
			int donutCount = keyboard.nextInt();

			System.out.println("Enter the number of glasses of milk");
			int milkCount = keyboard.nextInt();

			if(milkCount < 1)
			throw new Exception("go buy some milk");
			else
			{
				double donutPerGlass = donutCount / milkCount;
				System.out.println(donutCount + " donuts " + milkCount + " glasses of milk");
				System.out.println("you have " + donutPerGlass + " donuts per glass of milk");
			}
		}

		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}