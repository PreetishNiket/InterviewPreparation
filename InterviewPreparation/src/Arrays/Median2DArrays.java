package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Median2DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] a = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; i < m; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		int temp[] = new int[n * m];
		int k = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; i < m; j++) {
				temp[k++] = a[i][j];
			}
		}
		Arrays.sort(temp);
		int mid=temp.length/2;
		System.out.println(temp[mid]);

	}

}
