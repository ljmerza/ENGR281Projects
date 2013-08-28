public class UnknownColorException extends Exception
{
	public UnknownColorException()
	{
		super("Unknown color!");
	}

	public UnknownColorException(String message)
	{
		super(message);
	}
}