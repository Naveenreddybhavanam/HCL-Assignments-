//4. Exception
package Com;

import java.util.Scanner;

class NegativeException extends Exception {

	public NegativeException(String message) {

		super(message);
	}
}

public class NameExceptionDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter ur name :: ");
		String name = scanner.nextLine();
		System.out.print("Enter ur age :: ");
		int age = scanner.nextInt();

		try {
			if (age < 18)
				throw new NegativeException("Age must be greater than 18");
			else
				System.out.println("Valid age !!!");
		} catch (AgeNegativeException a) {
			System.out.println("CustomException: InvalidAgeRangeException");
			System.out.println(a.getMessage());
		}
	}

}