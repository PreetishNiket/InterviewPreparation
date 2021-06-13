package Assignment0;

import java.util.Scanner;

public class Pattern001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int row=1;
		int value=1;
		while(row<=n) {
			int cst=1;
			while(cst<=n) {
				System.out.print(value);
				cst++;
			}
			System.out.println();
			row++;
			value++;
		}
	}

}
