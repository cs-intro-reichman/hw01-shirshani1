/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		int coins= Integer.parseInt(args[0]);
		int quarter= 25;
		int cent= 1;
		int how_many_quarters = coins/ quarter; 
		int rest = (coins % quarter); // the rest of the division by quarters will be the amount of cencts we need
		int how_many_cents = rest;
		System.out.println("Use " + how_many_quarters + " quarters and " + (rest + " cents"));


	}
}