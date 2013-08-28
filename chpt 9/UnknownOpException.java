public class UnknownOpException extends Exception
{
	public UnknownOpException()
	{
		super("unknown operation");
	}

	public UnknownOpException(String message)
	{
		super(message);
	}

	public UnknownOpException(char op)
	{
		super(op + " is unknown operator");
	}
}