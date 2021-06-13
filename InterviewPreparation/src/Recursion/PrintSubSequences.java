package Recursion;

import java.util.Scanner;

public class PrintSubSequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str=scan.nextLine();
		printSubSeq(str);
		scan.close();
	}

	public static void printSubSeq(String input) {
		printSubSeq(input,"");
		
	}

	private static void printSubSeq(String input, String output) {
		if(input.length()==0) {
			System.out.println(output);
			return;
		}
		printSubSeq(input.substring(1), output);
		printSubSeq(input.substring(1), output+input.charAt(0));
	}

}
