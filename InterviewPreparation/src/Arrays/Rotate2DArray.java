package Arrays;

import java.util.Scanner;

public class Rotate2DArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; i < n; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		int temp[][]=a;
		int k=0;
		int [][]b = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; i < n; j++) {
				b[i][k]=temp[i][j];
				k++;
			}
		}
	}

}
