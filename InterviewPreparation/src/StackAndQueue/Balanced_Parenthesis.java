package StackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Balanced_Parenthesis {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		String expression = br.readLine().trim();
		System.out.println(isBalanced(expression));

	}

	public static boolean isBalanced(String expression) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < expression.length(); i++) {
			char x = expression.charAt(i);

			if (x == '(' || x == '[' || x == '{') {
				stack.push(x);
				continue;
			}
			if (stack.isEmpty()) {
				return false;
			}

			char check;

			switch (x) {
			
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}
		return stack.isEmpty();
	}
}
