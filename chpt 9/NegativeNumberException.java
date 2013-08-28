public class NegativeNumberException extends Exception
{
	public NegativeNumberException()
	{
		super("neg number exception!");
	}

	public NegativeNumberException(String message)
	{
		super(message);
	}
}