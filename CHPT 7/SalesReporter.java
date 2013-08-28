import java.util.Scanner;

public class SalesReporter
{
	private double highestSales;
	private double averageSales;
	private SalesAssociate[] team;

	private int numberOfAssociates;

	public void getData()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter number of sales associates:");
		numberOfAssociates = keyboard.nextInt();
		team = new SalesAssociate[numberOfAssociates + 1];

		for (int i = 1; i <= numberOfAssociates; i++)
		{
			team[i] = new SalesAssociate();
			System.out.println("Enter data for associate " + i);
			team[i].readInput();
			System.out.println();
		}
	}

	public void computeStats()
	{
		double nextSales = team[1].getSales();
		highestSales = nextSales;
		double sum = nextSales;
		for (int i = 2; i <= numberOfAssociates; i++)
		{
			nextSales = team[i].getSales();
			sum = sum + nextSales;
			if (nextSales > highestSales)
				highestSales = nextSales;
		}
		averageSales = sum / numberOfAssociates;
	}

	public void displayResults()
	{
		System.out.println("Average sales per associate is $" + averageSales);
		System.out.println("The highest sales figure is $" + highestSales);
		System.out.println();
		System.out.println("The following had the highest sales:");
		for (int  i = 1; i <= numberOfAssociates; i++)
		{
			double nextSales = team[i].getSales();
			if (nextSales == highestSales)
			{
				team[i].writeOutput();
				System.out.println("$" + (nextSales - averageSales) + " above the average.");
				System.out.println();
			}
		}

		System.out.println("The rest preformed as follows:");
		for (int  i = 1; i <= numberOfAssociates; i++)
		{
			double nextSales = team[i].getSales();
			if (team[i].getSales() != highestSales)
			{
				team[i].writeOutput();
				if (nextSales >= averageSales)
					System.out.println("$" + (nextSales - averageSales) + " above the average.");
				else
					System.out.println("$" + (averageSales - nextSales) + " below the average");
				System.out.println();
			}
		}
	}

	public static void main(String[] args)
	{
		SalesReporter clerk = new SalesReporter();
		clerk.getData();
		clerk.computeStats();
		clerk.displayResults();
	}
}