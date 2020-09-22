package day3;

import java.util.Scanner;

class UserMain{
	static String reshape(String s, char ch) {
		String res = "";
		for(int i=s.length()-1;i>0;i--) {
			res += s.charAt(i)+""+ch;
		}
		res += s.charAt(0);
		return res;
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String str1 = scan.next();
		scan.close();
		char ch = str1.charAt(0);
		UserMain us = new UserMain();
		String s = us.reshape(str, ch);
		System.out.println(s);
	}

}
