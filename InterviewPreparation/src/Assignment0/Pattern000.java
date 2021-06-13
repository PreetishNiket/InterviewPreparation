package Assignment0;

import java.util.Scanner;

public class Pattern000 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int row=1;
		int nst=n;
		while(row<=n) {
			int cst=1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			System.out.println();
			row++;
		}

	}

}
