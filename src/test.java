import javax.swing.JOptionPane;
/*********************************************************************************
 * Write the methods that make the following program run correctly.
 * You may NOT change the main method.
 * The enterRadius method should ask the user for the radius of their circle and return it.
 * The formula for the area of a circle is pi * radius squared.
 * You can use Math.PI or 3.14 for pi.
 * The calculatePerimeter method should calculate the perimeter of the circle and return it.
 * The formula for the perimeter of a circle is 2 * pi * radius.
 * The printResults method should print the results in ONE JOP window.
 * If the user inputs 5 for the radius printResults should print:
 * 
 *   The radius of your circle is 5.
 *   The area of your circle is 78.53981633974483.
 *   The perimeter of your circle is 31.41592653589793.
 *
 ***********************************************************************************************/

public class test
{
	public static int enterRadius()
	{
		int iNum = Integer.parseInt(JOptionPane.showInputDialog("Enter your circle's radius: "));
		return iNum;
	}
	
	public static double calculateArea(int radius)
	{
		double circleArea = (radius * radius * Math.PI);
		return circleArea;
	}
	
	public static double calculatePerimeter(int radius)
	{
		double circlePerimeter = (2 * Math.PI * radius);
		return circlePerimeter;
	}
	
	public static void printResults(int radius, double area, double perimeter)
	{
		String answer = "";
		answer += "The radius of your circle is: "+radius+". \n";
		answer += "The area of your circle is: "+area+". \n";
		answer += "The perimeter of your circle is: "+perimeter+". \n";

		JOptionPane.showMessageDialog(null, answer);
	}
	
    public static void main(String[] args)
    {
        int radius = enterRadius();
        double area = calculateArea(radius);
        double perimeter = calculatePerimeter(radius);
        printResults(radius, area, perimeter);
        
    }
}