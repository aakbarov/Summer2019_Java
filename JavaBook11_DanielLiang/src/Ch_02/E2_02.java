package Ch_02;

import java.util.Scanner;

public class E2_02 {
	/*
	 * (Compute the volume of a triangle) Write a program that reads in the length
	 * of sides of an equilateral triangle and computes the area and volume using
	 * the following formulas: area = 23 4 (length of sides)2 volume = area * length
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of the sides and height of the Equilateral triangle: ");
		double length = input.nextDouble();
		double area = (Math.sqrt(3) / 4) * length * length;
		System.out.println("The area is "+area);
		double volume = area*length;
		System.out.println("The volume of the Triangular prism is "+volume);
	}

}
