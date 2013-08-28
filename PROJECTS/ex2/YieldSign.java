import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Color;
import java.awt.Font;

public class YieldSign extends Applet
{
	public static final int TRIANGLE_X_ONE = 250;
	public static final int TRIANGLE_X_TWO = 350;
	public static final int TRIANGLE_X_THREE = 150;
	public static final int TRIANGLE_Y_ONE = 250;
	public static final int TRIANGLE_Y_TWO = 50;

	public static final int TWO_TRIANGLE_X_ONE = 250;
	public static final int TWO_TRIANGLE_X_TWO = 330;
	public static final int TWO_TRIANGLE_X_THREE = 170;
	public static final int TWO_TRIANGLE_Y_ONE = 230;
	public static final int TWO_TRIANGLE_Y_TWO = 63;

	public static final int THREE_TRIANGLE_X_ONE = 250;
	public static final int THREE_TRIANGLE_X_TWO = 320;
	public static final int THREE_TRIANGLE_X_THREE = 180;
	public static final int THREE_TRIANGLE_Y_ONE = 220;
	public static final int THREE_TRIANGLE_Y_TWO = 69;

	public static final int STRING_X = 202;
	public static final int STRING_Y = 110;
	public static final int FONT = 34;

	public void paint (Graphics polygon)
  	{

		Font fontYield = new Font("monospaced", Font.BOLD, FONT);
		polygon.setFont(fontYield);

		Polygon triangle = new Polygon();
		polygon.setColor(Color.YELLOW);
		triangle.addPoint(TRIANGLE_X_ONE, TRIANGLE_Y_ONE);
		triangle.addPoint(TRIANGLE_X_TWO, TRIANGLE_Y_TWO);
		triangle.addPoint(TRIANGLE_X_THREE, TRIANGLE_Y_TWO);
		polygon.fillPolygon(triangle);

		Polygon triangleTwo = new Polygon();
		polygon.setColor(Color.BLACK);
		triangleTwo.addPoint(TWO_TRIANGLE_X_ONE, TWO_TRIANGLE_Y_ONE);
		triangleTwo.addPoint(TWO_TRIANGLE_X_TWO, TWO_TRIANGLE_Y_TWO);
		triangleTwo.addPoint(TWO_TRIANGLE_X_THREE, TWO_TRIANGLE_Y_TWO);
		polygon.fillPolygon(triangleTwo);

		Polygon triangleThree = new Polygon();
		polygon.setColor(Color.YELLOW);
		triangleThree.addPoint(THREE_TRIANGLE_X_ONE, THREE_TRIANGLE_Y_ONE);
		triangleThree.addPoint(THREE_TRIANGLE_X_TWO, THREE_TRIANGLE_Y_TWO);
		triangleThree.addPoint(THREE_TRIANGLE_X_THREE, THREE_TRIANGLE_Y_TWO);
		polygon.fillPolygon(triangleThree);

		polygon.setColor(Color.BLACK);
		polygon.drawString("YIELD", STRING_X, STRING_Y);

	} // Ending bracket of paint method
} // Ending bracket of YieldSign class