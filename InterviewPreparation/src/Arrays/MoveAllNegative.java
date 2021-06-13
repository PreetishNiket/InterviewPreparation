package Arrays;

import java.util.Scanner;

public class MoveAllNegative {
//	9
//	-1 2 -3 4 5 6 -7 8 9

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
//		a=moveNegativeOneSide(a, n);
		a = alternate(a, n);
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static int[] moveNegativeOneSide(int[] a, int n) {
		int num = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] <= 0) {
				swap(a, i, num);
				num++;
			}
		}
		return a;
	}

	public static int[] alternate(int[] a, int n) {
		moveNegativeOneSide(a, n);
		for (int i = 0; a[i] < 0; i++) {
			int j = 1;
			while ((j < i) && a[j] < 0) {
				swap(a, i, j);
				i++;
				j = j + 2;
			}
		}
		return a;
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i] + a[j];
		a[i] = temp - a[i];
		a[j] = temp - a[j];
	}

}
