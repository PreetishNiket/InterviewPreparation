package PriorityQueuesHeap;

import java.util.Comparator;
import java.util.PriorityQueue;

class Node {
	int data;
	Node next;

	Node(int key) {
		data = key;
		next = null;
	}
}

public class MergeKsortedLL {

	public static Node mergeKList(Node[] a, int n) {
		PriorityQueue<Node> pq = new PriorityQueue<Node>(new Comparator<Node>() {
			@Override
			public int compare(Node o1, Node o2) {
				return o1.data - o2.data;
			}
		});
		Node head = null,last=null;
		for (int i = 0; i < n; i++) {
			if(a[i]!=null) {
				pq.add(a[i]);
			}
		}
		
		while(!pq.isEmpty()) {
			Node top=pq.remove();
			if(top.next!=null) {
				pq.add(top.next);
			}
			if(head==null) {
				head=top;
				last=top;
			}else {
				last.next=top;
				last=top;
			}
		}
		return head;
	}
}
