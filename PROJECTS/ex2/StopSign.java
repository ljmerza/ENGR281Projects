import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Color;
import java.awt.Font;

public class StopSign extends Applet
{
	public static final int OCTAGON_X_ONE = 200;
	public static final int OCTAGON_X_TWO = 308;
	public static final int OCTAGON_X_THREE = 375;
	public static final int OCTAGON_X_SEVEN = 139;
	public static final int OCTAGON_Y_ONE = 52;
	public static final int OCTAGON_Y_TWO = 114;
	public static final int OCTAGON_Y_FOUR = 202;
	public static final int OCTAGON_Y_FIVE = 261;

	public static final int TWO_OCTAGON_X_ONE = 205;
	public static final int TWO_OCTAGON_X_TWO = 303;
	public static final int TWO_OCTAGON_X_THREE = 368;
	public static final int TWO_OCTAGON_X_SEVEN = 146;
	public static final int TWO_OCTAGON_Y_ONE = 59;
	public static final int TWO_OCTAGON_Y_TWO = 119;
	public static final int TWO_OCTAGON_Y_FOUR = 197;
	public static final int TWO_OCTAGON_Y_FIVE = 254;

	public static final int THREE_OCTAGON_X_ONE = 210;
	public static final int THREE_OCTAGON_X_TWO = 298;
	public static final int THREE_OCTAGON_X_THREE = 363;
	public static final int THREE_OCTAGON_X_SEVEN = 151;
	public static final int THREE_OCTAGON_Y_ONE = 64;
	public static final int THREE_OCTAGON_Y_TWO = 124;
	public static final int THREE_OCTAGON_Y_FOUR = 192;
	public static final int THREE_OCTAGON_Y_FIVE = 249;

	public static final int FONT = 80;
	public static final int STRING_X = 160;
	public static final int STRING_Y = 180;

	public void paint (Graphics polygon)
  	{

		Font fontStop = new Font("monospaced", Font.BOLD, FONT);
		polygon.setFont(fontStop);

		Polygon octagon = new Polygon();
		polygon.setColor(Color.RED);
		octagon.addPoint(OCTAGON_X_ONE , OCTAGON_Y_ONE );
		octagon.addPoint(OCTAGON_X_TWO , OCTAGON_Y_ONE );
		octagon.addPoint(OCTAGON_X_THREE , OCTAGON_Y_TWO );
		octagon.addPoint(OCTAGON_X_THREE , OCTAGON_Y_FOUR );
		octagon.addPoint(OCTAGON_X_TWO , OCTAGON_Y_FIVE );
		octagon.addPoint(OCTAGON_X_ONE , OCTAGON_Y_FIVE );
		octagon.addPoint(OCTAGON_X_SEVEN , OCTAGON_Y_FOUR );
		octagon.addPoint(OCTAGON_X_SEVEN , OCTAGON_Y_TWO );
		polygon.fillPolygon(octagon);

		Polygon octagonTwo = new Polygon();
		polygon.setColor(Color.WHITE);
		octagonTwo.addPoint(TWO_OCTAGON_X_ONE , TWO_OCTAGON_Y_ONE );
		octagonTwo.addPoint(TWO_OCTAGON_X_TWO , TWO_OCTAGON_Y_ONE );
		octagonTwo.addPoint(TWO_OCTAGON_X_THREE , TWO_OCTAGON_Y_TWO );
		octagonTwo.addPoint(TWO_OCTAGON_X_THREE , TWO_OCTAGON_Y_FOUR );
		octagonTwo.addPoint(TWO_OCTAGON_X_TWO , TWO_OCTAGON_Y_FIVE );
		octagonTwo.addPoint(TWO_OCTAGON_X_ONE , TWO_OCTAGON_Y_FIVE );
		octagonTwo.addPoint(TWO_OCTAGON_X_SEVEN , TWO_OCTAGON_Y_FOUR );
		octagonTwo.addPoint(TWO_OCTAGON_X_SEVEN , TWO_OCTAGON_Y_TWO );
		polygon.fillPolygon(octagonTwo);

		Polygon octagonThree = new Polygon();
		polygon.setColor(Color.RED);
		octagonThree.addPoint(THREE_OCTAGON_X_ONE , THREE_OCTAGON_Y_ONE );
		octagonThree.addPoint(THREE_OCTAGON_X_TWO , THREE_OCTAGON_Y_ONE );
		octagonThree.addPoint(THREE_OCTAGON_X_THREE , THREE_OCTAGON_Y_TWO );
		octagonThree.addPoint(THREE_OCTAGON_X_THREE , THREE_OCTAGON_Y_FOUR );
		octagonThree.addPoint(THREE_OCTAGON_X_TWO , THREE_OCTAGON_Y_FIVE );
		octagonThree.addPoint(THREE_OCTAGON_X_ONE , THREE_OCTAGON_Y_FIVE );
		octagonThree.addPoint(THREE_OCTAGON_X_SEVEN , THREE_OCTAGON_Y_FOUR );
		octagonThree.addPoint(THREE_OCTAGON_X_SEVEN , THREE_OCTAGON_Y_TWO );
		polygon.fillPolygon(octagonThree);

		polygon.setColor(Color.WHITE);
		polygon.drawString("STOP", STRING_X, STRING_Y);

	} // Ending bracket of paint method
} // Ending bracket of StopSign class