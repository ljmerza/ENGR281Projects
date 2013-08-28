import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class GoSign extends Applet
{
	public static final int ONE_OVAL_X = 150;
	public static final int TWO_OVAL_X = 155;
	public static final int THREE_OVAL_X = 163;
	public static final int FOUR_OVAL_X = 168;

	public static final int ONE_OVAL_Y = 50;
	public static final int TWO_OVAL_Y = 55;
	public static final int THREE_OVAL_Y = 63;
	public static final int FOUR_OVAL_Y = 68;

	public static final int ONE_OVAL_SIZE = 220;
	public static final int TWO_OVAL_SIZE = 211;
	public static final int THREE_OVAL_SIZE = 195;
	public static final int FOUR_OVAL_SIZE = 150;

	public static final int FONT = 150;
	public static final int STRING_X = 170;
	public static final int STRING_Y = 200;

	public void paint (Graphics polygon)
	{
		polygon.fillOval(ONE_OVAL_X, ONE_OVAL_Y,
									ONE_OVAL_SIZE, ONE_OVAL_SIZE);

		polygon.setColor(Color.WHITE);
		polygon.fillOval(TWO_OVAL_X, TWO_OVAL_Y,
									TWO_OVAL_SIZE, TWO_OVAL_SIZE);

		polygon.setColor(Color.BLACK);
		polygon.fillOval(THREE_OVAL_X, THREE_OVAL_Y,
									THREE_OVAL_SIZE, THREE_OVAL_SIZE);

		polygon.setColor(Color.GREEN);
		polygon.fillOval(FOUR_OVAL_X, FOUR_OVAL_Y,
									FOUR_OVAL_SIZE, FOUR_OVAL_SIZE);

		Font fontGo = new Font("monospaced", Font.BOLD, FONT);
		polygon.setFont(fontGo);
		polygon.setColor(Color.WHITE);
		polygon.drawString("GO", STRING_X, STRING_Y);

	} // Ending bracket of paint method
} // Ending bracket of GoSign class
