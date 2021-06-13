package Recursion;

import java.util.Scanner;

public class MergeSort {
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		mergeSort(arr);
		printArray(arr);

		
	}

	public static void printArray(int input[]) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

	public static void mergeSort(int[] input) {
		int startIndex = 0;
		int endIndex = input.length - 1;
		mergeSortAlgo(input, startIndex, endIndex);
	}

	private static void mergeSortAlgo(int[] input, int startIndex, int endIndex) {
		if (startIndex <endIndex) {
			

			int mid = (startIndex + endIndex) / 2;
			mergeSortAlgo(input, startIndex, mid);
			mergeSortAlgo(input, mid + 1, endIndex);

			mergeArray(input, startIndex, mid, endIndex);
		}
	}

	public static void mergeArray(int arr[], int start, int mid, int end) {
		int i=start;
		int j=mid+1;
		int k=0;
		int ans[]=new int[end-start+1];
		while(i<=mid&&j<=end) {
			if(arr[i]<arr[j]) {
				ans[k]=arr[i];
				i++;
				k++;
			}
			else {
				ans[k]=arr[j];
				j++;
				k++;
			}
		}
		while(i<=mid) {
			ans[k]=arr[i];
			i++;
			k++;
		}
		while(j<=end) {
			ans[k]=arr[j];
			j++;
			k++;
		}
		for(int index=0;index<ans.length;index++) {
			arr[start+index]=ans[index];
		}
		
	}
}
// mergeArray

//		int start2 = mid + 1;
//
//		if (arr[mid] <= arr[start2]) {
//			return;
//		}
//
//		while (start <= mid && start2 <= end) {
//
//			if (arr[start] <= arr[start2]) {
//				start++;
//			} else {
//				int value = arr[start2];
//				int index = start2;
//
//				while (index != start) {
//					arr[index] = arr[index - 1];
//					index--;
//				}
//				arr[start] = value;
//				
//				start++;
//				mid++;
//				start2++;
//			}
//		}
//	}
//
//}
