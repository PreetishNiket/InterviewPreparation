package Assignment0;

import java.util.Scanner;

public class HollowRectanglePattern01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int nst = n + 2;
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= nst; c++) {
				if(r==1||r==n||c==1||c==nst) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
