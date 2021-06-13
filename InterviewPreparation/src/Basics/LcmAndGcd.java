package Basics;

import java.util.Scanner;

public class LcmAndGcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		int gcd=1;
		for(int i=1;i<=x||i<=y;i++) {
			if(x%i==0&&y%i==0) {
				gcd=i;
			}
			
		}
		System.out.println(gcd);
		int lcm=(x*y)/gcd;
		System.out.println(lcm);
		scan.close();
	}

}
