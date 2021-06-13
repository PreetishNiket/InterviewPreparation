package Recursion;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
//		int x=scan.nextInt();
		int n=scan.nextInt();
		
//		System.out.println(power(x,n));
//		printIncNum(n);
		
		System.out.println(count(n));

	}
	public static int count(int n){
		if(n == 0){
			return 0;
		}
		int smallAns = count(n / 10);
		return smallAns+1;
	}
	private static void printIncNum(int n) {
		if(n==0) {
			return;
		}
		printIncNum(n-1);
		System.out.print(n+" ");
		
	}
	public static int power(int x, int n) {
		if(n==0) {
			return 1;
		}
		int smallAns=power(x, n-1);
		
		return x*smallAns;
	}
	
}
