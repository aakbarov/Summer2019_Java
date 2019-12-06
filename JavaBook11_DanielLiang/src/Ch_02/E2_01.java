package Ch_02;

import java.util.Scanner;

public class E2_01 {
	/*
	 * (Convert mile to kilometer) Write a program that reads a mile in a double
	 * value from the console, converts it to kilometers, and displays the result.
	 * The formula for the conversion is as follows: 1 mile = 1.6 kilometers
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter mies: ");
		double mile = input.nextDouble();
		double mileToKilometer = mile*1.6;
		System.out.println(mile+" miles is "+mileToKilometer+" kilometer");
		
	}

}
