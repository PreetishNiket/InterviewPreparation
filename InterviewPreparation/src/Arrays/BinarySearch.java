package Arrays;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int a[] = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = scan.nextInt();
		}
		int x = scan.nextInt();
		int index = Binarysearch(a, x);
		System.out.println(index);
		scan.close();
	}

	private static int Binarysearch(int[] a, int x) {
		int low=0;
		int high=a.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(x>a[mid]) {
				low=mid+1;
			}
			else if(x<a[mid]) {
				high=mid-1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}

}
