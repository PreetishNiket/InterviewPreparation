package BinaryTrees;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;


import java.util.*;

public class BinaryTreeUse {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		Scanner s = new Scanner(System.in);
//		BinaryTreeNode<Integer> root = takeInput(s);
//		printBTree(root);

		// levelWise
		BinaryTreeNode<Integer> root = takeInputLevelWise();

		printLevelWise(root);
	}

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static BinaryTreeNode<Integer> takeInputLevelWise() throws NumberFormatException, IOException {
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<BinaryTreeNode<Integer>>();
		int start = 0;

		String[] nodeDatas = br.readLine().trim().split(" ");

		if (nodeDatas.length == 1) {
			return null;
		}

		int rootData = Integer.parseInt(nodeDatas[start]);
		start += 1;

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);

		while (!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> currentNode;
			try {
				currentNode = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				return null;
			}

			int leftChildData = Integer.parseInt(nodeDatas[start]);
			start += 1;

			if (leftChildData != -1) {
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftChildData);
				currentNode.left = leftChild;
				pendingNodes.enqueue(leftChild);
			}

			int rightChildData = Integer.parseInt(nodeDatas[start]);
			start += 1;

			if (rightChildData != -1) {
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightChildData);
				currentNode.right = rightChild;
				pendingNodes.enqueue(rightChild);
			}
		}

		return root;
	}

	public static void printBTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		String toBePrinted = root.data + "";
		if (root.left != null) {
			toBePrinted += "L:" + root.left.data + ",";
		}
		if (root.right != null) {
			toBePrinted += "R:" + root.right.data;
		}
		System.out.println(toBePrinted);
		printBTree(root.left);
		printBTree(root.right);
	}

	public static BinaryTreeNode<Integer> takeInput(Scanner s) {
		int rootData;
		System.out.println("Enter Root Data");
		rootData = s.nextInt();
		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		root.left = takeInput(s);
		root.right = takeInput(s);

		return root;
	}

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<BinaryTreeNode<Integer>>();
		pendingNodes.enqueue(root);
		while (!pendingNodes.isEmpty()) {
			try {
				BinaryTreeNode<Integer> front = pendingNodes.dequeue();
				int frontData = front.data;
				int left = -1;
				int right = -1;
				if (front.left != null) {
					left = front.left.data;
					pendingNodes.enqueue(front.left);
				}
				if (front.right != null) {
					right = front.right.data;
					pendingNodes.enqueue(front.right);
				}
				System.out.println(frontData + ":" + "L:" + left + "," + "R:" + right);
			} catch (QueueEmptyException e) {
				return;
			}
		}
	}

	public static int countNodes(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int count = 1;
		count += countNodes(root.left);
		count += countNodes(root.right);
		return count;
	}

	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
		if (root == null) {
			return false;
		}
		if (root.data == x) {
			return true;
		}
		boolean left = isNodePresent(root.left, x);
		boolean right = isNodePresent(root.right, x);
		if (left == true || right == true) {
			return true;
		}
		return false;
	}

	public static int height(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int left = height(root.left);
		int right = height(root.right);
		return 1 + Math.max(left, right);
	}

	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}

		BinaryTreeNode<Integer> temp;
		temp = root.left;
		root.left = root.right;
		root.right = temp;

		mirrorBinaryTree(root.left);
		mirrorBinaryTree(root.right);
	}

	public static int diameter(BinaryTreeNode<Integer> root) {
		// Time Complexity --O(n*h),h-height of the tree
		if (root == null) {
			return 0;
		}
		int opt1 = height(root.left) + height(root.right);
		int opt2 = diameter(root.left);
		int opt3 = diameter(root.right);
		return Math.max(opt1, Math.max(opt2, opt3));
	}

	public static Pair<Integer, Integer> heightDiameter(BinaryTreeNode<Integer> root) {
		// O(n),n no of Nodes
		if (root == null) {
			Pair<Integer, Integer> output = new Pair<Integer, Integer>();
			output.first = 0;
			output.second = 0;
			return output;
		}
		Pair<Integer, Integer> lo = heightDiameter(root.left);
		Pair<Integer, Integer> ro = heightDiameter(root.right);
		int height = 1 + Math.max(lo.first, ro.first);
		int opt1 = lo.first + ro.first;
		int opt2 = lo.second;
		int opt3 = ro.second;
		int diameter = Math.max(opt1, Math.max(opt2, opt3));
		Pair<Integer, Integer> output = new Pair<Integer, Integer>();
		output.first = height;
		output.second = diameter;
		return output;
	}

	public static void preOrder(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public static void postOrder(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}

	public static void inOrder(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {

		int preStart = 0;
		int preEnd = preOrder.length - 1;
		int inStart = 0;
		int inEnd = inOrder.length - 1;

		return buildTreeHelper(preOrder, preStart, preEnd, inOrder, inStart, inEnd);

	}

	public static BinaryTreeNode<Integer> buildTreeHelper(int[] preorder, int preStart, int preEnd, int[] inorder,
			int inStart, int inEnd) {
		if (preStart > preEnd || inStart > inEnd)
			return null;

		int rootValue = preorder[preStart];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootValue);

		int k = 0;
		for (int i = 0; i < inorder.length; i++) {
			if (inorder[i] == rootValue) {
				k = i;
				break;
			}
		}

		// Becuase k is not the length, it it need to -(inStart+1) to get the length
		root.left = buildTreeHelper(preorder, preStart + 1, preStart + 1 - inStart + k - 1, inorder, inStart, k - 1);
		// postStart+k-inStart = postStart+k-(inStart+1) +1
		root.right = buildTreeHelper(preorder, preStart + 1 - inStart + k, preEnd, inorder, k + 1, inEnd);

		return root;
	}
	// Map Method Construct Tree
//	static int idx;
//
//	public static BinaryTreeNode<Integer> buildTreePostIn(int[] postOrder, int[] inOrder) {
//
//		Map<Integer, Integer> map = new HashMap<>();
//		for (int i = 0; i < inOrder.length; i++) {
//			map.put(inOrder[i], i);
//		}
//		idx = postOrder.length - 1;
//		return helper(inOrder, postOrder, 0, postOrder.length - 1, map);
//	}
//
//	private static BinaryTreeNode<Integer> helper(int[] inorder, int[] postorder, int start, int end,
//			Map<Integer, Integer> map) {
//		if (start > end) {
//			return null;
//		}
//		BinaryTreeNode<Integer> node = new BinaryTreeNode<Integer>(postorder[idx]);
//		int pos = map.get(postorder[idx--]);
//		node.right = helper(inorder, postorder, pos + 1, end, map);
//		node.left = helper(inorder, postorder, start, pos - 1, map);
//		return node;
//	}

	// Alternate

//		BinaryTreeNode<Integer> root = buildTreePostInHelper(postOrder, inOrder, 0, inOrder.length - 1, 0,
//				postOrder.length - 1);
//		return root;
//	}
//
//	private static BinaryTreeNode<Integer> buildTreePostInHelper(int[] postOrder, int[] inOrder, int inS, int inE,
//			int poS, int poE) {
//		if (inS > inE) {
//			return null;
//		}
//		int rootData = postOrder[poE];
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
//		int rootIndex = -1;
//		for (int i = inS; i <= inE; i++) {
//			if (inOrder[i] == rootData) {
//				rootIndex = i;
//				break;
//			}
//		}
//		if (rootIndex == -1) {
//			return null;
//		}
//		int leftInS = inS;
//		int leftInE = rootIndex - 1;
//
//		int leftPoS = poS;
//		int leftPoE = poS - inS + rootIndex - 1;
//
//		int rightInS = rootData + 1;
//		int rightInE = inE;
//
//		int rightPoS = poE - inE + rootIndex;
//		int rightPoE = poE - 1;
//		root.left = buildTreePostInHelper(postOrder, inOrder, leftInS, leftInE, leftPoS, leftPoE);
//		root.right = buildTreePostInHelper(postOrder, inOrder, rightInS, rightInE, rightPoS, rightPoE);
//		return root;
//	}
	public static BinaryTreeNode<Integer> buildTreePostIn(int[] postOrder, int[] inOrder) {
		int n = postOrder.length;
		int postStart = 0;
		int postEnd = n - 1;
		int inStart = 0;
		int inEnd = n - 1;
		return buildTreePostInHelper(postOrder, postStart, postEnd, inOrder, inStart, inEnd);
	}

	private static BinaryTreeNode<Integer> buildTreePostInHelper(int[] postOrder, int postStart, int postEnd,
			int[] inOrder, int inStart, int inEnd) {

		if (postStart > postEnd || inStart > inEnd) {
			return null;
		}
		int rootVal = postOrder[postEnd];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootVal);

		int k = 0;
		for (int i = inStart; i <= inEnd; i++) {
			if (rootVal == inOrder[i]) {
				k = i;
				break;
			}
		}
		root.left = buildTreePostInHelper(postOrder, postStart, postStart + k - inStart - 1, inOrder, inStart, k - 1);
		root.right = buildTreePostInHelper(postOrder, postStart + k - inStart, postEnd - 1, inOrder, k + 1, inEnd);
		return root;

	}
	public static int depth(String str)
	{
		char array[]= str.toCharArray();
		return depthHelp(array);
	}	
	static int depthHelper(char str[], int n, int i){ 
	    if(i >= n || str[i] == 'l'){
	        return 0; 
	    }
	  
	    i++; 
	    int left = depthHelper(str, n, i); 
	  
	    i++; 
	    int right = depthHelper(str, n, i); 
	  
	    return 1 + Math.max(left, right); 
	}
	public static int depthHelp(char str[]) {
	    
	    int n = 0;
	    for(int i = 0; str[i] != '\0' ; i++){
	        n++;
	    }
	    int i = 0; 
	   return depthHelper(str, n, i);
	}

	public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root) {
		
		ArrayList<LinkedListNode<Integer>> result =new ArrayList<LinkedListNode<Integer>>();
	    if(root==null) {
	    	return result;
	    }
	    	
	    Queue<BinaryTreeNode<Integer>> inputQ, outputQ, temp;
	    inputQ = new LinkedList<BinaryTreeNode<Integer>>();
	    outputQ = new LinkedList<BinaryTreeNode<Integer>>();
	    inputQ.add(root);
	    
	    LinkedListNode<Integer>ptr = new LinkedListNode<Integer>(root.data);
	    ptr.next=null;
	    result.add(ptr);
	    do
	    {
	        //nodelist<int> *list = new nodelist<int>();
	    	ArrayList<LinkedListNode<Integer>> list = new ArrayList<LinkedListNode<Integer>>();
	        while(!inputQ.isEmpty())
	        {
	            BinaryTreeNode<Integer>curr = inputQ.peek();
	            inputQ.remove();
	            if(curr.left!=null)
	            {
	                outputQ.add(curr.left);
	                ptr = new LinkedListNode<Integer>(curr.left.data);
	                list.add(ptr);
	            }
	            if(curr.right!=null)
	            {
	                outputQ.add(curr.right);
	                ptr = new LinkedListNode<Integer>(curr.right.data);
	                list.add(ptr);
	            }
	        }
	        temp = inputQ;
	        inputQ = outputQ;
	        outputQ = temp;
	        result.add(list.get(0));
	    } while(!inputQ.isEmpty());
	    return result;
	}
}
class LinkedListNode<T> 
 { 
 		T data; 
 		LinkedListNode<T> next;
 		public LinkedListNode(T data) 	
 		{
  		this.data = data; 
  	} 
  }