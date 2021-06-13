package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		String str =scan.nextLine();
		findDuplicates(str);
		
	}
	
	public static void findDuplicates(String str) {
		HashMap<Character, Integer> map =new HashMap<>();
		for(int i=0;i<str.length();i++) {
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), 1);
			}else {
				map.put(str.charAt(i), map.get(str.charAt(i)) +1);
			}
		}
		for(Map.Entry<Character, Integer> element : map.entrySet()) {
			char data=(char)element.getKey();
			int val=(int)element.getValue();
			if(val>1) {
				System.out.println(data+","+val);
			}
		}
//		char[] s=str.toCharArray();
//		int count=0;
//		for(int i=0;i<s.length;i++) {
//			for(int j=i+1;j<s.length;j++) {
//				if(s[i]==s[j]) {
//					count++;
//					System.out.println(s[j]+","+count);
//					break;
//				}
//			}
//		}
	}
//	public String reverseStr(String s, int k) {
//		String rev="";
//		int i=0;
//		int end=i+2;
//		for(i=0;i<s.length();i+=2) {
//			rev=rev+
//		}
//	}

	public void reverseString(char[] s) {
		String str = s.toString();
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i++) {
			rev = rev + str.charAt(i);
		}
		for (int i = 0; i < rev.length(); i++) {
			System.out.print(rev.charAt(i));
		}
	}
}
