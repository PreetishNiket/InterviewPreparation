package Arrays;

import java.util.Scanner;

public class RowWiseSumTwoD {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while (t-- > 0) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			int a[][] = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					a[i][j] = scan.nextInt();
				}
			}

			for (int i = 0; i < n; i++) {
				int sum = 0;
				for (int j = 0; j < m; j++) {
					sum = sum + a[i][j];
				}
				System.out.print(sum + " ");
			}
		}
		System.out.println();
	}
}
