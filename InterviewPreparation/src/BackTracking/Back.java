package BackTracking;

import java.util.Scanner;

public class Back {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		printSubsets(input);
	}
	public static void printSubsets(int set[]) {
		int n=set.length;
		int subset[]=new int[100];
		printSubsets(set,0,n,subset,0);
		
    }
	public static void printSubsets(int arr[], int i, int n,int subset[], int j){    
	   
	    if(i==n){
	        int idx = 0;
	        while(idx<j){
	            System.out.print(subset[idx]+" ");
	            idx++;
	        }
	        System.out.println();
	        return;
	    }
	   
	    printSubsets(arr,i+1,n,subset,j);
	    subset[j] = arr[i];
	    printSubsets(arr,i+1,n,subset,j+1);
	}
	        
}
