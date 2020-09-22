//2. Try Divison
package Com;

import java.util.Scanner;

public class DivisonByZero {

	public static void main(String[] args) {

		try {
			Scanner scanner = new Scanner(System.in);
			int number1 = scan.nextInt();
			int number2 = scan.nextInt();
			scanner.close();
			System.out.println(divideInput(number1, number2));
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static int divideInput(int number1, int number2) {
		int result;
		result = number1 / number2;
		return result;
	}
}