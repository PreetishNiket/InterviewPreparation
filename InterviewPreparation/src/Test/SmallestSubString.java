package Test;

import java.util.Scanner;

public class SmallestSubString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String large = scan.nextLine();
		String small = scan.nextLine();
		for (int i = 0; i < large.length(); i++) {
			for (int j = i + 1; j <= large.length(); j++) {
				String temp = large.substring(i, j);
				if (temp.equals(small))
					;
				{
					System.out.println(temp);
				}
			}
		}
	}
	/*
	 * Find smallest substring
	 * 
	 * Given two strings string1 and string2 (named large and small), find the
	 * smallest substring in string1 containing all characters of string2 in O(n).
	 * You need to return the output substring. Note : The characters of string2
	 * need not to be present in same order in string1. That is, we need a substring
	 * which contains all characters of string2 irrespective of the order. Return
	 * null if no substring with all characters is present.
	 * 
	 * Looks for minimum string 
	 * mums
	 */

}
