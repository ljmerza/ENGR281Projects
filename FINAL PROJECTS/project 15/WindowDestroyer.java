import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowDestroyer extends WindowAdapter
{
	public void windowClosing()
	{
		System.exit(0);
	} // Ending bracket of windowClosing method
} // Ending braclet of WindowDestroyer class