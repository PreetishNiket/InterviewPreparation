package Recursion;

import java.util.Scanner;

public class ReplaceCharacter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char c1 = scan.next().charAt(0);
		char c2 = scan.next().charAt(0);
		System.out.println(replaceCharacter(str, c1, c2));
	}

	public static String replaceCharacter(String input, char c1, char c2) {
		if (input.length() == 0) {
			return "";
		}

		char ans = input.charAt(0);
		
		if (ans == c1) {
			ans=c2;
		}

		String smallAns = replaceCharacter(input.substring(1), c1, c2);
		return ans + smallAns;
	}
}
