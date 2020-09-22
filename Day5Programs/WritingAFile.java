//1. checked exception
package Com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class WritingAFile {
	public static void main(String args[]) throws FileNotFoundException {
		File file = new File("F://a.txt");

		FileReader f = new FileReader(file);
	}

}
