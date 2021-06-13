package Recursion;

import java.util.Scanner;

public class PrintKeypadCode {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		printKeypad(input);
		
	}
	public static void printKeypad(int input){
		
		printKeypad(input,"");
	}
	private static void printKeypad(int input, String output) {
		if(input==0) {
			System.out.println(output);
			return;
		}
		String singleDigit[]=singleDigit(input%10);
		for(int i=0;i<singleDigit.length;i++) {
			printKeypad(input/10,singleDigit[i]+output);

		}
		
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
