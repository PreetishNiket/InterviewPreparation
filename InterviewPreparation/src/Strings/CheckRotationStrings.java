package Strings;

import java.util.Scanner;

public class CheckRotationStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		if (areRotations(str1, str2)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
	public static boolean areRotations(String str1, String str2)
    {
		return (str1.length() == str2.length()) &&
	               ((str1 + str1).indexOf(str2) != -1);
    }
}
