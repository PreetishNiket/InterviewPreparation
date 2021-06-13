package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class ReturnAllCodes {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		String output[] = getCode(input);
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}

	}

	public static char getChar(int n) {
		return (char) (n + 96);
	}

	public static String[] getCode(String input, String ans) {
		if (input.length() == 0) {
			System.out.println(ans);

		}
		String result1[]= {""};
		String result2[]= {""};
		int firstDigit = input.charAt(0) - '0';
		result1=getCode(input.substring(1), ans + getChar(firstDigit));
		int k=0;
		if (input.length() > 1) {
			int firstTwoDigits = (input.charAt(0) - '0') * 10 + (input.charAt(1) - '0');
			if (firstTwoDigits >= 10 && firstTwoDigits <= 26) {
				result2=getCode(input.substring(2), ans + getChar(firstTwoDigits));
				k++;
			}
		}
		String output[]=new String[result1.length+result2.length];
		output=result1;
		
		for(int i=0;i<result1.length+result2.length;i++) {
			output[k]=result2[i];
			k++;
		}
		return output;
	}

	public static String[] getCode(String input) {
		return getCode(input, "");
	}
//	public static String[] getCode(String input) {
//		String ans[]=new String[10000];
//		return getcode(input,ans);
//	}
//	public static char getChar(int n) 
//	{ 
//		return (char) (n + 96); 
//		}
//	
//
//	private static String[] getcode(String input, String ans[]) {
//		ArrayList<String> str =new ArrayList<String>();
//		String output="";
//		getCodesAlgo(input,output,str);
//		
//		for(int i=0;i<str.size();i++) {
//			ans[i]=str.get(i);
//		}
//		return ans;
//	}
//
//	private static void getCodesAlgo(String input, String output, ArrayList<String> str) {
//		if(input.length()==0) {
//			str.add(output);
//			return;
//		}
//		int firstDigit=input.charAt(0)-'0';
//		getCodesAlgo(input.substring(1), output+getChar(firstDigit), str);
//		if(input.length()>1) {
//			int twoDigit=(input.charAt(0)-'0')*10+(input.charAt(1)-'0');
//			if(twoDigit>=10&&twoDigit<26) {
//				getCodesAlgo(input.substring(2), output+getChar(twoDigit), str);
//				
//			}
//		}
//		
//	}

}
