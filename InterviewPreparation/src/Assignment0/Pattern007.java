package Assignment0;

import java.util.Scanner;

public class Pattern007 {
//Number Pattern Hard
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int row = 1;
		int start = 1;
		while (row <= n) {
			int val = start;
			while (val < start + n) {
				System.out.print(val + "  ");
				val++;
			}
			System.out.println();
			if (row == (n + 1) / 2) {
				
				if (n % 2 != 0) {
					
					start = n * (n - 2) + 1;
					
				} else {
					
					start = n * (n - 1) + 1;
					
				}
			} else if (row > (n + 1) / 2) {
				
				start = start - 2 * n;
				
			} else {
				
				start = start + 2 * n;
				
			}
			row++;
		}
	}
}
