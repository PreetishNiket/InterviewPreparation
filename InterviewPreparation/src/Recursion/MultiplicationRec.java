package Recursion;

import java.util.Scanner;

public class MultiplicationRec {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		System.out.println(multiplyTwoIntegers(m,n));
	}
	public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
		if(n==0||m==0) {
			return 0;
		}
		return m+multiplyTwoIntegers(m, n-1);
	
	}
}
