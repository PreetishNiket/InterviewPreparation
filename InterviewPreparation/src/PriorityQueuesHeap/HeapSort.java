package PriorityQueuesHeap;

public class HeapSort {

	public static void main(String[] args) {
		int a[] = { 5, 1, 9, 2, 0, 6 };
		for (int i = 0; i < a.length; i++) {
			insertIntoVirtualHeap(a, i);
		}

		for (int i = 0; i < a.length; i++) {
			a[a.length - 1 - i] = removeMinfromHeap(a, a.length - i);
		}
	}

	private static void insertIntoVirtualHeap(int[] a, int i) {

		int childIndex = i;
		int parentIndex = (childIndex - 1) / 2;
		while (childIndex > 0) {
			if (a[childIndex] < a[parentIndex]) {
				// swap
				int temp = a[childIndex];
				a[childIndex] = a[parentIndex];
				a[parentIndex] = temp;
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			} else {
				return;
			}
		}
	}

	private static int removeMinfromHeap(int[] a, int heapSize) {
		int temp = a[0];
		a[0] = a[heapSize - 1];
		heapSize--;
		int index = 0;
		int leftChildIndex = 2 * index + 1;
		int rightChildIndex = 2 * index + 2;
		while (leftChildIndex < heapSize) {
			int minIndex = index;
			if (a[leftChildIndex] < a[minIndex]) {
				minIndex = leftChildIndex;
			}
			if (a[rightChildIndex] < a[minIndex]) {
				minIndex = rightChildIndex;
			}

			if (minIndex == index) {
				break;
			} else {//swap
				int temp1=a[minIndex];
				a[minIndex]=a[index];
				a[index]=temp1;
				index=minIndex;
				leftChildIndex = 2 * index + 1;
				rightChildIndex = 2 * index + 2;
			}
		}
		return temp;
	}

}
