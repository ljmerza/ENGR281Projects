import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Oracle extends JApplet implements ActionListener
{

	public static int LINES = 5;
	public static int CHAR_PER_LINE = 40;

	private JTextArea theText;
	private String question;
	private String answer;
	private String advice;

	public void init()
	{
		Container contentPane = getContentPane();
	contentPane.setLayout(new FlowLayout());

	JLabel instructions = new JLabel("i will answer any question but may need some advice from you:");
	contentPane.add(instructions);

	JButton getAnswerButton = new JButton("get answer");
	getAnswerButton.addActionListener(this);
	contentPane.add(getAnswerButton);

	JButton sendAdviceButton = new JButton("send advice");
	sendAdviceButton.addActionListener(this);
	contentPane.add(sendAdviceButton);

	JButton resetButton = new JButton("reset");
	resetButton.addActionListener(this);
	contentPane.add(resetButton);

	theText = new JTextArea(LINES, CHAR_PER_LINE);
	theText.setText("questions and advice go here");
	contentPane.add(theText);

	answer = " the answer is: look around";
	}

	public void actionPerformed(ActionEvent e)
	{
		String actionCommand = e.getActionCommand();
		if(actionCommand.equals("get answer"))
		{
			question = theText.getText();
			theText.setText("the is a difficult question");
		}
		else if(actionCommand.equals("send advice"))
		{
			advice = theText.getText();
			theText.setText(" that advice helped\n you asked the question " + question + "\n" + answer + " \nclick the rest button");
			answer = "the answer is " + advice;
		}
		else if(actionCommand.equals("reset"))
		{
			theText.setText("questions and advice go here");
		}
		else
		{
			theText.setText("error");
		}
	}
}