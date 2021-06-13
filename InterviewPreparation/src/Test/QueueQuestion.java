package Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueQuestion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		Queue<String> q = new LinkedList<String>();

		for (int i = 0; i < N; i++) {
			String s = scan.next();
			q.add(s);
		}

		int M = scan.nextInt();
		while (M-- > 0) {
			char op = scan.next().charAt(0);

			switch (op) {
			case 'A':
				q.remove();
				break;
			case 'B':
				String x = scan.next();
				String y = scan.next();
				break;
			case 'C':
					
			}

		}
	}

}
