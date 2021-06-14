package PriorityQueuesHeap;

import java.util.PriorityQueue;

public class MinimumCostRopesConnected {

	public static void main(String[] args) {
		long a[] = { 4, 2, 7, 6, 9 };

		long ans = minCost(a, a.length);
		System.out.println(ans);

	}

	public static long minCost(long arr[], int n) {
		PriorityQueue<Long> pq = new PriorityQueue<Long>();
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}
		long sum = 0;
		while (pq.size() > 1) {
			long f = pq.remove();
			long s = pq.remove();
			long in = f + s;
			pq.add(in);
			sum = sum + in;
		}
		return sum;
	}
}
