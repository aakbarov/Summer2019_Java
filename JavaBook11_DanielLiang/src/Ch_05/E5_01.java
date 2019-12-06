package Ch_05;

import java.util.Scanner;

public class E5_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter your score: ");
		int score = input.nextInt();
		
		if(score>=60) {
			System.out.println("You pass the exam.");
		}
		if(score<60) {
			System.out.println("You don't pass the exam.");
		}
		if(score<0||score>100) {
			System.out.println("No numbers are entered except 0");
		}
	}

}
