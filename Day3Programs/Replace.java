package day3;

import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		s.close();
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='d') {
				str = str.replace(str.charAt(i), 'h');
			}
		}
		System.out.println(str);
	}

}
