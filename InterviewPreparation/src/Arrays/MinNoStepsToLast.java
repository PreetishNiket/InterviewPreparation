package Arrays;

import java.util.Scanner;

public class MinNoStepsToLast {
//	11 
//	1 3 5 8 9 2 6 7 6 8 9 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println(minJumps(a));

	}

	public static int minJumps(int[] a) {
		int n = a.length;
		if (n <= 1) {
			return 0;
		}
		if (a[0] == 0) {
			return -1;
		}
		int maxReach = a[0];
		int step = a[0];
		int jump = 1;
		for (int i = 0; i < n; i++) {
			if (i == n - 1) {
				return jump;
			}
			maxReach = Math.max(maxReach, i + a[i]);
			step--;
			if (step == 0) {

				jump++;
				if (i >= maxReach) {
					return -1;
				}
				step = maxReach - i;
			}
		}
		return -1;
	}
}
