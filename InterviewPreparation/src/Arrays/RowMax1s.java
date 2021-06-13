package Arrays;

import java.util.Scanner;

public class RowMax1s {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] a = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = scan.nextInt();
			}
		}

		int row = 0;
		int i = 0;
		int j = m - 1;
		while (i < n && j >= 0) {
			if (a[i][j] == 1) {
				row = i;
				j--;
			} else
				i++;
		}
		System.out.println(row);
		
//		int ans=maxOnes(a);
//		System.out.println(ans);
	}

//	0 1 1 1  0 0 1 1  1 1 1 1  0 0 0 0
	public static int maxOnes(int[][] a) {
		int max = Integer.MIN_VALUE;
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] == 1) {
					count++;
				}

			}
			if (max < count) {
				max = count;
				index = i;
			}
		}
		return index;
	}

}
