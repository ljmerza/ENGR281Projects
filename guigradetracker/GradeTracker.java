import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class GradeTracker extends JFrame
{
	private 	ActionListenerClass aLC = new ActionListenerClass();
	private WindowDestroyer listener = new WindowDestroyer();
	private Container contentPane = getContentPane();

	private JButton addNewClass = new JButton("Add New Class");
	private JButton openClass = new JButton("Open Class");
	private JButton addClass = new JButton("Add Class");
	private JButton addNewGradingScale = new JButton("Add New Grading Scale");
	private JButton addGradingScale = new JButton("Add Grading Scale");
	private JButton addNewGrade = new JButton("Add New Grade");
	private JButton addGrade = new JButton("Add Grade");
	private JButton completeReset = new JButton("Complete Reset");
	private JButton exitProgram = new JButton("Exit Program");

	private Scanner readMainFile = null;
	private Scanner readClassFile = null;
	private PrintWriter writeToMainFile = null;
	private PrintWriter writeToClassFile = null;

	private JTextArea showGrades = new JTextArea(10, 40);

	public GradeTracker()
	{
		setSize(500, 500);
		addWindowListener(listener);
		exitProgram.addActionListener(aLC);
		contentPane.setLayout(new FlowLayout());

		contentPane. add(addNewClass);
		contentPane. add(addNewGrade);
		contentPane. add(addNewGradingScale);
		contentPane.add(exitProgram);
		contentPane.add(showGrades);
		exitProgram.setLayout

	}// GradeTracker method
} // GradeTracker class