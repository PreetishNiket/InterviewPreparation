package Arrays;

import java.util.Scanner;

public class SpiralPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			int left = 0;
			int top = 0;
			int right = a[0].length - 1;
			int bottom = a.length - 1;
			int dir = 1;
			int count = (bottom + 1) * (right + 1);
			while (left <= right && top <= bottom && count > 0) {
				if (dir == 1) {
					for (int i = left; i <= right; i++) {
						System.out.print(a[top][i] + " ");
						count--;
					}
					dir = 2;
					top++;
				}
				if (dir == 2) {
					for (int i = top; i <= bottom; i++) {
						System.out.print(a[i][right] + " ");
						count--;
					}
					dir = 3;
					right--;
				}
				if (dir == 3) {
					for (int i = right; i >= left; i--) {
						System.out.print(a[bottom][i] + " ");
						count--;
					}
					dir = 4;
					bottom--;
				}
				if (dir == 4) {
					for (int i = bottom; i >= top; i--) {
						System.out.print(a[i][left] + " ");
						count--;
					}
					dir = 1;
					left++;
				}

			}
		}
	}

}
