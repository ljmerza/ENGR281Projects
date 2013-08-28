public class Temperature
{
	public static final double SET_TEMP = 0.0;

	double degrees;
	enum scale{C, F}
	scale tempScale;

	public Temperature()
	{
	/**
	*Precondition: None.
	*Postcondition: sets degrees and tempScale to defulat 0.0C
	*/
		this.setConstructor(SET_TEMP, tempScale.C);
	} // Ending bracket of Temperature Constructor

	public Temperature(double newDegrees)
	{
	/**
	*Precondition: degrees in double data type.
	*Postcondition: Sets degrees to given double and temp
	*scale to Celsius
	*/
		this.setConstructor(newDegrees, tempScale.C);
	} // Ending bracket of Temperature Constructor

	public Temperature(scale newTempScale)
	{
	/**
	*Precondition: TempScale.
	*Postcondition: sets degrees to default 0.0 and
	*tempScale to given doublr
	*/
		this.setConstructor(SET_TEMP, newTempScale);
	} // Ending bracket of Temperature Constructor

	public Temperature(double newDegrees, scale newTempScale)
	{
	/**
	*Precondition: degrees and tempScale
	*Postcondition: sets degrees and tempScale to given double
	*and enum values.
	*/
		this.setConstructor(newDegrees, newTempScale);
	} // Ending bracket of Temperature Constructor

	private void setConstructor(double newDegrees, scale newTempScale)
	{
	/**
	*Precondition: degrees and tempScale
	*Postcondition: sets degrees and tempScale to given double
	*and enum values.
	*/
		this.degrees = newDegrees;
		this.tempScale = newTempScale;
	} // Ending bracket of set method

	public double getFahrenheit(double newCelsius)
	{
	/**
	*Precondition: degrees celsius  in double data type.
	*Postcondition: changes celsius into fahrenheit.
	*/
		degrees = ((double)((int)(((9/5) * (newCelsius + 32.0))*100))/100);
		return degrees;
	} // Ending bracket of getDegrees method

	public double getCelsius(double newFahrenheit)
	{
	/**
	*Precondition: degrees fahrenheit  in double data type.
	*Postcondition: changes fahrenheit to celsius.
	*/
		degrees = ((double)((int)(((5/9) * (newFahrenheit - 32.0))*100))/100);
		return degrees;
	} // Ending bracket of getCelsius method

	public scale getScale()
	{
	/**
	*Precondition: None.
	*Postcondition: Returns the value of the tempScale.
	*/
		return this.tempScale;
	} // Ending bracket of getScale method

	public double getDegrees()
	{
	/**
	*Precondition: None.
	*Postcondition: Returns the value of degrees.
	*/
		return this.degrees;
	} // Ending bracket of getDegree

	public void setDegrees(double newDegrees)
	{
	/**
	*Precondition: double data type of degrees.
	*Postcondition: Sets the degrees.
	*/
		this.degrees = newDegrees;
	} // Ending bracket of set method

	public void setScale(scale newTempScale)
	{
	/**
	*Precondition: Enum value of tempScale.
	*Postcondition: Sets the tempScale value.
	*/
		this.tempScale = newTempScale;
	} // Ending bracket of set method

	public void setTemperature(double newDegrees, scale newTempScale)
	{
	/**
	*Precondition: double data type of degrees and tempScale values
	*Postcondition: Sets the degrees and measurement of degrees.
	*/
		this.degrees = newDegrees;
		this.tempScale = newTempScale;
	} // Ending bracket of set method

	public boolean equals(double tempOne)
	{
	/**
	*Precondition: a degree of type double.
	*Postcondition: Returns boolean of tempOne and degrees
	*of if they are equal.
	*/
		return (this.degrees == tempOne);
	} // Ending bracket of equals

	public boolean greaterThan(double tempOne)
	{
	/**
	*Precondition: a degree of type double.
	*Postcondition: Returns boolean of tempOne and degrees
	*of if degrees is greater than tempOne
	*/
		return (this.degrees > tempOne);
	} // Ending bracket of greaterThan

	public boolean lessThan(double tempOne)
	{
	/**
	*Precondition: a degree of type double.
	*Postcondition: Returns boolean of tempOne and degrees
	*of if degrees is less than tempOne
	*/
		return (this.degrees < tempOne);
	} // Ending bracket of lessThan
} // Ending bracket of Temperature Class