import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Color;

public class ProjectNine extends Applet
{
	/**
	*Author: Leonardo Merza
	*Date: October 24, 2010
	*Description: This program draws regular
	*polygons inside of regular polygons from
	*triangle to decagon.
	*/

	public static final int TRIANGLE_SIZE = 100;
	public static final int STARTING_POSITION = 200;
	public static final int TRIANGLE_HEIGHT = 86;
	public static final int HALF_TRIANGLE_BASE = 50;
	public static final int TRIANGLE_X_ONE = 205;
	public static final int TRIANGLE_X_TWO = 254;
	public static final int TRIANGLE_Y_TWO = 114;
	public static final int TRIANGLE_X_FOUR = 306;

	public static final int CIRCLE_X_ONE = 195;
	public static final int CIRCLE_Y_ONE = 114;
	public static final int CIRCLE_SIZE = 120;

	public static final int PENTAGON_SIDE = 102;
	public static final int PENTAGON_BASE_X = 315;
	public static final int PENTAGON_BASE_Y = 234;
	public static final int PENTAGON_Y_ONE = 241;
	public static final int PENTAGON_X_THREE = 348;
	public static final int PENTAGON_Y_THREE = 135;

	public static final int HEXAGON_X_ONE = 201;
	public static final int HEXAGON_X_TWO = 310;
	public static final int HEXAGON_X_THREE = 368;
	public static final int HEXAGON_Y_THREE = 163;
	public static final int HEXAGON_Y_ONE = 72;
	public static final int HEXAGON_Y_FOUR = 252;
	public static final int HEXAGON_X_SIX = 144;

	public static final int SEPTAGON_X_ONE = 258;
	public static final int SEPTAGON_Y_ONE = 52;
	public static final int SEPTAGON_Y_TWO = 82;
	public static final int SEPTAGON_X_THREE = 373;
	public static final int SEPTAGON_Y_THREE = 176;
	public static final int SEPTAGON_X_FOUR = 308;
	public static final int SEPTAGON_X_SIX = 140;
	public static final int SEPTAGON_X_SEVEN = 165;

	public static final int OCTAGON_X_THREE = 375;
	public static final int OCTAGON_Y_ONE = 109;
	public static final int OCTAGON_Y_FOUR = 202;
	public static final int OCTAGON_X_FIVE = 306;
	public static final int OCTAGON_X_SIX = 202;
	public static final int OCTAGON_X_SEVEN = 139;
	public static final int OCTAGON_Y_FIVE = 261;

	public static final int NONAGON_X_TWO = 345;
	public static final int NONAGON_X_THREE = 390;
	public static final int NONAGON_X_FOUR = 375;
	public static final int NONAGON_X_FIVE = 302;
	public static final int NONAGON_X_SIX = 208;
	public static final int NONAGON_X_SEVEN = 125;
	public static final int NONAGON_X_EIGHT = 170;
	public static final int NONAGON_Y_ONE = 37;
	public static final int NONAGON_Y_TWO = 60;
	public static final int NONAGON_Y_THREE = 130;
	public static final int NONAGON_Y_FOUR= 215;
	public static final int NONAGON_Y_FIVE = 265;

	public static final int DECAGON_X_ONE = 214;
	public static final int DECAGON_X_TWO = 300;
	public static final int DECAGON_X_FOUR = 400;
	public static final int DECAGON_X_SEVEN = 142;
	public static final int DECAGON_X_EIGHT = 118;
	public static final int DECAGON_Y_ONE = 36;
	public static final int DECAGON_Y_THREE = 74;
	public static final int DECAGON_Y_FOUR = 150;
	public static final int DECAGON_Y_FIVE = 225;
	public static final int DECAGON_Y_SIX = 271;

	public static final int COLOR_ONE = 238;
	public static final int COLOR_TWO = 130;
	public static final int COLOR_THREE = 0;
	public static final int COLOR_FOUR = 75;

