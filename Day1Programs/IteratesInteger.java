package com.naveen;

public class IteratesInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int number=1;number<=100;number++)
		{
			if(number%3==0 && number%5==0)
				System.out.println(number+" :fizz buzz");
			if(number%3==0)
				System.out.println(number+" :fizz");
			if(number%5==0)
				System.out.println(number+" :buzz");
		}

	}

}
