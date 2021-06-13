package BinarySearchTrees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BinarySearchTreeUse {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
	static StringTokenizer st;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BinaryTreeNode<Integer> root = takeInput();
		int k = Integer.parseInt(br.readLine());
		System.out.println(searchInBST(root, k));
	}

	public static BinaryTreeNode<Integer> takeInput() throws IOException {
		st = new StringTokenizer(br.readLine());
		int rootData = Integer.parseInt(st.nextToken());
		if (rootData == -1) {
			return null;
		}
		Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.add(root);

		while (!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> currentNode;
			try {
				currentNode = pendingNodes.remove();
			} catch (Exception e) {
				return null;
			}
			int leftChildData = Integer.parseInt(st.nextToken());
			if (leftChildData != -1) {
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftChildData);
				currentNode.left = leftChild;
				pendingNodes.add(leftChild);
			}
			int rightChildData = Integer.parseInt(st.nextToken());
			if (rightChildData != -1) {
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightChildData);
				currentNode.right = rightChild;
				pendingNodes.add(rightChild);
			}
		}
		return root;
	}

	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
		if (root == null) {
			return false;
		}
		if (root.data == k) {
			return true;
		}
		if (root.data < k) {
			return searchInBST(root.right, k);
		} else {
			return searchInBST(root.left, k);
		}
	}

	public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root, int k1, int k2) {
		if (root == null) {
			return;
		}
		if (root.data >= k1 && root.data <= k2) {

			elementsInRangeK1K2(root.left, k1, k2);
			System.out.print(root.data + " ");
			elementsInRangeK1K2(root.right, k1, k2);

		} else if (root.data < k1) {
			elementsInRangeK1K2(root.right, k1, k2);
		} else if (root.data > k2) {
			elementsInRangeK1K2(root.left, k1, k2);
		}
	}

	public static boolean isBST(BinaryTreeNode<Integer> root) {
		isBSTsmall(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		Pair<Boolean, Pair<Integer, Integer>> ans = isBSTBetter(root);
		return ans.first;
	}

	private static Pair<Boolean, Pair<Integer, Integer>> isBSTBetter(BinaryTreeNode<Integer> root) {
		if (root == null) {
			Pair<Boolean, Pair<Integer, Integer>> output = new Pair<Boolean, Pair<Integer, Integer>>();
			output.first = true;
			output.second = new Pair<Integer, Integer>();
			output.second.first = Integer.MAX_VALUE;
			output.second.second = Integer.MIN_VALUE;
			return output;
		}
		Pair<Boolean, Pair<Integer, Integer>> LeftOutput = isBSTBetter(root.left);
		Pair<Boolean, Pair<Integer, Integer>> RightOutput = isBSTBetter(root.right);
		int min = Math.min(root.data, Math.min(LeftOutput.second.first, RightOutput.second.first));
		int max = Math.max(root.data, Math.max(LeftOutput.second.second, RightOutput.second.second));
		boolean isBst = (root.data > LeftOutput.second.second) && (root.data <= RightOutput.second.second)
				&& LeftOutput.first && RightOutput.first;
		Pair<Boolean, Pair<Integer, Integer>> output = new Pair<Boolean, Pair<Integer, Integer>>();
		output.first = isBst;
		output.second = new Pair<Integer, Integer>();
		output.second.first = min;
		output.second.second = max;
		return output;
	}

	private static boolean isBSTsmall(BinaryTreeNode<Integer> root, int min, int max) {
		if (root == null) {
			return true;
		}
		if (root.data < min || root.data > max) {
			return false;
		}
		boolean isLeftOk = isBSTsmall(root.left, min, root.data - 1);
		boolean isRightOk = isBSTsmall(root.right, root.data, max);
		return isLeftOk && isRightOk;
	}

	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n) {
		return arrayToBst(arr, 0, n - 1);
	}

	private static BinaryTreeNode<Integer> arrayToBst(int[] arr, int si, int ei) {
		BinaryTreeNode<Integer> root = null;
		if (si > ei) {
			return root;
		}
		int mid = (si + ei) / 2;
		root = new BinaryTreeNode<Integer>(arr[mid]);
		root.left = arrayToBst(arr, si, mid - 1);
		root.right = arrayToBst(arr, mid + 1, ei);

		return root;
	}

	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
		Pair<LinkedListNode<Integer>, LinkedListNode<Integer>> ans = helper(root);
		return ans.first;

	}

	private static Pair<LinkedListNode<Integer>, LinkedListNode<Integer>> helper(BinaryTreeNode<Integer> root) {
		if (root == null) {
			Pair<LinkedListNode<Integer>, LinkedListNode<Integer>> output = new Pair<LinkedListNode<Integer>, LinkedListNode<Integer>>();
			output.first = null;
			output.second = null;
			return output;
		}
		LinkedListNode<Integer> rootHead = new LinkedListNode<Integer>(root.data);

		Pair<LinkedListNode<Integer>, LinkedListNode<Integer>> LeftOutput = helper(root.left);
		Pair<LinkedListNode<Integer>, LinkedListNode<Integer>> RightOutput = helper(root.right);
		if (LeftOutput.first == null && LeftOutput.second == null) {
			Pair<LinkedListNode<Integer>, LinkedListNode<Integer>> ans = new Pair<LinkedListNode<Integer>, LinkedListNode<Integer>>();
			ans.first = rootHead;
			ans.second = RightOutput.second;
			return ans;
		} else {
			LeftOutput.second.next = rootHead;
			rootHead.next = RightOutput.first;
		}
		Pair<LinkedListNode<Integer>, LinkedListNode<Integer>> output = new Pair<LinkedListNode<Integer>, LinkedListNode<Integer>>();
		output.first = LeftOutput.first;
		output.second = RightOutput.second;
		return output;
	}

