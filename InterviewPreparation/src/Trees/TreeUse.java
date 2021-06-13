package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeUse {

	public static void main(String[] args) {
		TreeNode<Integer> root = takeInputLevelWise();
//		printLevelWise(root);

		System.out.println(sumOfAllNode(root));

		System.out.println(getHeight(root));
	}

	static Scanner s = new Scanner(System.in);

	public static TreeNode<Integer> takeInputLevelWise() {
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();
		int rootData = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while (!pendingNodes.isEmpty()) {
			TreeNode<Integer> currentNode;
			try {
				currentNode = pendingNodes.dequeue();
				int numChild = s.nextInt();
				for (int i = 0; i < numChild; i++) {
					int currentChild = s.nextInt();
					TreeNode<Integer> childNode = new TreeNode<Integer>(currentChild);
					pendingNodes.enqueue(childNode);
					currentNode.children.add(childNode);
				}
			} catch (QueueEmptyException e) {
			}
		}
		return root;
	}

	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n) {

		if (root == null) {
			return null;
		}
		TreeNode<Integer> ans = null;
		if (root.data > n) {
			ans = root;
		}
		for (int i = 0; i < root.children.size(); i++) {
			TreeNode<Integer> childLargerNode = findNextLargerNode(root.children.get(i), n);
			if (childLargerNode != null) {
				if (ans == null || childLargerNode.data < ans.data) {
					ans = childLargerNode;
				}
			}
		}
		return ans;
	}

//	10 3 20 30 40 2 40 50 0 0 0 0 
	public static void printLevelWise(TreeNode<Integer> root) {
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);

		while (!pendingNodes.isEmpty()) {
			int n = pendingNodes.size();
			while (n > 0) {
				// Dequeue an item from queue
				// and print it
				TreeNode<Integer> p = null;
				try {
					p = pendingNodes.front();
				} catch (QueueEmptyException e) {

				}
				try {
					pendingNodes.dequeue();
				} catch (QueueEmptyException e) {

				}
				System.out.print(p.data + " ");

				for (int i = 0; i < p.children.size(); i++)
					pendingNodes.enqueue(p.children.get(i));
				n--;
			}
			System.out.println();

		}

	}

	public static int sumOfAllNode(TreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int sum = root.data;
		for (int i = 0; i < root.children.size(); i++) {
			sum = sum + sumOfAllNode(root.children.get(i));
		}
		return sum;
	}

	public static int numNodeGreater(TreeNode<Integer> root, int x) {
		if (root == null) {
			return 0;
		}
		int count = 0;
		if (root.data > x) {
			count++;
		}
		for (int i = 0; i < root.children.size(); i++) {
			count = count + numNodeGreater(root.children.get(i), x);
		}
		return count;
	}

	public static int getHeight(TreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int height = 0;
		for (int i = 0; i < root.children.size(); i++) {
			int subHeight = getHeight(root.children.get(i));
			if (subHeight > height) {
				height = subHeight;
			}
		}
		return 1 + height;
	}

	public static void printAtDepthK(TreeNode<Integer> root, int k) {
		if (k < 0) {
			return;
		}
		if (k == 0) {
			System.out.println(root.data);
			return;
		}
		for (int i = 0; i < root.children.size(); i++) {
			printAtDepthK(root.children.get(i), k - 1);
		}
	}

	public static int countLeafNodes(TreeNode<Integer> root) {

		if (root == null) {
			return 0;
		}
		if (root.children.isEmpty()) {
			return 1;
		}
		int count = 0;
		for (int i = 0; i < root.children.size(); i++) {
			count += countLeafNodes(root.children.get(i));
		}
		return count;
	}

	public static void printPreOrder(TreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		for (int i = 0; i < root.children.size(); i++) {
			printPostOrder(root.children.get(i));
		}

	}

	public static void printPostOrder(TreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		for (int i = 0; i < root.children.size(); i++) {
			printPostOrder(root.children.get(i));
		}
		System.out.print(root.data + " ");
	}

	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root) {
		if (root == null)
			return null;
		int childCount = root.children.size();
		if (childCount == 0)
			return null;

		TreeNode<Integer> largest = root, secLargest = root.children.get(0);
		if (largest.data < secLargest.data) {
			secLargest = root;
			largest = root.children.get(0);
		}
		Queue<TreeNode<Integer>> q = new LinkedList<TreeNode<Integer>>();
		q.add(root);
		while (!q.isEmpty()) {
			TreeNode<Integer> curr = q.peek();
			q.remove();
			childCount = curr.children.size();
			for (int i = 0; i < childCount; i++) {
				q.add(curr.children.get(i));
				if (curr.children.get(i).data > secLargest.data) {
					if (curr.children.get(i).data > largest.data) {
						secLargest = largest;
						largest = curr.children.get(i);
					} else {
						secLargest = curr.children.get(i);
					}
				}
			}
		}
		return secLargest;
//		TreeNode<Integer> second = null;
//
//		TreeNode<Integer> first = null;
//
//		secondLargestUtil(root, first, second);
//
//		if (second == null) {
//			return null;
//		}
//
//		return second;
	}

	private static void secondLargestUtil(TreeNode<Integer> root, TreeNode<Integer> first, TreeNode<Integer> second) {
		if (root == null)
			return;

		if (first == null)
			first = root;

		else if (root.data > first.data) {
			second = first;
			first = root;
		}

		else if (second == null) {
			if (root.data < first.data) {
				second = root;
			}
		}

		else if (root.data < first.data && root.data > second.data)
			second = root;

		int numChildren = root.children.size();

		for (int i = 0; i < numChildren; i++)
			secondLargestUtil(root.children.get(i), first, second);
	}

	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root) {
		if (root == null) {
			return null;
		}
		TreeNode<Integer> ans = root;
		int maxSum = root.data;
		for (int i = 0; i < root.children.size(); i++) {
			maxSum = maxSum + root.children.get(i).data;
		}
		for (int i = 0; i < root.children.size(); i++) {
			TreeNode<Integer> child = maxSumNode(root.children.get(i));
			int childSum = child.data;
			for (int j = 0; j < child.children.size(); j++) {
				childSum = childSum + child.children.get(j).data;
			}
			if (childSum > maxSum) {
				ans = child;
				maxSum = childSum;
			}
		}
		return ans;
	}

	public static void replaceWithDepthValue(TreeNode<Integer> root) {
		replace(root, 0);
	}

	private static void replace(TreeNode<Integer> root, int depth) {
		root.data = depth;
		for (int i = 0; i < root.children.size(); i++) {
			replace(root.children.get(i), depth + 1);
		}

	}
}
