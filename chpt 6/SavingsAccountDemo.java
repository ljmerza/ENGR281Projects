public class SavingsAccountDemo
{
	public static void main(String[] args)
	{
		SavingsAccount.setInterestRate(0.01);
		SavingsAccount mySavings = new SavingsAccount();
		SavingsAccount yourSavings = new SavingsAccount();

		System.out.println("I deposited $10.75");
		mySavings.deposit(10.75);
		System.out.println("You deposited $75.00");
		yourSavings.deposit(75.00);
		System.out.println("you deposited 55.00");
		yourSavings.deposit(55.00);

		double cash = yourSavings.withdraw(15.75);
		System.out.println("You withdrew $" + cash + ".");
		if(yourSavings.getBalance() > 100.00)
		{
			System.out.println("you recieved interest.");
			yourSavings.addInterest();
		}
		System.out.println("You savings is $" + yourSavings.getBalance());
		System.out.print("my savings is $");
		SavingsAccount.showBalance(mySavings);
		System.out.println();
		int count = SavingsAccount.getNumberOfAccounts();
		System.out.println("We opened " + count + " savings accounts today");
	}
}
