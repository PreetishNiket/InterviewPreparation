package Assignment0;

import java.util.Scanner;

public class Pattern004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int row=1;
		int nst=1;
		int value=1;
		while(row<=n) {
			int cst=1;
			
			while(cst<=nst) {
				System.out.print(value+" ");
				cst++;
				value++;
			}
			System.out.println();
			row++;
			nst++;
			
		}
	}

}
