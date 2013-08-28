import java.util.Scanner;

public class PrelimCalculator
{
	private double result;
	private double precision = 0.0001;

	public static void main(String[] args) throws DivideByZeroException, UnknownOpException
	{
		PrelimCalculator clerk = new PrelimCalculator();

		System.out.println("calc is on");
		System.out.println("enter calc ex - + 3 and end with e");
		clerk.doCalculation();

		System.out.println("the final result is " + clerk.getResult());
	}

	public PrelimCalculator()
	{
		result = 0;
	}

	public void reset()
	{
		result = 0;
	}

	public void setResult(double newResult)
	{
		result = newResult;
	}

	public double getResult()
	{
		return result;
	}

	public double evaluate(char op, double n1, double n2) throws DivideByZeroException, UnknownOpException
	{
		double answer;
		switch(op)
		{
			case '+':
				answer = n1 + n2;
				break;
			case '-':
				answer = n1 - n2;
				break;
			case '*':
				answer = n1 * n2;
				break;
			case '/':
				if((-precision < n2) && (n2 < precision))
					throw new DivideByZeroException();
				answer = n1 / n2;
				break;
			default:
				throw new UnknownOpException(op);
		}
		return answer;
	}

	public void doCalculation() throws DivideByZeroException, UnknownOpException
	{
		Scanner keyboard = new Scanner(System.in);
		boolean done = false;
		result = 0;
		System.out.println("Result = " + result);

		while(!done)
		{
			char nextOp = (keyboard.next()).charAt(0);
			if(( nextOp == 'e') || (nextOp == 'E'))
				done = true;
			else
			{
				double nextNumber = keyboard.nextDouble();
				result = evaluate(nextOp, result, nextNumber);
				System.out.println("result " + nextOp + " " + nextNumber + " = " + result);
				System.out.println("updated result  = " + result);
			}
		}
	}
}