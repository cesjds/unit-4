import java.awt.Color;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

//Yoav Amit
//Period 1
//December 8, 2021

/********************************************************************
ASSIGNMENT: Write a program that lets the user play Rock, Paper,
Scissors, Lizard, Spock with the computer.

Use my main method - DON'T MAKE ANY CHANGES TO IT!

The methods should do the following:

changeJOP() should change the JOP window to your colors.
playersChoice() should use showOptionDialog with buttons that let the
	user choose rock, paper, scissors, lizard or spock. Then use a
	switch statement to return their choice.
computersChoice() should have the computer randomly pick rock, paper,
	scissors, lizard or spock and use a switch statement to return
	the choice.
determineWinner() should determine the winner. You should NOT have 
	an if statement for every possibility. You only need one set of
	if, else/if, else statements. You should watch the video
	and look at the diagrams to see how to determine the winner.
print() should have ONE JOP that what the computer picked, what
 	you picked and who won or if the game was a tie.

HINTS:
Comment out the code that calls the methods you haven't written yet.
This way you can run your program and test your methods as you
write them.
Look at the answer key to see what your windows should look like.

 *********************************************************************/

public class RPSLS
{
	public static void changeJOP()
	{
		// copy and paste the code with your new colors and fonts here:
		// These colors are very ugly - you need to CHANGE them!

		// The font of the message text
		UIManager.put("Label.font", new FontUIResource (new Font("Tempus Sans ITC", Font.BOLD, 58)));
		// The color of the message text
		UIManager.put("OptionPane.messageForeground",new Color(0,0,0));

		// color for text field (where you are inputting data)
		UIManager.put("TextField.background", Color.white);
		// font for message in text field
		UIManager.put("TextField.font", new FontUIResource(new Font("Dialog", Font.BOLD, 24)));
		// color for message in text field
		UIManager.put("TextField.foreground", Color.black);

		// The color of the panel 
		UIManager.put("Panel.background",new Color(102, 204, 255));
		// The color around the outside of the panel
		UIManager.put("OptionPane.background",new Color(0, 51, 102));

		// Buttons at bottom
		UIManager.put("Button.background",new Color(132,112,255));
		UIManager.put("Button.foreground", new Color(72,61,139));
		UIManager.put("Button.font", new FontUIResource	(new Font("Tempus Sans ITC", Font.BOLD, 14)));

	}


	//Method Computer
	public static String computersChoice()
	{
		int choice = (int) (Math.random() * 5);

		switch(choice)
		{
		case 0: return "Rock"; 
		case 1: return "Paper"; 
		case 2: return "Scissors"; 
		case 3: return "Lizard"; 
		case 4: return "Spock"; 
		
		default: return ""; 
		}
	}

	public static String playersChoice()
	{
		String[] colors = {"Rock", "Paper", "Scissors", "Lizard", "Spock"};

		int choice2=JOptionPane.showOptionDialog
				(null, "Pick your move! ", "RPSLS",
						0, 3, null, colors, null);

		switch(choice2)
		{
		case 0: return "Rock"; 
		case 1: return "Paper"; 
		case 2: return "Scissors"; 
		case 3: return "Lizard"; 
		case 4: return "Spock"; 
		default: return ""; 
		}




	}

	public static String determineWinner(String winner, String player, String computer)
	{
		if(player.equals(computer))
			winner = "Tie";

		else if (( player.equals("Rock") && (computer.equals("Scissors") || computer.equals("Lizard")))  || 
				( player.equals("Lizard") && (computer.equals("Spock")  || computer.equals("Paper")))   ||  
				( player.equals("Spock") && (computer.equals("Scissors")|| computer.equals("Rock")))    ||
				( player.equals("Scissors") && (computer.equals("Lizard") || computer.equals("Paper"))) ||
				( player.equals("Paper") && (computer.equals("Rock") || computer.equals("Spock"))))
			winner = "You";
		
		else 
			winner = "Computer";
		
		return winner;
	}
	
	public static void print(String winner, String player, String computer)
	{
		changeJOP();
		String answer="";
		answer +=  "You Picked: "+player+"\n";
		answer +=  "Computer Picked: "+computer+"\n";
		answer +=  "The winner is: "+winner+"! \n";
		JOptionPane.showMessageDialog(null, answer);
	}
	
	public static void main(String[] args)
	{
		changeJOP();
		String computer;
		String winner = "";
		String player = playersChoice();
		computer = computersChoice();
		winner = determineWinner(winner, player, computer);
		print(winner, player, computer);
	}
	
}

