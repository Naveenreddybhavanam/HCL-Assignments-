package day3;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {34,56,12,6,3,57,244,74,123,67};
		int temp;
		System.out.println("Enter a number to search");
		Scanner s = new Scanner(System.in);
		temp = s.nextInt();
		s.close();
		int num=0;
		boolean res=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==temp) {
				res=true;
				num=i+1;
			}
		}
		if(res==true) {
			System.out.println(num);
		}else {
			System.out.println("Not present in the array");
		}
	}

}
