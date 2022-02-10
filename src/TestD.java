import javax.swing.JOptionPane;

public class TestD
{
	public static int enterNum()
	{
		int iNum = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer:"));
		return iNum;
	}
	public static String posOrNeg(int num)
	{
		if (num >= 0)
			return "Positive";
		else 
			return "Negative";
			
	}
	
	public static void printResults(int num, String answer)
	{
		String output = "";
		output +="Your number is: "+num+". \n";	
		output +="Your number is: "+answer+". \n";
		
		JOptionPane.showMessageDialog(null, output);
	}
	
	
    public static void main(String[] args)
    {
        int num = enterNum();
        String answer = posOrNeg(num);
        printResults(num, answer);
    }
}