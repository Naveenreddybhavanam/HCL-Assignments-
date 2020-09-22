package day3;

import java.util.Scanner;

public class Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		s.close();
		String str1 = "";
		if(n1<str.length() && n2<=str.length()) {
			for(int i=n1; i<n2; i++) {
				str1 += str.charAt(i);
			}
		}
		System.out.println(str1);
	}

}
