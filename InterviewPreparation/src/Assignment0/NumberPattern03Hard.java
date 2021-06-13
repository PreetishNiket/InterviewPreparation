package Assignment0;

import java.util.Scanner;

public class NumberPattern03Hard {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int startvalue = 1;
		for(int row=1;row<=n;row++) {
			for(int val = startvalue;val < startvalue+n;val++) {
				System.out.print(val+" ");
			}
			System.out.println();
			if (row == (n + 1) / 2) {
				if(n%2!=0) {
					startvalue=n*(n-2)+1;
				}
				else {
					startvalue=n*(n-1)+1;
				}
			}
			else if(row>(n+1)/2) {
				startvalue=startvalue-2*n;
			}
			else {
				startvalue=startvalue+2*n;
			}
		}
		scan.close();
	}

}
