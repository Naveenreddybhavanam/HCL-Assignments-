package com.naveen;

import java.util.Scanner;

public class AssciValueOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char character;
		Scanner scanner=new Scanner(System.in);
		character=scanner.next().charAt(0);
		int ascii=character;
		System.out.println(ascii);

	}

}
