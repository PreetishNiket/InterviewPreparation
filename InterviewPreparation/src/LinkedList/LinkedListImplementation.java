package LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LinkedListImplementation {

	LinkedListNode slow;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static LinkedListNode<Integer> takeInput() throws IOException {
//		LinkedListNode<Integer> head=null,tail=null;
//		Scanner scan =new Scanner(System.in);
//		int data=scan.nextInt();
//		while(data!=-1) {
//			LinkedListNode<Integer> newNode=new LinkedListNode<Integer>(data);
//			if(head==null) {
//				head=newNode;
//				tail=newNode;
//			}else {
//				tail.next=newNode;
//				tail=newNode;
////				tail=tail.next;
//			}
//		}
//		data=scan.nextInt();
//		return head;
		LinkedListNode<Integer> head = null, tail = null;

		String[] datas = br.readLine().trim().split("\\s");

		int i = 0;
		while (i < datas.length && !datas[i].equals("-1")) {
			int data = Integer.parseInt(datas[i]);
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			i += 1;
		}

		return head;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(br.readLine().trim());

		while (t > 0) {

			LinkedListNode<Integer> head = takeInput();
//			System.out.println(lengthRec(head));
//			System.out.println();
//			int i = Integer.parseInt(br.readLine().trim());   
//            printIthNode(head, i);

//			 String[] strNums = br.readLine().split(" ");
//	            int pos = Integer.parseInt(strNums[0]);
//	            int data = Integer.parseInt(strNums[1]);
//	            LinkedListNode<Integer> ans = insertR(head , data, pos);
//	            print(ans);

			t -= 1;
		}

	}

	public static void print(LinkedListNode<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static int length(LinkedListNode<Integer> head) {
		int count = 0;
		while (head != null) {
			count++;
			head = head.next;
		}
		return count;
	}

	public static int lengthRec(LinkedListNode<Integer> head) {
		if (head == null) {
			return 0;
		}
		return 1 + lengthRec(head.next);
	}

	public static void printIthNode(LinkedListNode<Integer> head, int i) {
		LinkedListNode<Integer> temp = head;
		int count = 0;
		while (temp != null) {
			if (count == i) {
				System.out.println(temp.data);
			}
			count++;
			temp = temp.next;
		}
	}

	public static LinkedListNode<Integer> insertR(LinkedListNode<Integer> head, int data, int pos) {
		if (pos == 0) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			newNode.next = head;
			return newNode;
		}
		if (head == null) {
			return head;
		}
		head.next = insertR(head.next, data, pos - 1);
		return head;
	}

	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {

		LinkedListNode<Integer> temp = head;

		if (pos == 0) {
			head = temp.next;
			return head;
		}
		int i = 0;
		while (temp != null && i < pos - 1) {
			temp = temp.next;
			i++;
		}
		if (temp == null || temp.next == null)
			return head;

		temp.next = temp.next.next;
		return temp;
	}

	public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
		if (pos == 0) {
			return head.next;
		}
		if (head == null || head.next == null) {
			return head;
		}
		head.next = deleteNodeRec(head.next, pos - 1);
		return head;
	}

//	public static ListNode<Integer> Union(ListNode<Integer> head1, ListNode<Integer> head2) {
//		head1 = sort(head1);
//		head2 = sort(head2);
//		ListNode<Integer> head = new ListNode<Integer>(0), temp;
//		temp = head;
//		while (head1 != null && head2 != null) {
//			if (head1.data < head2.data) {
//				temp.next = head1;
//				head1 = head1.next;
//			} else if (head1.data > head2.data) {
//				temp.next = head2;
//				head2 = head2.next;
//			} else {
//				temp.next = head1;
//				head1 = head1.next;
//				head2 = head2.next;
//			}
//			temp = temp.next;
//		}
//		if (head1 != null) {
//			temp.next = head1;
//		}
//		if (head2 != null) {
//			temp.next = head2;
//		}
//		return head.next;
//	}
//
//	private static ListNode<Integer> merge2LinkedLists(ListNode<Integer> head1, ListNode<Integer> head2) {
//		ListNode<Integer> temp, head = new ListNode<Integer>(0);
//		temp = head;
//		while (head1 != null && head2 != null) {
//			if (head1.data < head2.data) {
//				head.next = head1;
//				head1 = head1.next;
//			} else {
//				head.next = head2;
//				head2 = head2.next;
//			}
//			head = head.next;
//		}
//		if (head1 == null) {
//			head.next = head2;
//		}
//		if (head2 == null) {
//			head.next = head1;
//		}
//		return temp.next;
//	}
//

	public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		if (fast != null) {
			return slow;
		}
		return slow.next;

	}

	public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1,
			LinkedListNode<Integer> head2) {

		LinkedListNode<Integer> temp, head = new LinkedListNode<Integer>(0);
		temp = head;
		while (head1 != null && head2 != null) {
			if (head1.data < head2.data) {
				head.next = head1;
				head1 = head1.next;
			} else {
				head.next = head2;
				head2 = head2.next;
			}
			head = head.next;
		}
		if (head1 == null) {
			head.next = head2;
		}
		if (head2 == null) {
			head.next = head1;
		}

		return temp.next;
	}

	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		if (head == null || head.next == null)
			return head;
		LinkedListNode<Integer> slow = head, fast = head.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		LinkedListNode<Integer> mid, head1, head2;
		mid = slow;
		head1 = head;
		head2 = mid.next;
		mid.next = null;
		head1 = mergeSort(head1);
		head2 = mergeSort(head2);
		head = mergeTwoSortedLinkedLists(head1, head2);
		return head;
	}

	public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
		if (head == null || head.next == null) {
			return head;
		}
		LinkedListNode<Integer> revTail = head.next;
		LinkedListNode<Integer> finalHead = reverseLinkedListRec(head.next);
		revTail.next = head;
		head.next = null;
		return finalHead;

	}

	public static void changeLL(LinkedListNode<Integer> head) {

		Map<Integer, Integer> mymap = new HashMap<>();

		LinkedListNode<Integer> temp = head;

		int maxNum = 0;

		while (temp != null) {
			mymap.put(temp.data, (mymap.get(temp.data) == null ? 0 : mymap.get(temp.data)) + 1);
			if (maxNum < temp.data)
				maxNum = temp.data;
			temp = temp.next;
		}

		while (head != null) {
			if (mymap.get(head.data) > 1)
				mymap.put(head.data, -1);

			else if (mymap.get(head.data) == -1)
				head.data = ++maxNum;

			head = head.next;
		}

	}

	public static LinkedListNode<Integer> sort(LinkedListNode<Integer> head) {

		if (head == null || head.next == null) {
			return head;
		}
		LinkedListNode<Integer> slow = head, fast = head.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		LinkedListNode<Integer> left = head, right = slow.next;
		slow.next = null;
		left = sort(left);
		right = sort(right);
		return merge(left, right);
	}

	public static LinkedListNode<Integer> merge(LinkedListNode<Integer> Left, LinkedListNode<Integer> Right) {
		if (Left == null)
			return Right;
		if (Right == null)
			return Left;
		LinkedListNode<Integer> h = null;
		if (Left.data < Right.data) {
			h = Left;
			h.next = merge(Left.next, Right);
		} else {
			h = Right;
			h.next = merge(Left, Right.next);
		}
		return h;
	}

}
