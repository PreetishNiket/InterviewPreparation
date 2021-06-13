package Recursion;

import java.util.Scanner;

public class ReturnKeypadCode {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		String ans[]=keypad(n);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
		scan.close();

	}

	public static String[] keypad(int n) {
		if(n==0) {
			String ans[]= {""};
			return ans;
		}
		String smallAns[]=keypad(n/10);
		String singleDigit[]=singleDigit(n%10);
		String ans[]=new String[smallAns.length*singleDigit.length];
		int k=0;
		for(int i=0;i<singleDigit.length;i++) {
			
			for(int j=0;j<smallAns.length;j++) {
				ans[k]=smallAns[j]+singleDigit[i];
				k++;
			}
			
		}
		return ans;
	}

	public static String[] singleDigit(int n) {
		if(n<=1||n>=10)
        {
			String output[]={""};
            return output;
        }
        if(n==2)
        {
            String output[]={"a","b","c"};
            return output;
        }
        else if(n==3)
        {
            String output[]={"d","e","f"};
            return output;
        }
        else if(n==4)
        {
            String output[]={"g","h","i"};
            return output;
        }
        else if(n==5)
        {
            String output[]={"j","k","l"};
            return output;
        }
        else if(n==6)
        {
            String output[]={"m","n","o"};
            return output;
        }
        else if(n==7)
        {
            String output[]={"p","q","r","s"};
            return output;
        }
        else if(n==8)
        {
            String output[]={"t","u","v"};
            return output;
        }
        else 
        {
            String output[]={"w","x","y","z"};
            return output;
        }
	}
}
