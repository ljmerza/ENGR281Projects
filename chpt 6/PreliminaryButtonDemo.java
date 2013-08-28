import javax.swing.JApplet;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;

public class PreliminaryButtonDemo extends JApplet
{
	public void init()
	{
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.WHITE);

		contentPane.setLayout(new FlowLayout());

		JButton sunnyButton = new JButton("Sunny");
		contentPane.add(sunnyButton);

		JButton cloudyButton = new JButton("Couldy");
		contentPane.add(cloudyButton);
	}
}