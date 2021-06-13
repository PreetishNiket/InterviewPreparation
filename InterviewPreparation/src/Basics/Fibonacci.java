package Basics;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSeries();
		printNFibonacci();
	}
	private static void printNFibonacci() {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int f=0;
		int s=1;

		for(int i=0;i<n;i++) {
			int sum=f+s;
			f=s;
			s=sum;
		}
		System.out.print(f);
		
	}
	private static void printSeries() {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int f=0;
		int s=1;
		System.out.print(f+" "+s+" ");
		for(int i=0;i<n;i++) {
			int sum=f+s;
			f=s;
			s=sum;
			System.out.print(sum+" ");
		}
	}

}
