//Yoav Amit
//Period 1
//December 3, 2021

import javax.swing.JOptionPane;

public class MethodWorksheet3
{
	//Biggest Methods
	public static double biggest()
	{
		int a = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer:"));
		if (a > b)
			return a;
		else
			return b;
	}
	
	//Average Method
	public static void average(int c, int d)
	{
		System.out.println((c+d)/2.0);
	}
	
	//addASCII Method
	public static int addASCII()
	{
		
		String e = JOptionPane.showInputDialog("Give me a 5 letter string: ");
		
		int num1 = (e.charAt(0));
		int num2 = (e.charAt(1));
		int num3 = (e.charAt(2));
		int num4 = (e.charAt(3));
		int num5 = (e.charAt(4));
		int num6 = (num1+num2+num3+num4+num5);
		return num6;
	}
	
	//pigLatin Method
	public static void pigLatin()
	{
		String f = JOptionPane.showInputDialog("Lemme give you some Pig Latin: ");
		System.out.println( (f.substring(1))  +  (f.charAt(0)) +  "ay" );
		
	}
	
	
	//Main Method
	public static void main(String[]args)
	{
		//Biggest Parameters
		System.out.println(biggest());
		
		//Average Parameters
		int c = 5;
		int d = 4;
		average(c,d);
		
		//addASCII Paramaters
		System.out.println(addASCII());
		
		//pigLating Paramaters
		pigLatin();
		
		
		
	}
	
}

	