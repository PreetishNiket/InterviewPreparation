package Arrays;

import java.util.Scanner;

public class SwapAlternate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0) {
			int N=scan.nextInt();
			int a[]=new int[N];
			for(int i=0;i<N;i++) {
				a[i]=scan.nextInt();
			}
			for(int i=0;i<a.length-1;i+=2) {
				int z=a[i]+a[i+1];
				a[i]=z-a[i];
				a[i+1]=z-a[i+1];
			}
			print(a);
		}

	}
	public static void print(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
