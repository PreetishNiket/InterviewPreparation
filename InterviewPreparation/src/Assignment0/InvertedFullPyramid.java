package Assignment0;

import java.util.Scanner;

public class InvertedFullPyramid {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int row=1;
		int nst=n;
		int nsp=0;
		while(row<=n) {
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst=1;
			while(cst<=nst) {
				System.out.print("*"+" ");
				cst++;
			}
			System.out.println();
			row++;
			nst--;
			nsp++;
		}

	}

}
