package Assignment0;

import java.util.Scanner;

public class HalfPyramidStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int row=1;
		int nst=1;
		while(row<=n) {
			int cst=1;
			while(cst<=nst){
				System.out.print("*"+" ");
				cst++;
			}
			System.out.println();
			row++;
			nst++;
		}
	}

}
