package Recursion;

import java.util.Scanner;

public class StringToIntRec {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str=scan.nextLine();
		System.out.println(convertStringToInt(str));
		scan.close();
	}
	public static int convertStringToInt(String input){
		
		if(input.length()==1) {
			return input.charAt(0)-'0';
		}
		int smallAns=convertStringToInt(input.substring(1));
		int ans=0;
		ans+=input.charAt(0)-'0';
		return (int) (ans*Math.pow(10,input.length()-1 ))+smallAns;
	}
}
