package Ch_02;

import java.util.Scanner;

public class E2_04 {
	/*
	 * (Convert square meter into ping) Write a program that converts square meter
	 * into ping. The program prompts the user to enter a number in square meter,
	 * converts it to ping, and displays the result. One square meter is 0.3025
	 * ping.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number in square meters: ");
		double squareMeter = input.nextDouble();
		double squareMeterToPing = squareMeter * 0.3025;
		System.out.println(squareMeter + " square meters is " + squareMeterToPing + " pings");
	}

}
