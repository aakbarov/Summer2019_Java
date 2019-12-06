package Ch_Ex;

import java.util.Scanner;

public class ReadCharacter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character: ");
		String s = input.nextLine();
		char ch = s.charAt(s.length()-1);
		System.out.println("The character entered is " + ch);
	}

}
