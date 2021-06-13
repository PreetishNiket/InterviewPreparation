package Recursion;

import java.util.Scanner;

public class RemoveConsecutiveDuplicateRec {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(removeConsecutiveDuplicates(str));
		scan.close();
	}
	public static String removeConsecutiveDuplicates(String s) {
		if(s.length()<=1) {
			return s;
		}
		if(s.charAt(0)==s.charAt(1)) {
			return removeConsecutiveDuplicates(s.substring(1));
		}
		else {
			String smallAns=removeConsecutiveDuplicates(s.substring(1));
			return s.charAt(0)+smallAns;
		}

	}
}
