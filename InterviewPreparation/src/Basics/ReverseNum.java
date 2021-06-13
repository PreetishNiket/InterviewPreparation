package Basics;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int a=0;
		while(n>0) {
			int rem=n%10;
			 a=a*10+rem;
			 n=n/10;
		}
		System.out.println(a);
	}

}
