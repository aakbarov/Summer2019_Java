package Ch_01;

public class E1_11 {
	public static void main(String[] args) {
		int currentPop = 312_032_486;
		int secPerYear = 365 * 24 * 3600;
		double birth = secPerYear * 5.0 / 7;
		double death = secPerYear * 5.0 / 13;
		double immigrant = secPerYear * 5.0 / 45;
		double a = currentPop + birth;
		double b = currentPop + death;
		double c = currentPop + immigrant;
		System.out.println(currentPop + birth);
		System.out.println(currentPop + death);
		System.out.println(currentPop + immigrant);

		System.out.println(a + c - b);

	}

}
