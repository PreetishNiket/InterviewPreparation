package Strings;

import java.util.Scanner;

public class SubSequenceQuestions {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str=scan.next();
		printAllSub(str);
	}
	public static  void printAllSub(String str) {
	
		printAllSubHelper(str,"");
	}
	private static void printAllSubHelper(String str, String output) {
		if(str.length()==0) {
			System.out.println(output);
			return;
		}
		
		printAllSubHelper(str.substring(1), output);
		printAllSubHelper(str.substring(1), output+str.charAt(0));
	}
	public static int LongestRepeatingSubsequence(String str){
         for(int i=0;i<str.length();i++) {
        	 for(int j=i+1;j<str.length();j++) {
        		 String temp=str.substring(i, j);
        		 if(temp==str.substring(i+1, j+1)) {
        			 return temp.length();
        		 }
        	 }
         }
         return 0;
    }
}
