/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		int firstNum= Integer.parseInt(args[0]); 
		int secondNum= Integer.parseInt(args[1]);
		int thirdNum= Integer.parseInt(args[2]);	
		boolean answer= ((firstNum + secondNum) > thirdNum) &&
						 ((secondNum + thirdNum) > firstNum) && 
						 ((firstNum + thirdNum) > secondNum);
		System.out.println(firstNum +  ", " + secondNum + ", " + thirdNum + ": " + answer );
	}
}
