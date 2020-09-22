package day2;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine().toLowerCase();
		s.close();
		int vowel = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a' ||  str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				vowel++;
			}
		}
		System.out.println("Number of vowels in the string: "+vowel);
	}

}
