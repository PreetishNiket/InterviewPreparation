package Arrays;

import java.util.Scanner;

public class KRotate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		int k = scan.nextInt();
		while (k-- > 0) {
			int temp = a[a.length - 1];
			int i = a.length - 1;
			while (i > 0) {
				a[i] = a[i - 1];
				i--;
			}
			a[0] = temp;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
