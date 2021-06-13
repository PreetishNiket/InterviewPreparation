package Recursion;

import java.util.Scanner;

public class MinCountSq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(minCount(n));
	}

	public static int minCount(int n) {
		if (n <= 3) {
			return n;
		}
		int res=n;
		for(int i=1;i<=n;i++) {
			int temp=i*i;
			if(temp>n) {
				break;
			}
			else {
				res=Math.min(res, minCount(n-temp)+1);
			}
		}
		return res;
	}
}
