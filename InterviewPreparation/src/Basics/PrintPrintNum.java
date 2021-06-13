package Basics;

import java.util.Scanner;

public class PrintPrintNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=2;i<n;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
		scan.close();
	}
	private static Boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
