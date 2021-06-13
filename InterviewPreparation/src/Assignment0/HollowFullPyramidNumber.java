package Assignment0;

import java.util.Scanner;

public class HollowFullPyramidNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int row=1;
		int nst = 1 ;
		int nsp=n;
		while(row<=n) {
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst=1;
			while(cst<=nst) {
				if(row==1||row==n||cst==1||cst==nst) {
					System.out.print(cst+" ");
				}
				else {
					System.out.print("  ");
				}
				cst++;
			}
			System.out.println();
			row++;
			nsp--;
			nst++;
		}
		
		
	}

}
