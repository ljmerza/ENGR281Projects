import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.BasicStroke;

/**
*Author: Leonardo Merza
*Date: September 16, 2010
*Description: This program draws the Olympic flag.
*/

public class OlympicFlag extends JApplet
{

	public static final int RING_THICKNESS = 18;

	//Ring size and Y-value positions
	public static final int RING_SIZE = 160;
	public static final int LOWER_RING_Y_VALUE = 180;
	public static final int UPPER_RING_Y_VALUE = 100;

	//Ring X-value positions
	public static final int BLUE_RING_X_VALUE = 21;
	public static final int YELLOW_RING_X_VALUE = 111;
	public static final int BLACK_RING_X_VALUE = 210;
	public static final int GREEN_RING_X_VALUE = 302;
	public static final int RED_RING_X_VALUE = 398;

	//Ring Arc start angles
	public static final int LOWER_RING_LEFT_1 = 117;
	public static final int LOWER_RING_RIGHT_1 = 23;
	public static final int UPPER_RING_LEFT_1 = 205;
	public static final int UPPER_RING_RIGHT_1 = 298;

	//Ring Arc angles
	public static final int LOWER_RING_LEFT_2 = 228;
	public static final int LOWER_RING_RIGHT_2 = 58;
	public static final int UPPER_RING_LEFT_2 = 320;
	public static final int UPPER_RING_RIGHT_2 = 227;

	//FillArc size and angle
	public static final int ARC_ANGLE = 60;
	public static final int ARC_SIZE = 38;

	//FillArc Y-value  positions
	public static final int LOWER_ARC_Y_LEFT = 174;
	public static final int LOWER_ARC_Y_RIGHT = 170;
	public static final int LOWER_ARC_Y_RIGHT_2 = 222;
	public static final int UPPER_ARC_Y_LEFT = 232;
	public static final int UPPER_ARC_Y_LEFT_2 = 182;
	public static final int UPPER_ARC_Y_RIGHT = 227;

	//FillArc X-value positions
	public static final int BLUE_LEFT = 77;
	public static final int BLUE_RIGHT = 106;
	public static final int YELLOW_LEFT = 148;
	public static final int YELLOW_RIGHT = 174;
	public static final int YELLOW_RIGHT_2 = 241;
	public static final int GREEN_LEFT = 338;
	public static final int GREEN_RIGHT = 362;
	public static final int GREEN_RIGHT_2 = 432;
	public static final int BLACK_LEFT = 203;
	public static final int BLACK_RIGHT = 296;
	public static final int RED_LEFT = 391;

	//FillArc starting angles
	public static final int UPPER_ARC_START_LEFT = 210;
	public static final int UPPER_ARC_START_LEFT_2 = 165;
	public static final int UPPER_ARC_START_RIGHT = 270;
	public static final int LOWER_ARC_START_LEFT = 90;
	public static final int LOWER_ARC_START_RIGHT = 30;
	public static final int LOWER_ARC_START_RIGHT_2 = -7;

