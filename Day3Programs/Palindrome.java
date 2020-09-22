package day3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		s.close();
		String rev = "";
		int len = str.length();
		for(int i=len-1;i>=0;i--) {
			rev += str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
