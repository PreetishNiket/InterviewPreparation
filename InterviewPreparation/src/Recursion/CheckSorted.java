package Recursion;

import java.util.Scanner;

public class CheckSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int input[]=new int[n];
		for(int i=0;i<input.length;i++) {
			input[i]=scan.nextInt();
		}
		System.out.println(checkSorted(input));

	}

	private static boolean checkSorted(int[] input) {
		if(input.length<=1) {
			return true;
		}
		if(input[0]>input[1] ){
			return false;
		}
		int smallInput[]=new int[input.length-1];
		for(int i=1;i<input.length;i++) {
			smallInput[i-1]=input[i];
		}
		boolean smallAns=checkSorted(smallInput);
		return smallAns;
		
	}

}