	public void paint(Graphics ring)
	{

		Graphics2D ring2D = (Graphics2D)ring;
		ring2D.setStroke(new BasicStroke(RING_THICKNESS));

		//Blue ring
		ring.setColor(new Color(51,153,204));
		ring.drawArc(BLUE_RING_X_VALUE, UPPER_RING_Y_VALUE,
					RING_SIZE, RING_SIZE,
					UPPER_RING_RIGHT_1, UPPER_RING_LEFT_2);

		//Blue ring Arcs from left to right
		ring.fillArc(BLUE_LEFT, UPPER_ARC_Y_LEFT,
					ARC_SIZE, ARC_SIZE,
					UPPER_ARC_START_LEFT, ARC_ANGLE);
		ring.fillArc(BLUE_RIGHT, UPPER_ARC_Y_RIGHT,
					ARC_SIZE, ARC_SIZE,
					UPPER_ARC_START_RIGHT, ARC_ANGLE);

		//Black ring
		ring.setColor(Color.BLACK);
		ring.drawArc(BLACK_RING_X_VALUE, UPPER_RING_Y_VALUE,
					RING_SIZE, RING_SIZE,
					UPPER_RING_RIGHT_1, UPPER_RING_RIGHT_2);
		ring.drawArc(BLACK_RING_X_VALUE, UPPER_RING_Y_VALUE,
					RING_SIZE, RING_SIZE,
					UPPER_RING_LEFT_1, LOWER_RING_RIGHT_2);

		//Black ring Arcs from left to right
		ring.fillArc(BLACK_LEFT, UPPER_ARC_Y_LEFT_2,
					ARC_SIZE, ARC_SIZE,
					UPPER_ARC_START_LEFT_2, ARC_ANGLE);
		ring.fillArc(BLACK_RIGHT, UPPER_ARC_Y_RIGHT,
					ARC_SIZE, ARC_SIZE,
					UPPER_ARC_START_RIGHT, ARC_ANGLE);

		//Red ring
		ring.setColor(new Color(225,0,0));
		ring.drawArc(RED_RING_X_VALUE, UPPER_RING_Y_VALUE,
					RING_SIZE, RING_SIZE,
					UPPER_RING_LEFT_1, UPPER_RING_LEFT_2);

		//Red ring Arcs from left to right
		ring.fillArc(RED_LEFT, UPPER_ARC_Y_LEFT_2,
					ARC_SIZE, ARC_SIZE,
					UPPER_ARC_START_LEFT_2, ARC_ANGLE);

		//Yellow ring
		ring.setColor(new Color(250,215,0));
		ring.drawArc(YELLOW_RING_X_VALUE,LOWER_RING_Y_VALUE,
					RING_SIZE, RING_SIZE,
					LOWER_RING_LEFT_1, LOWER_RING_LEFT_2);
		ring.drawArc(YELLOW_RING_X_VALUE,LOWER_RING_Y_VALUE,
					RING_SIZE, RING_SIZE,
					LOWER_RING_RIGHT_1, LOWER_RING_RIGHT_2);

		//Yellow ring Arcs from left to right
		ring.fillArc(YELLOW_LEFT, LOWER_ARC_Y_LEFT,
					ARC_SIZE, ARC_SIZE,
					LOWER_ARC_START_LEFT, ARC_ANGLE);
		ring.fillArc(YELLOW_RIGHT, LOWER_ARC_Y_RIGHT,
					ARC_SIZE, ARC_SIZE,
					LOWER_ARC_START_RIGHT, ARC_ANGLE);
		ring.fillArc(YELLOW_RIGHT_2, LOWER_ARC_Y_RIGHT_2,
					ARC_SIZE, ARC_SIZE,
					LOWER_ARC_START_RIGHT_2, ARC_ANGLE);

		//Green ring
		ring.setColor(new Color(35,172,60));
		ring.drawArc(GREEN_RING_X_VALUE,LOWER_RING_Y_VALUE,
					RING_SIZE, RING_SIZE,
					LOWER_RING_LEFT_1, LOWER_RING_LEFT_2);
		ring.drawArc(GREEN_RING_X_VALUE,LOWER_RING_Y_VALUE,
					RING_SIZE, RING_SIZE,
					LOWER_RING_RIGHT_1, LOWER_RING_RIGHT_2);

		//Green ring Arcs from left to right
		ring.fillArc(GREEN_LEFT, LOWER_ARC_Y_LEFT,
					ARC_SIZE, ARC_SIZE,
					LOWER_ARC_START_LEFT, ARC_ANGLE);
		ring.fillArc(GREEN_RIGHT, LOWER_ARC_Y_RIGHT,
					ARC_SIZE, ARC_SIZE,
					LOWER_ARC_START_RIGHT, ARC_ANGLE);
		ring.fillArc(GREEN_RIGHT_2, LOWER_ARC_Y_RIGHT_2,
					ARC_SIZE, ARC_SIZE,
					LOWER_ARC_START_RIGHT_2, ARC_ANGLE);

	}//Ending bracket of paint
}//Ending bracket of OlympicFlag