package PriorityQueuesHeap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class HeapQuestions {

	public static void main(String[] args) {
		int a[] = { 7, 10, 4, 3, 20, 15 };

//		12, 5, 787, 1, 23
		int k = 2;
		ArrayList<Integer> ans = kLargest(a, k);
		int result[] = kSmallAlternative(a, a.length, k);
		for (int i : result) {
			System.out.println(i);
		}
	}

	public static int kthLargest(int n, int[] a, int k) {

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i = 0; i < a.length; i++) {
			pq.add(a[i]);
		}
		for (int i = 0; i < a.length; i++) {
			a[i] = pq.remove();
		}
		return a[a.length - k];
	}

	public static ArrayList<Integer> kLargest(int a[], int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i = 0; i < a.length; i++) {
			pq.add(a[i]);
		}
		for (int i = 0; i < a.length; i++) {
			a[i] = pq.remove();
		}
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i = a.length - k; i < a.length; i++) {
			ans.add(a[i]);
		}
		return ans;
	}

	public static int[] kSmallAlternative(int[] a, int n, int k) {
		int temp[] = new int[k];
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i = 0; i < a.length; i++) {
			pq.add(a[i]);
		}
		for (int i = 0; i < k; i++) {
			temp[i] = pq.remove();
		}
		return temp;
	}

//	public static ArrayList<Integer> MaxSumArrays(int a[], int k) {
//		// SlidingWindowProblem
//		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
//		ArrayList<Integer> ans = new ArrayList<Integer>();
//		int i = 0;
//		while (i < k) {
//			pq.add(a[i]);
//			int max = pq.element();
//			ans.add(max);
//			pq.remove(a[0]);
//			
//			i++;
//		}
//		
//		while (i < a.length) {
//			
//			if (max > a[i]) {
//				
//			}
//		}
//	}

	public static boolean checkMaxHeap(int a[]) {
		int index = 0;
		int leftChildIndex = 1;
		int rightChildIndex = 2;
		while (index < a.length) {

			if (leftChildIndex < a.length && a[index] < a[leftChildIndex]) {
				return false;
			}
			if (rightChildIndex < a.length && a[index] < a[rightChildIndex]) {
				return false;
			}
			index++;
			leftChildIndex = 2 * index + 1;
			rightChildIndex = 2 * index + 2;
		}
		return true;
	}

	public void mergeBinaryMaxHeaps(long merged[], long a[], long b[], long n, long m) {
		PriorityQueue<Long> pq = new PriorityQueue<Long>(Collections.reverseOrder());
		for(int i=0;i<a.length;i++) {
			pq.add(a[i]);
		}
		for(int i=0;i<b.length;i++) {
			pq.add(b[i]);
		}
		int k=0;
		while(!pq.isEmpty()) {
			merged[k]=pq.remove();
			k++;
		}
	}

	public static ArrayList<Integer> mergeKArrays(int[][] a, int K) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				pq.add(a[i][j]);
			}
		}
		ArrayList<Integer> ans = new ArrayList<Integer>();
		while (!pq.isEmpty()) {
			ans.add(pq.remove());
		}
		return ans;
	}

	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> input) {
		return null;
	}
}

//MinPQComparator min = new MinPQComparator();
class MinPQComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1 < o2) {
			return -1;
		} else if (o1 > o2) {
			return 1;
		}
		return 0;
	}

}
