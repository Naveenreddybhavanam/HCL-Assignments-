package day2;

import java.util.Scanner;

public class Middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		s.close();
		int len = str.length();
		String str1 = "";
		if(len%2 != 0) {
			System.out.println("The middle character in the string: "+str.charAt(len/2));
		}else {
			str1 = str1 + str.charAt((len/2)-1) + str.charAt(len/2) ;
			System.out.println("The middle character in the strings: "+str1);	
		}
		
	}

}
