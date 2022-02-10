//Yoav Amit
//Period 1
//November 22, 2021

public class MethodWorksheet2
{
	
	//Biggest Method: Returns the bigger number
	public static void biggest(double a, double b)
	{
		if (a > b)
			System.out.println(a);
		else
			System.out.println(b);
	}
	
	//Average Method
	public static void average(int c, int d)
	{
		System.out.println((c+d)/2.0);
	}
	
	//addASCII Method
	public static void addASCII(String e)
	{
		int num1 = (e.charAt(0));
		int num2 = (e.charAt(1));
		int num3 = (e.charAt(2));
		int num4 = (e.charAt(3));
		int num5 = (e.charAt(4));
		System.out.println(num1+num2+num3+num4+num5);
	}
	
	//pigLatin Method
	public static void pigLatin(String f)
	{
		System.out.println( (f.substring(1))  +  (f.charAt(0)) +  "ay" );
	}
	
	//Main 
	public static void main (String[]args)
	{
		//Biggest Parameters
		double a = 6;
		double b = 9;
		biggest(a,b);
		
		//Average Parameters
		int c = 4;
		int d = 5;
		average(c,d);
		
		//addASCII Parameters
		String e = "Hello";
		addASCII(e);
		
		//pigLatin Parameters
		String f = "hello";
		pigLatin(f);
		
	}
}