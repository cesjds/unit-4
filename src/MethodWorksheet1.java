//Yoav Amit
//Period 1
//November 22, 2021

import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;


public class MethodWorksheet1
{
	public static void changeJOP()
	{
		// These colors are very ugly - you need to CHANGE them!

		// The font of the message text
		UIManager.put("Label.font", new FontUIResource (new Font("ITC American Typewriter", Font.BOLD, 58)));
		// The color of the message text
		UIManager.put("OptionPane.messageForeground",new Color(255, 255, 255));

		// color for text field (where you are inputting data)
		UIManager.put("TextField.background", Color.white);
		// font for message in text field
		UIManager.put("TextField.font", new FontUIResource(new Font("ITC American Typewriter", Font.BOLD, 24)));
		// color for message in text field
		UIManager.put("TextField.foreground", Color.black);

		// The color of the panel 
		UIManager.put("Panel.background",new Color(94, 96, 206));
		// The color around the outside of the panel
		UIManager.put("OptionPane.background",new Color(105, 48, 195));

		// Buttons at bottom
		UIManager.put("Button.background",new Color(229, 229, 229));
		UIManager.put("Button.foreground", new Color(72,61,139));
		UIManager.put("Button.font", new FontUIResource	(new Font("Tempus Sans ITC", Font.BOLD, 14)));
	}
	
	public static String getMyName()
	{
		String name = JOptionPane.showInputDialog("Enter your name: ");
		return name;
	}

	public static boolean isFinished()
	{
		String runAgain = JOptionPane.showInputDialog("Do you want to run the program again? (yes/no): ");
		if (runAgain.equals("yes"))
			return true;
		else 
			return false;
				
	}

	public static String getMyInitial()
	{
		String lastInitial = JOptionPane.showInputDialog("Enter your last initial: ");
		return lastInitial;
	}

	public static void main (String[]args)
	{
		changeJOP();
		String name = getMyName();
		System.out.println(name);
		boolean again = isFinished();
		System.out.println(again);
		String initial = getMyInitial();
		System.out.println(initial);
	}

}