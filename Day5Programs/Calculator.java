//3.  Calculator
package Com;

import java.util.Scanner;

class Calculator {
	
	public long power(int num, int q) throws Exception {
		if (num == 0 && q== 0)
			throw new Exception("num and q should not be zero.");
		else if (num < 0 || q < 0)
			throw new Exception("num or q should not be negative.");
		else
			return (long) (Math.pow(num, q));
	}

}
