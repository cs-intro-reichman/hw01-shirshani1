/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
	public static void main(String[] args) {
		double firstNum= Double.parseDouble(args[0]); 
		double secondNum= Double.parseDouble(args[1]);
		double thirdNum= Double.parseDouble(args[2]);
		double answer= (thirdNum - secondNum) / firstNum; //because of the formula 'ax + b = c'
		System.out.println(firstNum + " * " +"x + " + secondNum + " = " + thirdNum );
		System.out.println( "x = " + answer);


	}
}