package PriorityQueuesHeap;

import java.util.Arrays;

public class MinSumDigits {

	public static void main(String[] args) {
		int a[] = { 6, 8, 4, 5, 2, 3 };
		System.out.println(solve(a, a.length));
	}

	public static String solve(int[] arr, int n) {
		Arrays.sort(arr);
		int a = 0;
		int b = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 != 0) {
				a = a * 10 + arr[i];
			} else {
				b = b * 10 + arr[i];
			}
		}
		int ans = a+b;
		String str="";
		str=str+ans;
		return str;
	}

}
