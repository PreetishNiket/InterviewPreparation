package StackAndQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class TreeNode<T> {
	T data;
	ArrayList<TreeNode<T>> children;

	TreeNode(T data){
		this.data = data;
		children = new ArrayList<TreeNode<T>>();
	}
}
public class QueueUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	static int maxLevel(TreeNode<Integer>root){
		 
		if (root == null) 
		      return 0;
		   
		ArrayList<Integer> temp= new ArrayList<Integer>();
		QueueUsingLL<TreeNode<Integer>> q=new QueueUsingLL<>();
		q.enqueue(root);
		q.enqueue(null);
		int width=0;
	    int curlevel=0;
	    int level=0;
	    while(!q.isEmpty()) {
	    	try {
				TreeNode<Integer> cur=q.front();
				q.dequeue();
				if(cur==null) {
					break;
				}
				temp.add(cur.data);
				for(int i=0;i<cur.children.size();i++){
		            q.enqueue(cur.children.get(i));
		        }
				if(q.front()==null) {
					int t=temp.size();
					if(width<t) {
						level=curlevel;
						width=t;
					}
				}
				temp.clear();
				q.dequeue();
				q.enqueue(null);
				curlevel++;
			} catch (QueueEmptyException e) {}
	    	
	    }
	    return level;
		  
	}
}
class QueueEmptyException extends Exception {
}

 class QueueUsingLL<T> {

	class Node<T> {
		T data;
		Node<T> next;
		Node(T data){
			this.data = data;
		}
	}
	
	private Node<T> head;
	private Node<T> tail;
	private int size = 0;

	public int size(){
		return size;
	}

	public boolean isEmpty(){
		if(size == 0){
			return true;
		}
		return false;
	}

	public T front() throws QueueEmptyException{
		if(size == 0){
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}

		return head.data;
	}


	public void enqueue(T element){
		Node<T> newNode = new Node<T>(element);

		if(head == null){
			head = newNode;
			tail = newNode;
		}
		else{
			tail.next = newNode;
			tail = newNode;
		}

		size++;
	}

	public T dequeue() throws QueueEmptyException{
		if(head == null){
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		if(head == tail){
			tail = null;
		}
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
}
