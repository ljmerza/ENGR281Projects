public class InterestRate
{
	public static void main(String[] args)
	{
		int[][] table = new int[10][6];
		for(int row = 0; row < 10; row++)
			for(int column = 0; column < 6; column++)
				table[row][column] = getBalance(1000.0, row+1, (5 + 0.5*column));

		System.out.println("Balances for various Interest Rates");
		System.out.println();
		System.out.println("Years 5.00%, 5.50%, 6.00%, 6.50%, 7.00%, 7.50%");

		for(int row = 0; row < 10; row++)
		{
			System.out.print((row+1)+ "      ");
			for(int column =0; column < 6; column++)
				System.out.print("$" + table [row] [column] + " ");
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