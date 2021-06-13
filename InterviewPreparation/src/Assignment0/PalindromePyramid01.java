package Assignment0;

import java.util.Scanner;

public class PalindromePyramid01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int row=1;
		while(row<=n) {
			int cst=0;
			int aplha=65;
			while(cst<row) {
				System.out.print((char)(aplha+cst)+" ");
				cst++;
			}
			int temp=row-2;
			
			while(temp>=0) {
				System.out.print((char)(aplha+temp)+" ");
				temp--;
			}
			System.out.println();
			row++;
		}

	}

}
