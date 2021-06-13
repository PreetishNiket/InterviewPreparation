package Arrays;

import java.util.Scanner;

public class SearchMatrix {

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
		int target = scan.nextInt();
		System.out.println(searchMatrix(a,target));
	}
//	1,3,5,7  10,11,16,20 23,30,34,60  target = 3
	public static boolean searchMatrix(int[][] matrix, int target) {
		int n=matrix.length;
		int m=matrix[0].length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(matrix[i][j]==target) {
					return true;
				}
			}
		}
		return false;
	}
}
