import java.util.Scanner;

public class SavingsAccount
{
	private double balance;
	public static double interestRate = 0;
	public static int numberOfAccounts = 0;

	public SavingsAccount()
	{
		balance = 0;
		numberOfAccounts++;
	}

	public static void setInterestRate(double newRate)
	{
		interestRate = newRate;
	}

	public static double getInterestRate()
	{
		return interestRate;
	}

	public static double getNumberOfAccounts()
	{
		return numberOfAccounts;
	}

	public void deposit(double amount)
	{
		balance = balance + amount;
	}

	public double withdraw(double amount)
	{
		if(balance >= amount)
		{
			balance = balance - amount;
		}
		else
		{
			amount = 0;
		}
		return amount;
	}

	public void addInterest()
	{
		double interest = balance * interestRate;
		balance = balance + interest;
	}

	public double getBalance()
	{
		return balance;
	}

	public static void showBalance(SavingsAccount account)
	{
		System.out.println(account.getBalance());
	}
}