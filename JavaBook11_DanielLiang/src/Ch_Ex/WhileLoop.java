package Ch_Ex;

public class WhileLoop {
	public static void main(String[] args) {
		int count = 0;
		while (count < Math.pow(10, 2)) {
			System.out.println("Welcome to Java!");
			count++;
		}
		int sum = 0, i = 1;
		while (i < 10) {
			sum = sum + i;
			i++;
		}
		System.out.println("sum is " + sum);
		
		int j = 1;
		while(j<10)
			if(j%2==0)
				System.out.println(j++);
	}


}
