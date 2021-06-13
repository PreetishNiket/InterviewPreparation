package Arrays;

import java.util.Scanner;

public class ArraySum {
	public static int sum(int[] arr) {
		int sum=0;
		for(int k=0;k<arr.length;k++) {
			sum=sum+arr[k];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=1;i<=t;i++) {
			int N=scan.nextInt();
			int a[]=new int[N];
			for(int j=0;j<N;j++) {
				a[j]=scan.nextInt();
			}
			System.out.println(sum(a));
		}
		scan.close();
	}
}
