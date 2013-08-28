import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MoodButton2 extends JFrame implements ActionListener
{
	public static final int ZERO = 0;
	public static final int THREE_HUNDRED = 300;
	public static final int FIVE = 5;
	public static final int SIX = 6;

	private String actionCommand;
	private int numberOfButtonPushes = ZERO;
	private boolean isHappy = false;
	private boolean isSad = false;
	private boolean isMad = false;
	private boolean isButtonClicked = false;

	private JButton happy = new JButton("Happy");
	private JButton mad = new JButton("Mad");
	private JButton sad = new JButton("Sad");
	private ImageIcon happyIcon = new ImageIcon("happy.png");
	private ImageIcon madIcon = new ImageIcon("mad.png");
	private ImageIcon sadIcon = new ImageIcon("sad.png");
	private JLabel smiley = new JLabel();

	private Container contentPane = getContentPane();
	private WindowDestroyer listener = new WindowDestroyer();

	public MoodButton2()
	{
		this.setSize(THREE_HUNDRED, THREE_HUNDRED);
		this.setTitle("Project 13");
		this.addWindowListener(listener);
		contentPane.setLayout(new FlowLayout());

		happy.addActionListener(this);
		contentPane.add(happy);
		mad.addActionListener(this);
		contentPane.add(mad);
		sad.addActionListener(this);
		contentPane.add(sad);
	} // Ending bracket of MoodButton method

	public void actionPerformed(ActionEvent e)
	{
		isButtonClicked = true;
		numberOfButtonPushes++;
		 if(numberOfButtonPushes <  SIX)
		{
			if(numberOfButtonPushes == FIVE)
			{
				JOptionPane.showMessageDialog(null, "Only one more click");
			} // Ending bracket of if statement

			actionCommand = e.getActionCommand();
			if(actionCommand.equals("Happy"))
			{
				happy.setVisible(false);
				mad.setVisible(true);
				sad.setVisible(true);
				contentPane.setBackground(Color.YELLOW);
				smiley.setIcon(happyIcon);

				contentPane.add(smiley);

			} // Ending bracket of if statement
			else if(actionCommand.equals("Mad"))
			{
				mad.setVisible(false);
				happy.setVisible(true);
				sad.setVisible(true);
				contentPane.setBackground(Color.RED);
				smiley.setIcon(madIcon);
				contentPane.add(smiley);

			} // Ending bracket of if else statement
			else
			{
				sad.setVisible(false);
				happy.setVisible(true);
				mad.setVisible(true);
				contentPane.setBackground(Color.GRAY);
				smiley.setIcon(sadIcon);
				contentPane.add(smiley);

			} // Ending bracket of if else statement
		} // Ending bracket of if numberOfButtonPushes statement
		else
		{
			listener.windowClosing();
		} // Ending bracket of else System.exit
		contentPane.repaint();
	} // Ending bracket of actionPerformed method
} // Ending bracket of MoodButton class