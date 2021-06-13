package PriorityQueuesHeap;

import java.util.PriorityQueue;

public class sortKSortedArray {

	public static void main(String[] args) {
		int a[] = { 2, 1, 4, 6, 8, 9 };
		int k = 3;
		sortKSorted(a, k);
		
		for(int i:a) {
			System.out.print(i+" ");
		}

	}

	private static void sortKSorted(int[] a, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int i = 0;
		for (; i < k; i++) {
			pq.add(a[i]);
		}

		for (; i < a.length; i++) {
			a[i - k] = pq.remove();
			pq.add(a[i]);
		}
		for (int j = a.length - k; j < a.length; j++) {
			a[j]=pq.remove();
		}
	}

}
