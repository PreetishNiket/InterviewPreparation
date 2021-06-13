package Recursion;

import java.util.Scanner;

public class CountZeros {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(countZerosRec(n));
	}
//	70800 0
//	public static int countZerosRec(int input){
//		return countZerosRec(input);	
//	}

	public static int countZerosRec(int input) {
		 if(input==0) {
			 return 1;
		 }
		 if(input<10) {
			 return 0;
		 }
		 else if(input%10==0) {
			 return 1+countZerosRec(input/10);
		 }
		 return countZerosRec(input/10);
			
	}

}
