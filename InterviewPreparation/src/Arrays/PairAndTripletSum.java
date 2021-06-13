package Arrays;

import java.util.Scanner;

public class PairAndTripletSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		int k = scan.nextInt();

		System.out.println(PairSum(a, n, k));
	}

	public static int PairSum(int a[], int n, int k) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			int j = i + 1;
			while (j < n) {
				if (a[i] + a[j] == k) {
					count++;
				}
				j++;
			}
		}
		return count;
	}

	public static boolean TripletSum(int a[], int n, int X) {
		for (int i = 0; i < n; i++) {
			
			for (int j = i + 1; j < n; j++) {
				
				for (int k = j + 1; k < n; k++) {
					
					if (a[i] + a[j] + a[k] == X) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
