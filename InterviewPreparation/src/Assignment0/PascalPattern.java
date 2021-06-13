package Assignment0;

import java.util.Scanner;

public class PascalPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int row=1;
		int nst=1;
		while(row<=n) {
			int cst=1;
			int value=1;
			while(cst<=nst) {
				value=(value*(row-cst))/cst+1;
				System.out.print(value);
				
				cst++;
			}
			System.out.println();
			row++;
			nst++;
		}
	}

}
