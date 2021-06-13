package Arrays;

import java.util.Scanner;

public class Sort012Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0) {
			int n=scan.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=scan.nextInt();
			}
			int low=0;
			int mid=0;
			int high=a.length-1;
			while(mid<=high) {
				if(a[mid]==0) {
					Swap(a, low, mid);
					mid++;
					low++;
				}
				else if(a[mid]==1) {
					mid++;
				}
				else {
					Swap(a, mid, high);
					high--;
				}
			}
			display(a);
		}

	}
	private static void display(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}
	public static void Swap(int a[],int i,int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}

}
