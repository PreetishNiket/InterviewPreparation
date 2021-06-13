package Recursion;

import java.util.Scanner;

public class InterLeavings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String first = scan.nextLine();
		String second=scan.nextLine();
		interleavings(first, second);
	}

	public static void interleavings(String first, String second) {
		String ans="";
		interleavings(first, second,ans);
		
	}

	private static void interleavings(String s1, String s2, String ans) {
		if(s1.length()==0&&s2.length()==0) {
			System.out.println(ans);
		}
		
		if(s1.length()!=0) {
			interleavings(s1.substring(1), s2, ans+s1.charAt(0));
		}
		
		if(s2.length()!=0){
			interleavings(s1, s2.substring(1), ans+s2.charAt(0));
		}
	}

}
