//package StackAndQueue;
//
//public class QueueUsingLL<T> {
//
//	private Node<T> front;
//	private Node<T> rear;
//	private int size;
//
//	public QueueUsingLL() {
//		front = null;
//		rear = null;
//		size = 0;
//	}
//
//	public int getSize() {
//		return size;
//	}
//
//	public boolean isEmpty() {
//		return (size == 0);
//	}
//
//	public void enqueue(T data) {
//		Node<T> newNode = new Node<T>(data);
//		if (rear == null) {
//			front = newNode;
//			rear = newNode;
//		} else {
//			rear.next = newNode;
//			rear = newNode;
//		}
//		size++;
//	}
//
//	public T dequeue() {
//		if (size == 0) {
//			// Queue Is Empty
//		}
//		T temp = front.data;
//		front = front.next;
//		if (size == 1) {
//			rear = null;
//		}
//		size--;
//		return temp;
//	}
//
//	public T front() {
//		if (size == 0) {
//			// Queue is Empty
//		}
//		return front.data;
//	}
//
//}
