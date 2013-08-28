import java.util.Scanner;

public class ArguementDemo
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		System.out.println("Enter your score on exam one:");
		int firstScore = key.nextInt();
		int[] nextScore = new int[3];

		for (int i = 0; i < nextScore.length; i++)
		{
			nextScore[i] = firstScore + 5 * i;
		}
		for (int i = 0; i < nextScore.length; i++)
		{
			double possibleAverage = getAverage(firstScore, nextScore[i]);

			System.out.println("If your score on exam 2 is " + nextScore[i]);
			System.out.println("your average will be " + possibleAverage);
		}
	}
	public static double getAverage(int n1, int n2)
	{
		return (n1 + n2) / 2.0;
	}
}