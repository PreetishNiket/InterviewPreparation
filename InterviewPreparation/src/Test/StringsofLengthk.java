package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringsofLengthk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String charSet = s.next();
		int len = s.nextInt();
		String ans[] =allStrings(charSet, len);
		for(String str : ans){
			System.out.println(str);
		}
	}
	public static String[] allStrings(String charSet, int len){
		char[]set=charSet.toCharArray();
	    int n = set.length;
	    String ans=allStrings(set, "", n, len);
	    
	    	String firstArray[]=ans.split(",");
	    	 List<String> list = new ArrayList<String>();

	    	    for(String s : firstArray) {
	    	       if(s != null && s.length() > 0) {
	    	          list.add(s);
	    	       }
	    	    }

	    	    firstArray = list.toArray(new String[list.size()]);
	    	    return firstArray;
	    
	}
	private static String allStrings(char []set, String prefix, int n, int k) {
		if (k == 0)
	    {
			return prefix;
	    }
		String smallAns = "";
	    for (int i = 0; i < n; i++)
	    {
	        String newPrefix = prefix + set[i];
	        smallAns=smallAns+allStrings(set, newPrefix,n, k - 1)+",";
	    }
	    return smallAns;
	}

}
