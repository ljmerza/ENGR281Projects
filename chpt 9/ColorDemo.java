import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ColorDemo extends JFrame implements ActionListener
{
	public static final int WIDTH = 400;
	public static final int HEIGHT = 300;
	public static final int NUMBER_OF_CHAR = 20;

	private JTextField colorName;

	public ColorDemo()
	{
		setSize(WIDTH, HEIGHT);
		WindowDestroyer listener = new WindowDestroyer();
		addWindowListener(listener);

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.GRAY);
		contentPane.setLayout(new FlowLayout());

		colorName = new JTextField(NUMBER_OF_CHAR);
		contentPane.add(colorName);

		JButton showButton = new JButton("Show Color");
		showButton.addActionListener(this);
		contentPane.add(showButton);
	}

	public void actionPerformed(ActionEvent e)
	{
		Container contentPane = getContentPane();
		try
		{
			contentPane.setBackground(getColor(colorName.getText()));
		}
		catch(UnknownColorException exception)
		{
			colorName.setText("Unknown Color");
			contentPane.setBackground(Color.GRAY);
		}
	}

	public Color getColor(String name) throws UnknownColorException
	{
		if (name.equalsIgnoreCase("RED"))
			return Color.RED;
		if (name.equalsIgnoreCase("WHITE"))
			return Color.WHITE;
		if (name.equalsIgnoreCase("BLUE"))
			return Color.BLUE;
		if (name.equalsIgnoreCase("GREEN"))
			return Color.GREEN;
		else
			throw new UnknownColorException();
	}
}