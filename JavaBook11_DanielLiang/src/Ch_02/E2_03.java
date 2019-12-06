package Ch_02;

import java.util.Scanner;

public class E2_03 {
	/*
	 * (Convert meters into feet) Write a program that reads a number in meters,
	 * converts it to feet, and displays the result. One meter is 3.2786 feet.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value for meter: ");
		double meter = input.nextDouble();
		double meterToFeet = meter * 3.2786;
		System.out.println(meter + " meters is " + meterToFeet + " feet");
	}

}
