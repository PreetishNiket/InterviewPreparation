package Arrays;

import java.util.Scanner;

public class KthSmallest2DArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; i < n; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		int k = scan.nextInt();
		System.out.println(kthSmallest(a, n, k));

	}

	public static int kthSmallest(int[][] mat, int n, int k) {
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < min) {
					min = mat[i][j];
					k--;
				}
			}
		}
		return min;
	}
}
