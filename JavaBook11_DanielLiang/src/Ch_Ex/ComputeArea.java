package Ch_Ex;

import java.util.Scanner;

public class ComputeArea {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number: ");
		double radius = input.nextDouble();
		double area = radius*radius*3.14159;
		System.out.println("area = "+area);
		
	}

}
