package com.naveen;

import java.util.Scanner;

public class SumOfSquaresOfEvenDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,evenSumSquare=0,reminder,evenSquare;
		Scanner scanner=new Scanner(System.in);
		number=scanner.nextInt();
		while(number!=0)
		{
			reminder=number%10;
			if(reminder%2==0)
			{
				evenSquare=reminder*reminder;
				evenSumSquare=evenSumSquare+evenSquare;
			}
			number=number/10;
		}
		System.out.println(evenSumSquare);
	}

}
