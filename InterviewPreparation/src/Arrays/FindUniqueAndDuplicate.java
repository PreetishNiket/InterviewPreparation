package Arrays;

import java.util.Scanner;

public class FindUniqueAndDuplicate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		int uniqueElement=Unique(a);
		System.out.println(uniqueElement);
		int duplicateElement=duplicate(a);
		System.out.println(duplicateElement);
	}

	public static int duplicate(int[] a) {
		for (int i = 0; i < a.length; i++) {

			int j = i + 1;
			while (j < a.length) {
				if (a[i] == a[j]) {
					return a[i];
				}
				j++;
			}
		}
		
		return -1;
	}

	public static int Unique(int[] a) {
	
		for (int i = 0; i < a.length; i++) {

			int j = i + 1;
			while (j < a.length) {
				if (a[i] == a[j]) {
					break;
				}
				j++;
			}
			if (j == a.length) {
				return a[i];
			}
		}
		return -1;
	}

}
