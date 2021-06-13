package Recursion;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		quickSort(arr);
		
		printArray(arr);

	}

	public static void printArray(int input[]) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void quickSort(int[] input) {
		int si=0;
		int ei=input.length-1;
		quickSortAlgo(input,si,ei);
	}

	private static void quickSortAlgo(int[] input, int si, int ei) {
		if(si>=ei) {
			return;
		}
		int pivotPos=partition(input,si,ei);
		quickSortAlgo(input, si, pivotPos-1);
		quickSortAlgo(input, pivotPos+1, ei);
	}

	private static int partition(int[] input, int si, int ei) {
		int pivotPos=si;
		int pivot=input[ei];
		for(int i=si;i<ei;i++) {
			if(input[i]<=pivot) {
				swap(input, i, pivotPos);
				pivotPos++;
			}
		}
		swap(input, pivotPos, ei);
		return pivotPos;
	}
}
