//*******************************
//You should have a red squiggly line under the call to addNums in main.

//What is the error message?

//The method addNums(double, int) in the type debugging is not applicable for the arguments (int, double)

//What does it mean? 

//You can't insert an integer to a double and vice versa

//How can you fix it? 

//Flip int and double in addNums



//2)      Once you’ve fixed the call to addNums you still have an error in the method under n1 + n2 in the addNums method. What is the error message?

//Type mismatch: cannot convert from double to int

///What does it mean? 

//The program cannot return a double because the method is an int type

//How can you fix it? 

//Change the method type to double

//3)Now that you’ve fixed the second error you have a new error under n3 in main.

//What is the error message?

//Type mismatch: cannot convert from double to int

//What does it mean? 

//You cant put an int to a double method

//How can you fix it? 

//change n3 to a double

//*********************************8


public class debugging {

	public static double addNums(int n1, double n2) {

		return n1 + n2;

	}

	public static void main(String[] args) {

		int n1=3;

		double n2=6.2;

		double n3 = addNums(n1, n2);

		System.out.println(n3);

	}

}