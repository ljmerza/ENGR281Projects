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

public class MoodButton extends JFrame implements ActionListener
{

	private JButton happy = new JButton("Happy");
	private JButton mad = new JButton("Mad");
	private JButton sad = new JButton("Sad");
	private Container contentPane = getContentPane();
	private WindowDestroyer listener = new WindowDestroyer();

	public MoodButton()
	{
		this.setSize(500, 500);
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
	}

} // Ending bracket of MoodButton class