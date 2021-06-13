package Recursion;

import java.util.Scanner;

public class ReturnSubSequences {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str=scan.nextLine();
		String ans[]=findSubSeq(str);
		for(int i=0;i<ans.length;i++) {
			System.out.print("["+ans[i]+""+"]");
		}
		scan.close();
	}

	public static String[] findSubSeq(String str) {
		if(str.length()==0) {
			String ans[]= {""};
			return ans;
		}
		String smallAns[]=findSubSeq(str.substring(1));
		String ans[]=new String[2*smallAns.length];
		int k=0;
		for(int i=0;i<smallAns.length;i++) {
			ans[k]=smallAns[i];
			k++;
		}
		for(int i=0;i<smallAns.length;i++) {
			ans[k]=str.charAt(0)+smallAns[i];
			k++;
		}
		return ans;
	}

}
