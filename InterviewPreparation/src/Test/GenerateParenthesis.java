package Test;

import java.util.Scanner;

public class GenerateParenthesis {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 int n=s.nextInt();
		printWellFormedParanthesis(n);
		}

	public static void printWellFormedParanthesis(int n) {
		printWellFormedParanthesis(n,n,"");
	}

	private static void printWellFormedParanthesis(int open, int close, String str) {
		if(close==0) {
			System.out.println(str);
			return;
		}
		if(open!=0) {
			printWellFormedParanthesis(open-1,close,str+"(");
		}
		if(close>open) {
			printWellFormedParanthesis(open, close-1, str+")");
		}
		
	}
}
