package Arrays;

import java.util.Scanner;

public class MoreThanNByK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		12
//		4
//		1 1 2 2 3 5 4 2 2 3 1 1 1
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		int k = scan.nextInt();
		int x = n / k;
		int count = 0;
		for (int i = 0; i < n; i++) {
			
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if(count>x) {
				System.out.println(a[i]);
			}
		}
		
	}

}
