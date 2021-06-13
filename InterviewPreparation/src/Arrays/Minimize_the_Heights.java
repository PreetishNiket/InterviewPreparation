package Arrays;

import java.util.Scanner;

public class Minimize_the_Heights {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		int k = scan.nextInt();
		System.out.println(getMinDiff(a, n, k));

	}
//	K = 2, N = 4
//			Arr[] = {1, 5, 8, 10}
	public static int getMinDiff(int[] a, int n, int k) {
		for (int i = 0; i < n; i++) {

			int min = a[i] - k;
			int max = a[i] + k;
			if (max > 0||min<0) {
				a[i]=max;
			}else {
				a[i]=min;
			}
			
		}
		int ans=a[n-1]-a[0];

		return ans;
	}

}
