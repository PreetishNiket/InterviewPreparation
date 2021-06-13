package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Common3SortedArrays {
//	6
//	1 5 10 20 40 80
//	5
//	6 7 20 80 100
//	8
//	3 4 15 20 30 70 80 120

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		int[] a = new int[n1];
		for (int i = 0; i < n1; i++) {
			a[i] = scan.nextInt();
		}
		int[] b = new int[n2];
		for (int i = 0; i < n2; i++) {
			b[i] = scan.nextInt();
		}
		int[] c = new int[n3];
		for (int i = 0; i < n3; i++) {
			c[i] = scan.nextInt();
		}
		ArrayList<Integer> list = new ArrayList<Integer>();

		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length && k < c.length) {
			if (a[i] == b[j] && b[j] == c[k]) {
				if (!list.contains(a[i])) {
					list.add(a[i]);
				}
				i++;
				j++;
				k++;
			} else if (a[i] < b[j]) {
				i++;
			} else if (b[j] < c[k]) {
				j++;
			} else { //c[k]<b[j] or c[k]<a[i]
				k++;
			}
		}
		for (int z = 0; z < list.size(); z++) {
			System.out.println(list.get(z));
		}
	}
}