//		    Node<int>* temp=new Node<int>(root->data);
//		    
//		    if(pL.first==NULL && pL.second==NULL){
//		        pair <Node<int>*,Node<int>*> pan=make_pair(temp,temp);
//		        return pan;
//		    }
//		    else{
//		        pL.second->next=temp;
//		        temp->next=pR.first;
//		    }
//		    
//		    pair <Node<int>*,Node<int>*> pans;
//		    pans.first=pL.first;
//		    pans.second=pR.second;
//		    
//		    return pans;
//		    
//		}
//	LinkedListNode<Integer> rootHead = null;
//	LinkedListNode<Integer> leftHead = null;
//	LinkedListNode<Integer> rightHead = null;
//	if (root == null) {
//		return rootHead;
//	}
//	rootHead = new LinkedListNode<Integer>(root.data);
//	if (root.left == null) {
//        return rootHead;
//		
//	}
//    if (root.left == null) {
//        return leftHead;
//		
//	}
//    leftHead = constructLinkedList(root.left);
//    LinkedListNode<Integer> temp=leftHead;
//    while(temp.next!=null) {
//    	temp=temp.next;
//    }
//    rightHead = constructLinkedList(root.right);
//	temp.next = rootHead;
//	rootHead.next = rightHead;
//
//	return leftHead;
	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data) {
		if (root == null) {
			return null;
		}
		if (root.data == data) {
			ArrayList<Integer> output = new ArrayList<Integer>();
			output.add(root.data);
			return output;
		}
		if (root.data > data) {
			ArrayList<Integer> leftOutput = getPath(root.left, data);
			if(leftOutput!=null) {
				leftOutput.add(root.data);
				return leftOutput;
			}
			else {
				return null;
			}
		}
		else {
			ArrayList<Integer> rightOutput = getPath(root.right, data);
			if(rightOutput!=null) {
				rightOutput.add(root.data);
				return rightOutput;
			}
			else {
				return null;
			}
		}
	}
}
