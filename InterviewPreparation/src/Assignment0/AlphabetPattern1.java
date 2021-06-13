package Assignment0;

import java.util.Scanner;

public class AlphabetPattern1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int row=1;
		int value=64;
		while(row<=n) {
			int cst=1;
			while(cst<=n) {
				System.out.print((char)(value+cst));
//				value++;
				cst++;
			}
			System.out.println();
			row++;
			value++;
		}
	}

}
