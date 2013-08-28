public class InterestRate2
{
	public static final int ROWS = 10;
	public static final int COLUMNS = 6;

	public static void main(String[] args)
	{
		int[][] table = new int[ROWS][COLUMNS];
				for(int row = 0; row < ROWS; row++)
					for(int column = 0; column < COLUMNS; column++)
						table[row][column] = getBalance(1000.0, row+1, (5 + 0.5*column));

		System.out.println("Balances for various Interest Rates");
		System.out.println();
		System.out.println("Years 5.00%, 5.50%, 6.00%, 6.50%, 7.00%, 7.50%");

		showTable(table);
	}

	public static void showTable(int[][] anArray)
	{
		for(int row = 0; row < ROWS; row++)
		{
			System.out.print((row +1) + "     ");
			for(int column = 0; column < COLUMNS; column++)
				System.out.print("$" + anArray[row][column] + " ");
				System.out.println();
		}
	}

	public static int getBalance(double startBalance, int years, double rate)
	{
		double runningBalance = startBalance;
		for(int count = 1; count <= years; count++)
			runningBalance = runningBalance* (1 + rate / 100);
		return (int)(Math.round(runningBalance));
	}
}