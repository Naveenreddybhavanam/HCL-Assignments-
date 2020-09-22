package day3;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		s.close();
		String str2 = "";
		if(str.charAt(0)=='k') {
			str2  += str.charAt(0);
		}
		if(str.charAt(1)=='h') {
			str2 += str.charAt(1);
		}
		for(int i=2; i<str.length(); i++) {
			
			str2 += str.charAt(i);
		}
		System.out.println(str2);
	}

}
