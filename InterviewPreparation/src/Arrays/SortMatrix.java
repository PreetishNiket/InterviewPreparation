package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = n;
		int[][] a = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		int ans[][] = sortedMatrix(n, a);
		printArray(ans);
	}

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] sortedMatrix(int n, int a[][]) {
		int[] temp = new int[n * n];
		int k = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				temp[k++] = a[i][j];
			}
		}
		Arrays.sort(temp);
		k=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = temp[k++];
			}
		}
		return a;
	}
}
