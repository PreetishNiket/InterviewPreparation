package Arrays;

import java.util.Scanner;

public class WavePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while (t-- > 0) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			int a[][] = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					a[i][j] = scan.nextInt();
				}
			}
			if(a.length==0) {
				return;
			}
			for (int j = 0; j < a[0].length; j++) {
				if (j % 2 != 0) {
					for(int i=a.length-1;i>=0;i--) {
						System.out.print(a[i][j]+" ");
					}
				}else {
					for(int i=0;i<a.length;i++) {
						System.out.print(a[i][j]+" ");
					}
				}
			}
		}
		scan.close();
	}
}
