package Arrays;

import java.util.Scanner;

public class KadaneAlgorithm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		int max_end = 0;
		int max_so_far = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			max_end = max_end + a[i];
			if (max_so_far < max_end) {
				max_so_far = max_end;
			}
			if (max_end < 0) {
				max_end = 0;
			}
		}
		System.out.println(max_so_far);
	}

}
