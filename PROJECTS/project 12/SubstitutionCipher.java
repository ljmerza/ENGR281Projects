public class SubstitutionCipher implements MessageDecoder, MessageEncoder
{
	private String decodedText, encodedText;
	private int textLength, shiftAmount, charInt;

	/**
	*Precondition: A primitive data type of int
	*Postcondition: Sets the value of ShiftAmount to the recieved int
	*/
	public void SubstitutionCipher(int shift)
	{
			this.shift(shift);
	} // Ending bracket of SubstitutionCipher constructor

	/**
	*Precondition: A string that will be decoded
	*Postcondition: Returns the string after being decoded
	*/
	public String decode(String cipherText)
	{
		this.decoding(cipherText);
		return decodedText;
	} // Ending bracket of decode method

	/**
	*Precondition: A string that will be encoded
	*Postcondition: Returns the string after being encoded
	*/
	public String encode(String plainText)
	{
		this.encoding(plainText);
		return encodedText;
	} // Ending bracket of encode method

	/**
	*Precondition: None
	*Postcondition: Returns the value of encodedText
	*/
	public String getEncoded()
	{
		return this.encodedText;
	} // Ending bracket of getEncoded method

	/**
	*Precondition: None
	*Postcondition: Returns the vlue of decodedText
	*/
	public String getDecoded()
	{
		return this.decodedText;
	} // Ending bracket of getDecoded method

	/**
	*Precondition: A string that will be decoded
	*Postcondition: The given string decoded
	*/
	private void decoding(String cipherText)
	{
		textLength = cipherText.length();
		char currentLetter[] = new char[textLength];
		StringBuffer sb = new StringBuffer(textLength);

		for(int i = 0; i < textLength; i++)
		{
			currentLetter[i] = cipherText.charAt(i);
			charInt = (int)currentLetter[i];
			charInt = charInt - shiftAmount;
			currentLetter[i] = (char)charInt;
			sb.append(currentLetter[i]);
		} // Ending bracket of for loop
		decodedText = sb.toString();
	} // Ending bracket of decoding method

	/**
	*Precondition: A string that will be decoded
	*Postcondition: The given string encoded
	*/
	private void encoding(String plainText)
	{
		this.textLength = plainText.length();
		char currentLetter[] = new char[textLength];
		StringBuffer sb = new StringBuffer(textLength);

		for(int i = 0; i < textLength; i++)
		{
			currentLetter[i] = plainText.charAt(i);
			charInt = (int)currentLetter[i];
			charInt = charInt + shiftAmount;
			currentLetter[i] = (char)charInt;
			sb.append(currentLetter[i]);
		} // Ending bracket of for loop
			encodedText = sb.toString();
	} // Ending bracket of encoding method

	/**
	*Precondition: A primitive data type of int
	*Postcondition: sets shiftAmount to given int
	*/
	private void shift(int shift)
	{
		this.shiftAmount = shift;
	} // Ending bracket of shift method
} // Ending bracket of SubstitutionCipher class