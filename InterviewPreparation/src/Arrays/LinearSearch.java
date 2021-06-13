package Arrays;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0) {
			int N=scan.nextInt();
			int a[]=new int[N];
			for(int i=0;i<N;i++) {
				a[i]=scan.nextInt();
			}
			int x=scan.nextInt();
			int index=linearsearch(a, x);
			System.out.println(index);
		}
		scan.close();
	}
	public static int linearsearch(int a[],int x) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==x) {
				return i;
			}
		}
		return -1;
	}
}
