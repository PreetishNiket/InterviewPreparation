package Assignment0;

import java.util.Scanner;

public class NumberPattern02 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int row=1;
		int nst=1;
		int nsp=2*n-2;
		while(row<=n) {
			int cst=1;
			int value=cst;
			while(cst<=nst) {
				System.out.print(value);
				cst++;
				value++;
			}
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			cst=1;
			int val=row;
			while(cst<=nst) {
				System.out.print(val);
				cst++;
				val--;
			}
			System.out.println();
			row++;
			nst++;
			nsp=nsp-2;
		}
		scan.close();
	}
}
