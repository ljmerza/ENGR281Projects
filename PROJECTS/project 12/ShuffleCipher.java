public class ShuffleCipher implements MessageDecoder, MessageEncoder
{
	public static final int ZERO = 0;
	public static final int ONE = 1;
	public static final int TWO = 2;

	private String encodedText, decodedText, encodingOneHalf, encodingTwoHalf;
	private String oneHalfArray[], twoHalfArray[];
	private int shiftAmount, textLength, halfTextLength;
	private int alternateChars = ZERO, loopIntEncode = ZERO, loopIntDecode = ZERO;

	/**
	*Precondition: A primitive data type of int
	*Postcondition: Sets the value of ShiftAmount to the recieved int
	*/
	public void ShuffleCipher(int n)
	{
		this.shift(n);
	} // Ending bracket of ShuffleCipher constructor

	/**
	*Precondition: A string that will be decoded
	*Postcondition: Returns the string after being decoded
	*/
	public String decode(String cipherText)
	{
		this.decoding(cipherText);
		return this.decodedText;
	} // Ending bracket of decode method

	/**
	*Precondition: A string that will be encoded
	*Postcondition: Returns the string after being encoded
	*/
	public String encode(String plainText)
	{
		this.encoding(plainText);
		return this.encodedText;
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
	} // Ending bracket of getDecoed method

	/**
	*Precondition: A string that will be decoded
	*Postcondition: The given string encoded
	*/
	private void  encoding(String plainText)
	{
		textLength = plainText.length();
		halfTextLength = textLength / TWO;

		do
		{
			StringBuffer sb = new StringBuffer(textLength);

			if(textLength % TWO != ZERO)
			{
				encodingOneHalf = plainText.substring(ZERO, (halfTextLength + ONE));
				encodingTwoHalf = plainText.substring(halfTextLength + ONE, textLength);
			} // Ending bracket of if statement
			else
			{
				encodingOneHalf = plainText.substring(ZERO, (halfTextLength));
				encodingTwoHalf = plainText.substring(halfTextLength, textLength);
			} // Ending bracket of else statement

			char currentLetterOneHalf[]  = encodingOneHalf.toCharArray();
			char currentLetterTwoHalf[]  = encodingTwoHalf.toCharArray();

			for(int i = ZERO; i < halfTextLength; i++)
			{
				sb.append(currentLetterOneHalf[i]);
				sb.append(currentLetterTwoHalf[i]);
			} // Ending bracket of for loop
			if(encodingOneHalf.length() != encodingTwoHalf.length())
			{
				sb.append(currentLetterOneHalf[currentLetterOneHalf.length - ONE]);
			} // Ending bracket of if statement

			encodedText = sb.toString();
			plainText = encodedText;
			loopIntEncode++;

		} // Ending bracket of do while statement
		while(loopIntEncode < shiftAmount);
	} // Ending bracket of encoding method

	/**
	*Precondition: A string that will be decoded
	*Postcondition: The given string decoded
	*/
	private void  decoding(String cipherText)
	{
		textLength = cipherText.length();

		do
		{
			StringBuffer sb = new StringBuffer(textLength);
			char currentLetter[]  = cipherText.toCharArray();

			for(int i = ZERO; i < textLength; i++)
			{
				if(i % TWO ==0)
				sb.append(currentLetter[i]);
			} // Ending bracket of for loop

			for(int i = ZERO; i < textLength; i++)
			{
				if(i % TWO != ZERO)
				sb.append(currentLetter[i]);
			} // Ending bracket of for loop

			decodedText = sb.toString();
			cipherText = decodedText;
			loopIntDecode++;
		}while(loopIntDecode < shiftAmount);
	} // Ending bracket of decoding statement

	/**
	*Precondition: A primitive data type of int
	*Postcondition: sets shiftAmount to given int
	*/
	private void shift(int shift)
	{
		this.shiftAmount = shift;
	} // Ending bracket of shift method
} // Ending bracket of ShuffleCipher class