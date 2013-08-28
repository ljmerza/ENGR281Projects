import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ActionListenerClass implements ActionListener
{
		private String actionCommand;

		public void actionPerformed(ActionEvent e)
		{
			actionCommand = e.getActionCommand();

			if(actionCommand.equals("Exit Program"))
			{
				System.exit(0);
			} // if statement
			else
			{
			} // else statement
	} // actionPerformed method
} // ActionListenerClass class