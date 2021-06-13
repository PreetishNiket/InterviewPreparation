package Basics;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println(n+" is not a Prime Number");
			}
		}
		System.out.println(n+" is a Prime Number");
		scan.close();
	}

}
