package Ch_02;

import java.util.Scanner;

public class E2_07 {
	/*
	 * (Find the number of years) Write a program that prompts the user to enter the
	 * minutes (e.g., 1 billion), and displays the number of years and remaining
	 * days for the minutes. For simplicity, assume that a year has 365 days.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of minutes: ");
		int minutes = input.nextInt();

		int minutesOfDay = 24 * 60;
		int daysOfYear = minutesOfDay * 365;
		int years = minutes / daysOfYear;
		int days = minutes % minutesOfDay;

		System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");

	}

}
