package Recursion;

import java.util.Scanner;

public class LinearSearchRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int input[]=new int[n];
		for(int i=0;i<input.length;i++) {
			input[i]=scan.nextInt();
		}
		int x=scan.nextInt();
		System.out.println(checkNumber(input, x));
		
	}
	public static boolean checkNumber(int input[], int x) {
		
		
		if(input.length<=0) {
			return false;
		}
		
		int smallArray[]=new int[input.length-1];
		for(int i=1;i<input.length;i++) {
			smallArray[i-1]=input[i];
		}
		boolean smallAns=checkNumber(smallArray, x);
		if(input[0]==x) {
			return true;
		}else {
			return smallAns;
		}
		
	}

}
