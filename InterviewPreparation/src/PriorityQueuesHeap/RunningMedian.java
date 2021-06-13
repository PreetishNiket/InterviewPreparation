package PriorityQueuesHeap;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class RunningMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static PriorityQueue<Integer> min = new PriorityQueue<Integer>();
	static PriorityQueue<Integer> max = new PriorityQueue<Integer>(Collections.reverseOrder());
	public static void insertHeap(int x) {
			balanceHeaps(min,max,x);
	}

	// Function to balance heaps.
	public static void balanceHeaps(PriorityQueue<Integer> min, PriorityQueue<Integer> max, int x) {
		if(max.isEmpty()) {
			max.add(x);
		}
		else if(x>max.element()) {
			min.add(x);
			if(min.size()-max.size()>1) {
				int p=min.remove();
				max.add(p);
			}
		}else {
			max.add(x);
			if(max.size()-min.size()>1) {
				int p =max.remove();
				min.add(p);
			}
		}
	}

	// Function to return Median.
	public static double getMedian() {
		if(max.size()>min.size()) {
			return max.element();
		}else if(min.size()>max.size()){
			return min.element();
		}
		else {
			return ((max.element()+min.element())/2);
		}
	}
}
