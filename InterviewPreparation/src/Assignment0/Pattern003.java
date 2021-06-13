package Assignment0;

import java.util.Scanner;

public class Pattern003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int row=1;
		while(row<=n) {
			int cst=n;
			while(cst>=1) {
				System.out.print(cst);
				cst--;
			}
			System.out.println();
			row++;
		}
	}

}
