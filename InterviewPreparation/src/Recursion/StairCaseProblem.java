package Recursion;

import java.util.Scanner;

public class StairCaseProblem {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(staircase(n));
		scan.close();
	}
	 public static int staircase(int n){
		 if(n==1||n==0) {
			 return 1;
		 }
		 else if(n==2) {
			 return 2;
		 }
		 else {
			 return staircase(n-3)+staircase(n-2)+staircase(n-1);
		 }
	 }
}
