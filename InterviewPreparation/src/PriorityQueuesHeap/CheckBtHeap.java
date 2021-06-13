package PriorityQueuesHeap;

class BTNode {
	int data;
	BTNode left, right;

	BTNode(int d) {
		data = d;
		left = right = null;
	}
}

public class CheckBtHeap {

	public static boolean isHeap(BTNode root) {

		int value = size(root);

		return isHeap(root, 0, value);
	}

	private static int size(BTNode root) {
		if (root == null) {
			return 0;
		}
		return 1 + size(root.left) + size(root.right);
	}

	public static boolean isHeap(BTNode root, int index, int size) {
		if (root == null) {
			return true;
		}
		if (index >= size) {
			return false;
		}

		if ((root.left != null && root.data <= root.left.data)
				|| (root.right != null && root.data <= root.right.data)) {
			return false;
		}

		return isHeap(root.left, 2 * index + 1, size) && isHeap(root.right, 2 * index + 2, size);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
