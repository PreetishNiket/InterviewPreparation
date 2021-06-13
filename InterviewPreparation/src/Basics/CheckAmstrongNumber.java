package Basics;

import java.util.Scanner;

public class CheckAmstrongNumber {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int temp=n;
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(temp==sum) {
			System.out.println(temp+" is an Amstrong Number");
		}
		else {
			System.out.println(temp+" is not an Amstrong Number");
		}
	}

}
