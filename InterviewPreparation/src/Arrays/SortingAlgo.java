package Arrays;

import java.util.Scanner;

public class SortingAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int a[] = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = scan.nextInt();
		}
		bubbleSort(a);
		display(a);
	
		selectionSort(a);
		display(a);

		insertionSort(a);
		display(a);

		scan.close();
	}

	private static void bubbleSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < a.length - i; j++) {
				if (a[j] > a[j + 1]) {
					Swap(a, j, j + 1);
				}
			}
		}
	}

	private static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min_index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min_index]) {
					min_index = j;
				}
			}
			if(min_index!=i) {
				Swap(arr, i, min_index);
			}
		}
	}

	private static void insertionSort(int a[]) {
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0 && a[j] < a[j - 1]; j--) {
				Swap(a, j, j - 1);
			}
		}
	}

	private static void display(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	private static void Swap(int[] a, int j, int i) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
