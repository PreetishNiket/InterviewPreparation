package Assignment0;

import java.util.Scanner;

public class TrianglePattern {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int row = 1;
		int nsp = n - 1;
		int nst = 1;
		while (row <= n) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 1;
			int value = row;
			while (cst <= nst) {
				System.out.print(value);
				value++;
				cst++;
			}
			cst = 1;
			value = 2 * row - 2;
			while (cst < nst) {
				System.out.print(value);
				value--;
				cst++;
			}
			System.out.println();
			row++;
			nsp--;
			nst++;
		}
		scan.close();
	}
}
