package Arrays;

import java.util.Scanner;

public class MaxRectangle2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] a = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = scan.nextInt();
			}
		}
	}
//	 public static int maxArea(int a[][], int m, int n) {
//	        
//	    }

}
