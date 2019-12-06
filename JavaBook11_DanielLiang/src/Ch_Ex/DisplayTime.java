package Ch_Ex;

import java.util.Scanner;

public class DisplayTime {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter seconds: ");
		int seconds = scan.nextInt();
		int minutes = seconds/60;
		int remainingSeconds = seconds%60;
		System.out.println(seconds+" seconds is "+minutes+" minutes "+remainingSeconds+" seconds");
	}

}
