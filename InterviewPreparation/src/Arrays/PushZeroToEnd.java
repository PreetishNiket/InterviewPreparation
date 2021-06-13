package Arrays;

import java.util.Scanner;

public class PushZeroToEnd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while (t-- > 0) {
			int n = scan.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scan.nextInt();
			}
			int num = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] != 0) {
					swap(a, i, num);
					num++;
				}
			}
			display(a);
		}

	}

	private static void display(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	public static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
