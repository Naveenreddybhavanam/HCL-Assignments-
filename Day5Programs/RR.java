//5. Runrate
package Com;

import java.io.*;

public class RR {
	public static BufferedReader p = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int runrate;
		System.out.print("Enter Score: ");
		String num1 = p.readLine();
		int number1 = Integer.parseInt(num1);

		System.out.print("Enter Overs: ");
		String num2 = p.readLine();
		int nnumber2 = Integer.parseInt(num2);

		if (number2 == 0) {
			System.out.println("Arithmetic Exception");
		} else if (number1 != 0 && number2 != 0) {

			runrate = number1 / number2;
			System.out.println("Run Rate is= " + runrate);

		} else if (number1 == 0) {
			System.out.println("Run rate is 0");

		} else {
			System.out.println("Invalid");
		}

	}
}