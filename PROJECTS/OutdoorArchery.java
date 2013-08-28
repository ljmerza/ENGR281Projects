import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;

public class OutdoorArchery extends JApplet
{

	public static final int DELTA_FILL_SIZE = 72;
	public static final int DELTA_X_Y_OF_FILL = 36;
	public static final int X_Y_FILL_OVAL = 50;
	public static final int X_Y_DRAW_OVAL = 14;

	public static final int DELTA_RING_SIZE = 36;
	public static final int DELTA_X_Y_OF_RING = 18;

	public static final int XY_OF_WHITE_RING = 68;
	public static final int WHITE_RING_SIZE = 272;

	public static final int X_VALUE_OF_STRINGS = 450;
	public static final int DELTA_Y_VALUE_STRING = 36;

	public static final int LINE_X_2_VALUE = 443;
	public static final int LINE_X1_FIRST_FIVE_LINES = 203;
	public static final int LINE_Y1_FIRST_FIVE_LINES = 205;
	public static final int LINE_Y1_NEXT_LINES = 223;

	public static final int LINE_DELTA_Y_1 = 27;
	public static final int LINE_DELTA_Y_2 = 36;
	public static final int LINE_DELTA_XY = 18;
	public static final int LINE_DELTA_XY_2 = 12;

	public static final int ONE = 1;
	public static final int TWO = 2;
	public static final int THREE = 3;
	public static final int FOUR = 4;
	public static final int FIVE = 5;
	public static final int SIX= 6;
	public static final int SEVEN = 7;
	public static final int EIGHT = 8;
	public static final int NINE = 9;
	public static final int TEN = 10;
	public static final int ELEVEN = 11;
	public static final int TWELVE = 12;



	public void paint(Graphics Archery)
	{
		//part 1
		int loopDrawOval = ONE;
		int loopDrawString = ONE;
		int loopFillOval = ONE;
		int loopFirstFiveLines = ONE;
		int loopNextThreeLines = ONE;

		int fillOvalRingSize = 308;
		int xyOfFillOval = 50;
		int drawOvalRingSize = 380;
		int xyOfDrawOval = 14;

		int yStartString = 50;

		int LineX1Value = LINE_X1_FIRST_FIVE_LINES;
		int LineY1Value = LINE_Y1_FIRST_FIVE_LINES;
		int LineY2Value = 42;


		//part 2
		do
		{
			if (loopFillOval <= ONE)
			{
			}
			else if (loopFillOval == TWO)
			{
				Archery.setColor(Color.BLUE);
			}
			else if (loopFillOval == THREE)
			{
				Archery.setColor(Color.RED);
			}
			else
			{
				Archery.setColor(Color.YELLOW);
			}

			Archery.fillOval(xyOfFillOval, xyOfFillOval, fillOvalRingSize, fillOvalRingSize);
			fillOvalRingSize = fillOvalRingSize - DELTA_FILL_SIZE;
			xyOfFillOval = xyOfFillOval + DELTA_X_Y_OF_FILL;
			++loopFillOval;
		}
		while (loopFillOval != FIVE);


		//part 3
		Archery.setColor(Color.BLACK);
		do
		{
			Archery.drawOval(xyOfDrawOval, xyOfDrawOval, drawOvalRingSize, drawOvalRingSize);
			drawOvalRingSize = drawOvalRingSize - DELTA_RING_SIZE;
			xyOfDrawOval = xyOfDrawOval + DELTA_X_Y_OF_RING;
			++loopDrawOval;
		}
		while (loopDrawOval != TWELVE);


		//part 4
		Archery.setColor(Color.WHITE);
		Archery.drawOval(XY_OF_WHITE_RING, XY_OF_WHITE_RING, WHITE_RING_SIZE, WHITE_RING_SIZE);


		//part 5
		Archery.setColor(Color.BLACK);
		do
		{
			if (loopDrawString == ONE)
			{
				Archery.drawString ("X Ring 10 Points", X_VALUE_OF_STRINGS, yStartString);
			}
			else if (loopDrawString == TWO)
			{
				Archery.drawString ("10 Points", X_VALUE_OF_STRINGS, yStartString);
			}
			else if (loopDrawString == THREE)
			{
				Archery.drawString ("9 Points", X_VALUE_OF_STRINGS, yStartString);
			}
			else if (loopDrawString == FOUR)
			{
				Archery.drawString ("8 Points", X_VALUE_OF_STRINGS, yStartString);
			}
			else if (loopDrawString == FIVE)
			{
				Archery.drawString ("7 Points", X_VALUE_OF_STRINGS, yStartString);
			}
			else if (loopDrawString == SIX)
			{
				Archery.drawString ("6 Points", X_VALUE_OF_STRINGS, yStartString);
			}
			else if (loopDrawString == SEVEN)
			{
				Archery.drawString ("5 Points", X_VALUE_OF_STRINGS, yStartString);
			}
			else if (loopDrawString == EIGHT)
			{
				Archery.drawString ("4 Points", X_VALUE_OF_STRINGS, yStartString);
			}
			else if (loopDrawString == NINE)
			{
				Archery.drawString ("3 Points", X_VALUE_OF_STRINGS, yStartString);
			}
			else if (loopDrawString == TEN)
			{
				Archery.drawString ("2 Points", X_VALUE_OF_STRINGS, yStartString);
			}
			else if (loopDrawString == ELEVEN)
			{
				Archery.drawString ("1 Point", X_VALUE_OF_STRINGS, yStartString);
			}
			else
			{
				break;
			}
			yStartString = yStartString + DELTA_Y_VALUE_STRING;
			++loopDrawString;
		}
		while (loopDrawString != TWELVE);


		//part 7
		do
		{
			Archery.drawLine(LineX1Value, LineY1Value, LINE_X_2_VALUE, LineY2Value);
			LineX1Value = LineX1Value + LINE_DELTA_XY;
			LineY2Value = LineY2Value + LINE_DELTA_Y_2;
			++loopFirstFiveLines;
		}
		while (loopFirstFiveLines != SIX);


	 	//part 8
		LineY1Value = LINE_Y1_NEXT_LINES;
		do
		{
			Archery.drawLine(LineX1Value, LineY1Value, LINE_X_2_VALUE, LineY2Value);
			LineX1Value = LineX1Value + LINE_DELTA_XY_2;
			LineY1Value = LineY1Value + LINE_DELTA_XY;
			LineY2Value = LineY2Value + LINE_DELTA_Y_2;
			++loopNextThreeLines;
		}
		while (loopNextThreeLines != FOUR);


		//part 9
		loopNextThreeLines = ONE;
		do
		{
			Archery.drawLine(LineX1Value, LineY1Value, LINE_X_2_VALUE, LineY2Value);
			LineY1Value = LineY1Value + LINE_DELTA_Y_1;
			LineY2Value = LineY2Value + LINE_DELTA_Y_2;
			++loopNextThreeLines;
		}
		while (loopNextThreeLines != FOUR);

	}
}