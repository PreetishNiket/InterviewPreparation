package Arrays;

import java.util.Scanner;

public class LargestRowOrColumn {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0) {
			int n= scan.nextInt();
			int m=scan.nextInt();
			int a[][] = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					a[i][j] = scan.nextInt();
				}
			}
			if(a.length==0) {
				System.out.println("row"+" "+0+" "+Integer.MIN_VALUE);
			}else {
				int max=Integer.MIN_VALUE;
				int index=0;
				String s="";
				for (int i = 0; i < a.length; i++) {
					int sumRow = 0;
					for (int j = 0; j < a[i].length; j++) {
						sumRow = sumRow + a[i][j];
					}
					if(sumRow>max) {
						max=sumRow;
						index=i;
						s="row";
					}
				}
				for (int i = 0; i < a[0].length; i++) {
					int sumCol = 0;
					for (int j = 0; j < a.length; j++) {
						sumCol = sumCol + a[j][i];
					}
					if(sumCol>max) {
						max=sumCol;
						index=i;
						s="column";
					}
				}
				
				System.out.println(s+" "+index+" "+max);
			}
			
		}

	}

}
