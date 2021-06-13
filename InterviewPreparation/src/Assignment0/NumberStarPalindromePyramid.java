package Assignment0;

import java.util.Scanner;

public class NumberStarPalindromePyramid {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int row = 1;
		int nsp = n + 3;
		int nst = 1;
		while (row <= n) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("*");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {

				if (cst % 2 == 0) {
					System.out.print("*");

				}
				if (cst % 2 != 0) {
					System.out.print(row);

				}
				cst++;

			}
			csp = 1;
			while (csp <= nsp) {
				System.out.print("*");
				csp++;
			}
			System.out.println();
			row++;
			nsp--;
			nst = nst + 2;
		}

	}

}
