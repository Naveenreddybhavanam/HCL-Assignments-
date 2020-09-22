package Com;

import java.util.Scanner;

public class CalculatorMain {
	public static final Calculator calculator = new Calculator();
	public static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		while (in.hasNextInt()) {
			int num = in.nextInt();
			int q = in.nextInt();

			try {
				System.out.println(my_calculator.power(num, q));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
