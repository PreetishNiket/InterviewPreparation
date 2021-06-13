package Assignment0;

import java.util.Scanner;

public class ArrowPattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int row=1;
		int nst=1;
		int nsp=0;
		while(row<=n) {
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst=1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			row++;
			if(row<=n/2+1)
			{
				nsp++;
				nst++;
			}
			else {
				nsp--;
				nst--;
			}
			
		}
		scan.close();
	}

}
