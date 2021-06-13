package Assignment0;

import java.util.Scanner;

public class NumberPattern01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int row=1;
		int nsp=n-1;
		while(row<=n) {
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst=1;
			int value=row;
			while(cst<=row) {
				System.out.print(value);
				cst++;
				value++;
			}
			System.out.println();
			row++;
			nsp--;
		}
		scan.close();
	}
}
