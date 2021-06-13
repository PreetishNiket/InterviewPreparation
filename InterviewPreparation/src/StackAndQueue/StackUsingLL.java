package StackAndQueue;

public class StackUsingLL<T> {

	Node<T> head;
	int size;

	public StackUsingLL() {
		head = null;
		size = 0;
	}

	public int getSize() {
		return size;

	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public T top() {
		if (size == 0) {
			// StackIsEmpty
		}
		return head.data;
	}

	public void push(T element) {
		Node<T> newNode = new Node<T>(element);
		newNode.next = head;
		head = newNode;
		size++;
	}

	public T pop() {
		if (size == 0) {
			// StackIsEmpty
		}
		T tempData = head.data;
		head = head.next;
		size--;
		return tempData;
	}

}
