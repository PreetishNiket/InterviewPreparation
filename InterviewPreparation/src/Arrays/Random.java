package Arrays;

import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rts="";
		String str1="";
		int count=0;
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				str1=str.substring(i, j);
				for(int k=str1.length()-1;k>=0;k--) {
					rts=rts+str1.charAt(k);
				}
				if(rts.equals(str1)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
