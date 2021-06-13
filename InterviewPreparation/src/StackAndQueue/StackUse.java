package StackAndQueue;

public class StackUse {

	public static void main(String[] args) {
		StackUsingArrays stack = new StackUsingArrays();
		for (int i = 1; i <= 5; i++) {
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());

		}
		StackUsingLL<Integer> s = new StackUsingLL<Integer>();
		for (int i = 1; i <= 5; i++) {
			s.push(i);
		}
		while (!s.isEmpty()) {
			System.out.println(s.pop());

		}

	}

}
