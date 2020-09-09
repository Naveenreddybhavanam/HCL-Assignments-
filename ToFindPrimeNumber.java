package com.naveen;

import java.util.Scanner;

public class ToFindPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,count=0;
		Scanner scanner=new Scanner(System.in);
		number=scanner.nextInt();
		for(int iterator=2;iterator<=number;iterator++)
		{
				if(number%iterator==0)
					count++;
		}
		if(count==1)
			System.out.println(number +" is a Prime Number");
		else
			System.out.println(number +" is Not a Prime Number");

	}

}
