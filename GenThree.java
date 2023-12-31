/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int minNum= Integer.parseInt(args[1]); 
		int maxNum= Integer.parseInt(args[0]);
		int firtNum= ((int)(Math.random() * (maxNum - minNum + 1) + minNum));
		int secondNum= ((int)(Math.random() * (maxNum - minNum + 1) + minNum));
		int thirdNum= ((int)(Math.random() * (maxNum - minNum + 1) + minNum));
		System.out.println(firtNum);
		System.out.println(secondNum);
		System.out.println(thirdNum);
		int chekingMin= Math.min(firtNum, secondNum); //taking the smallest number between the first two numbers.
		int finalMin = Math.min(chekingMin, thirdNum); /*because chekingNum is the smallest between the first two 
														the smallest between it and the third is the smallest from all three.*/
		System.out.println("The minimal generated number was " + finalMin);

	}
}
