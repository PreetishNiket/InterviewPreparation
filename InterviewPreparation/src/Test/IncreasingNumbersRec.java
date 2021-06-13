package Test;

import java.util.Scanner;

public class IncreasingNumbersRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		printIncreasingNumber(a);
	}
	public static void printIncreasingNumber(int n) {
		printIncreasingNumber(n,1,"");
	}
	private static void printIncreasingNumber(int n, int start, String out) {
		if(n==0) {
			System.out.print(out+" ");
			return;
		}
		for(int i=start;i<=9;i++) {
			String str=out+Integer.toString(i);
			printIncreasingNumber(n-1, i+1, str);
		}
	}

}
