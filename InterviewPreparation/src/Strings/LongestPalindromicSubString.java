package Strings;

import java.util.Scanner;

public class LongestPalindromicSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String str=scan.next();
		System.out.println(longestPalin(str));
	}

	public static int longestPalin(String str) {
		
		int max=0;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				String temp=str.substring(i, j);
				if(checkPalin(temp)) {
					if(max<temp.length()) {
						max=temp.length();
					}
				}
			}
		}
		return max;
	}
	public static boolean checkPalin(String temp) {
		String rev="";
		for(int i=temp.length();i>=0;i--) {
			rev+=temp.charAt(i);
		}
		return rev.equals(temp);
	}
}
