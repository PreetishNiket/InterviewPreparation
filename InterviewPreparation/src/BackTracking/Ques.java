package BackTracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class Ques {

	static Scanner s = new Scanner(System.in);

	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		int k = s.nextInt();
		printSubsetsSumTok(input, k);
	}

	public static void printSubsetsSumTok(int[] input, int k) {
		Vector<Integer> v = new Vector<Integer>();
		int n = input.length;
		printSubsetsSumTok(input, n, v, k);
	}

	private static void printSubsetsSumTok(int[] arr, int n, Vector<Integer> v, int sum) {

		if (sum == 0) {
			for (int i = 0; i < v.size(); i++)
				System.out.print(v.get(i) + " ");
			System.out.println();
			return;
		}

		if (n == 0)
			return;

		printSubsetsSumTok(arr, n - 1, v, sum);
		Vector<Integer> v1 = new Vector<Integer>(v);
		v1.add(arr[n - 1]);
		printSubsetsSumTok(arr, n - 1, v1, sum - arr[n - 1]);

	}



}
