package Recursion;

import java.util.Scanner;

public class SumOfDigitsRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(sumOfDigits(n));
	}
	public static int sumOfDigits(int input){
		if(input==0) {
			return 0;
		}
		return (input%10)+sumOfDigits(input/10);

	}
}
