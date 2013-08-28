import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ColorSampler extends JFrame implements ActionListener
{
	public static final int TWENTY = 20;
	public static final int FIVE_HUNDRED = 500;

	private Container contentPane = getContentPane();
	private WindowDestroyer listener = new WindowDestroyer();
	private JButton setColorButton = new JButton("Show Me the Color");
	private JTextField enterField = new JTextField(TWENTY);

	public ColorSampler()
	{
		this.setTitle("Project 15");
		this.setSize(FIVE_HUNDRED,FIVE_HUNDRED);
		this.addWindowListener(listener);
		contentPane.setLayout(new FlowLayout());
		contentPane.setBackground(Color.WHITE);

		enterField.addActionListener(this);
		contentPane.add(enterField);
		enterField.setText("Enter a color for the background");
		setColorButton.addActionListener(this);
		contentPane.add(setColorButton);
	} // Ending bracket of ColorSampler constructor

	public void actionPerformed(ActionEvent e)
	{
		try
		{
			contentPane.setBackground(getColor(enterField.getText()));
		} // Ending bracket of try block
		catch(UnknownColorException unknownColor)
		{
			enterField.setText("Unknown Color!");
			contentPane.setBackground(Color.GRAY);
		} // Ending bracket of catch block
	} // Ending bracket of actionPerformed method

	private Color getColor(String enteredColor) throws UnknownColorException
	{
		if(enteredColor.equalsIgnoreCase("RED"))
		{
			return Color.RED;
		} // Ending bracket of if statement
		else if(enteredColor.equalsIgnoreCase("ORANGE"))
		{
			return Color.ORANGE;
		} // Ending bracket of if else statement
		else if(enteredColor.equalsIgnoreCase("YELLOW"))
		{
			return Color.YELLOW;
		} // Ending bracket of if else statement
		else if(enteredColor.equalsIgnoreCase("GREEN"))
		{
			return Color.GREEN;
		} // Ending bracket of if else statement
		else if(enteredColor.equalsIgnoreCase("BLUE"))
		{
			return Color.BLUE;
		} // Ending bracket of if else statement
		else if(enteredColor.equalsIgnoreCase("BLACK"))
		{
			return Color.BLACK;
		} // Ending bracket of if else statement
		else if(enteredColor.equalsIgnoreCase("WHITE"))
		{
			return Color.WHITE;
		} // Ending bracket of if else statement
		else
		{
			throw new UnknownColorException();
		} // Ending bracket of else statement
	} // Ending bracket of getColor method
} // Ending bracket of ColorSampler class