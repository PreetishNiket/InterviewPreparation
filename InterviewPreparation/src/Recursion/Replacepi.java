package Recursion;

import java.util.Scanner;

public class Replacepi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(replace(str));
	}

	public static String replace(String input) {
		if (input.length() <= 1) {
			return input;
		}

		if (input.charAt(0) == 'p' && input.length() >= 2 && input.charAt(1) == 'i') {

			return "3.14" + replace(input.substring(2));
		}

		return input.charAt(0) + replace(input.substring(1));
	}
}
