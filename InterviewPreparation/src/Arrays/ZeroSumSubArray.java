package Arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ZeroSumSubArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		boolean ans = findsum(a, n);
		System.out.println(ans);
	}

	public static boolean findsum(int a[], int n) {
		int sum = 0;
		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			sum += a[i];
			if (a[i] == 0 || sum == 0 || s.contains(sum)) {
				return true;
			}
			s.add(sum);
		}
		return false;
	}

}
