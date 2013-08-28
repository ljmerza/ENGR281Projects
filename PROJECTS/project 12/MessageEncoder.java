/**
*An interface for a method that
*encodes the given string
*/

public interface MessageEncoder
{
	/** Returns the given string encoded*/
	public abstract String encode(String plaintText);
} // Ending bracket of MessageEncoder interface