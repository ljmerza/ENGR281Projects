import java.awt.Color;
import java.util.Random;

public class RouletteWheel
{
	private int currentNumber = 0;
	private String currentColor;
	private Random randomizer = new Random();

	public int getCurrentNumber()
	{
		return this.currentNumber;
	}

	public String getCurrentColor()
	{
		return this.currentColor;
	}

	public void spin()
	{
		this.currentNumber = this.randomizer.nextInt(37);

		if(this.currentNumber == 0)
		{
			this.currentColor = "GREEN";
		}
		else if(this.currentNumber % 2 == 0)
		{
			this.currentColor = "RED";
		}
		else
		{
			this.currentColor = "BLACK";
		}
	}
}