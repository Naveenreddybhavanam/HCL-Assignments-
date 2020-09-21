package com.naveen;

import java.util.Scanner;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,oddSum=0,reminder;
		Scanner scanner=new Scanner(System.in);
		number=scanner.nextInt();
		while(number!=0)
		{
			reminder=number%10;
			if(reminder%2!=0)
				oddSum=oddSum+reminder;
			number=number/10;
		}
		if(oddSum%2==0)
        System.out.println("The odd sum is : even ");
		else
			System.out.println("The odd sum is : odd");
	}

}
