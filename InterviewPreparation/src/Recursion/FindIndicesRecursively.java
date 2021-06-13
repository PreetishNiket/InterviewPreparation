package Recursion;

import java.util.Scanner;

public class FindIndicesRecursively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int input[]=new int[n];
		for(int i=0;i<input.length;i++) {
			input[i]=scan.nextInt();
		}
		int x=scan.nextInt();
//		System.out.println(firstIndex(input, x));
//		System.out.println(lastIndex(input, x));
//		scan.close();
		int output[] = allIndexes(input, x);
		for(int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}
	public static int[] allIndexes(int[] input, int x) {
		
		return allIndexes(input, x,0,0);
	}
	private static int[] allIndexes(int[] input, int x, int startIndex, int size) {
		if(startIndex>=input.length-1) {
			int base[]=new int[size];
			return base;
		}
		int index[]=null;
		if(input[startIndex]==x) {
			index=allIndexes(input, x, startIndex+1, size+1);
		}
		else {
			index=allIndexes(input, x, startIndex+1, size);
		}
		
		if(input[startIndex]==x) {
			index[size]=startIndex;
		}
		return index;
	}
	public static int firstIndex(int input[], int x) {
		return firstIndex(input, x,0);
	}
	public static int lastIndex(int input[], int x) {
		return lastIndex(input,x,0);
		
	}

	private static int firstIndex(int input[], int x,int startIndex) {
		if(startIndex>=input.length-1) {
			return -1;
		}
		if(input[startIndex]==x) {
			return startIndex;
		}
		int smallAns=firstIndex(input, x, startIndex+1);
		return smallAns;
	}
	private static int lastIndex(int[] input, int x, int startIndex) {
		if(startIndex>=input.length-1) {
			return -1;
		}
		int smallAns=lastIndex(input, x, startIndex+1);
		if(smallAns!=-1) {
			return smallAns;
		}
		else {
			if(input[startIndex]==x) {
				return startIndex;
			}else{
				return -1;
			}
		}
		
	}

}
