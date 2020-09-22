package day3;

import java.util.Scanner;

public class Lower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a string");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine().toLowerCase();
		s.close();
		System.out.println(str);
		
	}

}
