package day2;

import java.util.Scanner;

public class Smallest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		System.out.println("Enter any three numbers:");
		Scanner s = new Scanner(System.in);
		num1 = s.nextInt();
		num2 = s.nextInt();
		num3 = s.nextInt();
		s.close();
		int result;
		result = num1<num2 ? num1 : num2;
		if(result == num1) {
			if(num1<num3) {
				result = num1;
			}else {
				result = num3;
			}
		}
		if(result == num2) {
			if(num2<num3) {
				result = num2;
			}else {
				result = num3;
			}
		}
		System.out.println("Smallest Number is: "+result);
	}

}
