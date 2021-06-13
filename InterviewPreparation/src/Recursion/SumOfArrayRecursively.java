package Recursion;

import java.util.Scanner;

public class SumOfArrayRecursively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int input[]=new int[n];
		for(int i=0;i<input.length;i++) {
			input[i]=scan.nextInt();
		}
	
		System.out.println(sum(input));
	}

	public static int sum(int[] input) {
		
		if(input.length==0) {
			return 0;
		}
		if(input.length==1) {
			return input[0];
		}
		int smallArray[]=new int[input.length-1];
		for(int i=1;i<input.length;i++) {
			smallArray[i-1]=input[i];
		}
		int smallAns=sum(smallArray);
		return input[0]+smallAns;
		
	}
	
}
