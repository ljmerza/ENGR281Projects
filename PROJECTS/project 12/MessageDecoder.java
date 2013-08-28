/**
*An interface for a method that
*decodes the given string
*/

public interface MessageDecoder
{
	/** Returns the given string decoded*/
	public abstract String decode(String cipherText);
} // Ending bracket of MessageDecoder interface