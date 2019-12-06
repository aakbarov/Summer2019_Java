package Ch_02;

import java.util.Scanner;

public class E2_05 {
	/*
	 * (Financial application: calculate tips) Write a program that reads the
	 * subtotal and the gratuity rate and then computes the gratuity and total. For
	 * example, if the user enters 10 for subtotal and 12% for gratuity rate, the
	 * program displays $1.2 as gratuity and $11.2 as total.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		double gratuity = subtotal * 12 / 100;
		double total = subtotal + gratuity;
		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
	}

}
