package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class Questions {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		evaluatePostfix(input);
	}

	public static void evaluatePostfix(String exp1) {

		String exp = InfixToPostfix(exp1);
		Stack<Integer> stack1 = new Stack<>();

		for (int i = 0; i < exp.length(); i++) {
			char c = exp.charAt(i);

			if (Character.isDigit(c))
				stack1.push(c - '0');

			else {
				int val1 = stack1.pop();
				int val2 = stack1.pop();

				switch (c) {
				case '+':
					stack1.push(val2 + val1);
					break;

				case '-':
					stack1.push(val2 - val1);
					break;

				case '/':
					stack1.push(val2 / val1);
					break;

				case '*':
					stack1.push(val2 * val1);
					break;
				}
			}
		}
		System.out.println(exp);
		System.out.println(stack1.pop());

	}

	public static int Prec(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;

		case '*':
		case '/':
			return 2;

		case '^':
			return 3;
		}
		return -1;
	}

	public static String InfixToPostfix(String exp) {
		String result = new String("");

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < exp.length(); ++i) {
			char c = exp.charAt(i);

			if (Character.isLetterOrDigit(c)) {
				result += c;
			} else if (c == '(') {
				stack.push(c);
			} else if (c == ')') {
				while (!stack.isEmpty() && stack.peek() != '(')
					result += stack.pop();

				stack.pop();
			} else {
				while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())) {

					result += stack.pop();
				}
				stack.push(c);
			}

		}
		while (!stack.isEmpty()) {
			if (stack.peek() == '(')
				continue;
			result += stack.pop();
		}
		return result;
	}

	public static int countBracketReversals(String input) {

		int len = input.length();

		if (len % 2 != 0)
			return -1;

		Stack<Character> s = new Stack<>();

		for (int i = 0; i < len; i++) {
			char c = input.charAt(i);
			if (c == '}' && !s.empty()) {
				if (s.peek() == '{')
					s.pop();
				else
					s.push(c);
			} else
				s.push(c);
		}

		int red_len = s.size();
		int n = 0;
		while (!s.empty() && s.peek() == '{') {
			s.pop();
			n++;
		}
		return (red_len / 2 + n % 2);
	}

	public static int[] stockSpan(int[] price) {
		Stack<Integer> stk = new Stack<>();
		int n = price.length;
		int[] output = new int[n];
		stk.push(0);
		output[0] = 1;
		for (int i = 1; i < n; ++i) {
			while (!stk.isEmpty() && price[stk.peek()] < price[i]) {
				stk.pop();
			}
			if (stk.isEmpty()) {
				output[i] = i + 1;
			} else {
				output[i] = i - stk.peek();
			}
			stk.push(i);
		}
		return output;
	}
}
