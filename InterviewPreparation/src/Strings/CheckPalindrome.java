package Strings;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String str =scan.nextLine();
		String rts="";
		for(int i=str.length()-1;i>=0;i--) {
			rts=rts+str.charAt(i);
		}
		if(rts.equals(str)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		scan.close();
	}

}