	public void paint (Graphics polygon)
  	{
		Polygon decagon = new Polygon();

		polygon.drawPolygon(decagon);
		decagon.addPoint(DECAGON_X_ONE , DECAGON_Y_ONE );
		decagon.addPoint(DECAGON_X_TWO , DECAGON_Y_ONE );
		decagon.addPoint(SEPTAGON_X_THREE , DECAGON_Y_THREE );
		decagon.addPoint(DECAGON_X_FOUR , DECAGON_Y_FOUR );
		decagon.addPoint(SEPTAGON_X_THREE , DECAGON_Y_FIVE );
		decagon.addPoint(DECAGON_X_TWO , DECAGON_Y_SIX );
		decagon.addPoint(DECAGON_X_ONE , DECAGON_Y_SIX );
		decagon.addPoint(DECAGON_X_SEVEN , DECAGON_Y_FIVE );
		decagon.addPoint(DECAGON_X_EIGHT , DECAGON_Y_FOUR );
		decagon.addPoint(DECAGON_X_SEVEN, DECAGON_Y_THREE );
		polygon.fillPolygon(decagon);

		Polygon nonagon = new Polygon();
		polygon.setColor(new Color(COLOR_ONE , COLOR_TWO , COLOR_ONE ));
		nonagon.addPoint(SEPTAGON_X_ONE , NONAGON_Y_ONE);
		nonagon.addPoint(NONAGON_X_TWO , NONAGON_Y_TWO);
		nonagon.addPoint(NONAGON_X_THREE , NONAGON_Y_THREE);
		nonagon.addPoint(NONAGON_X_FOUR , NONAGON_Y_FOUR);
		nonagon.addPoint(NONAGON_X_FIVE , NONAGON_Y_FIVE);
		nonagon.addPoint(NONAGON_X_SIX , NONAGON_Y_FIVE);
		nonagon.addPoint(SEPTAGON_X_SIX , NONAGON_Y_FOUR);
		nonagon.addPoint(NONAGON_X_SEVEN , NONAGON_Y_THREE );
		nonagon.addPoint(NONAGON_X_EIGHT , NONAGON_Y_TWO );
		polygon.fillPolygon(nonagon);

		Polygon octagon = new Polygon();
		polygon.setColor(new Color(COLOR_FOUR , COLOR_THREE , COLOR_TWO ));
		octagon.addPoint(STARTING_POSITION , SEPTAGON_Y_ONE );
		octagon.addPoint(SEPTAGON_X_FOUR , SEPTAGON_Y_ONE );
		octagon.addPoint(OCTAGON_X_THREE , OCTAGON_Y_ONE );
		octagon.addPoint(OCTAGON_X_THREE , OCTAGON_Y_FOUR );
		octagon.addPoint(OCTAGON_X_FIVE , OCTAGON_Y_FIVE );
		octagon.addPoint(OCTAGON_Y_FOUR , OCTAGON_Y_FIVE );
		octagon.addPoint(OCTAGON_X_SEVEN , OCTAGON_Y_FOUR );
		octagon.addPoint(OCTAGON_X_SEVEN , OCTAGON_Y_ONE );
		polygon.fillPolygon(octagon);

		Polygon septagon = new Polygon();
		polygon.setColor(Color.BLUE);
		septagon.addPoint(SEPTAGON_X_ONE , SEPTAGON_Y_ONE );
		septagon.addPoint(PENTAGON_X_THREE , SEPTAGON_Y_TWO );
		septagon.addPoint(SEPTAGON_X_THREE , SEPTAGON_Y_THREE );
		septagon.addPoint(SEPTAGON_X_FOUR , SEPTAGON_X_ONE );
		septagon.addPoint(STARTING_POSITION , SEPTAGON_X_ONE );
		septagon.addPoint(SEPTAGON_X_SIX , SEPTAGON_Y_THREE );
		septagon.addPoint(SEPTAGON_X_SEVEN , SEPTAGON_Y_TWO );
		polygon.fillPolygon(septagon);

		Polygon hexagon = new Polygon();
		polygon.setColor(Color.GREEN);
		hexagon.addPoint(HEXAGON_X_ONE, HEXAGON_Y_ONE);
		hexagon.addPoint(HEXAGON_X_TWO, HEXAGON_Y_ONE);
		hexagon.addPoint(HEXAGON_X_THREE, HEXAGON_Y_THREE);
		hexagon.addPoint(HEXAGON_X_TWO, HEXAGON_Y_FOUR);
		hexagon.addPoint(HEXAGON_X_ONE, HEXAGON_Y_FOUR);
		hexagon.addPoint(HEXAGON_X_SIX, HEXAGON_Y_THREE);
		polygon.fillPolygon(hexagon);

		Polygon pentagon = new Polygon();
		polygon.setColor(Color.YELLOW);
		pentagon.addPoint(CIRCLE_X_ONE , PENTAGON_Y_ONE );
		pentagon.addPoint(PENTAGON_BASE_X , PENTAGON_Y_ONE );
		pentagon.addPoint(PENTAGON_X_THREE , PENTAGON_Y_THREE );
		pentagon.addPoint(TRIANGLE_X_TWO, HEXAGON_Y_ONE );
		pentagon.addPoint(HEXAGON_Y_THREE, PENTAGON_Y_THREE );
		polygon.fillPolygon(pentagon);

		polygon.setColor(Color.ORANGE);
		polygon.fillRect(CIRCLE_X_ONE, TRIANGLE_Y_TWO, CIRCLE_SIZE, CIRCLE_SIZE);

		polygon.setColor(Color.PINK);
		polygon.fillOval(CIRCLE_X_ONE, TRIANGLE_Y_TWO, CIRCLE_SIZE, CIRCLE_SIZE);

		Polygon triangle = new Polygon();
		polygon.setColor(Color.RED);
		triangle.addPoint(TRIANGLE_X_ONE, TRIANGLE_X_ONE);
		triangle.addPoint(TRIANGLE_X_TWO, TRIANGLE_Y_TWO);
		triangle.addPoint(TRIANGLE_X_FOUR, TRIANGLE_X_ONE);
		polygon.fillPolygon(triangle);











  	}
}
