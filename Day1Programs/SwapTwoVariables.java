package com.naveen;

import java.util.Scanner;

public class SwapTwoVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1,number2;
		Scanner scanner=new Scanner(System.in);
		number1=scanner.nextInt();
		number2=scanner.nextInt();
		System.out.println("Before Swaping : " +"number1 = "+number1 +  "  number2 = "+number2);
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;
		System.out.println("After Swaping : " +"number1 = "+number1 +  "  number2 = "+number2);		
				

	}

}
