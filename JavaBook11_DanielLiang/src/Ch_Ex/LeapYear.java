package Ch_Ex;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = input.nextInt();

		// Check if the year is a leap year
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		// Display the result
		System.out.println(year + " is a leap year? " + isLeapYear);
	}

}
