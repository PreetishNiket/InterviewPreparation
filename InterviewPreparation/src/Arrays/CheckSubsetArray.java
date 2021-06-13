package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class CheckSubsetArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextInt();
		long m = scan.nextInt();
		long[] a = new long[(int) n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextLong();
		}
		long[] b = new long[(int) m];
		for (int i = 0; i < m; i++) {
			b[i] = scan.nextLong();
		}
		System.out.println(isSubset(a, b, n, m));
	}

	public static String isSubset(long a1[], long a2[], long n, long m) {
		String y ="Yes";
		String o ="No";
		HashSet<Long> h =new HashSet<Long>();
		for(int i=0;i<n;i++) {
			if(!h.contains(a1[i])) {
				h.add(a1[i]);
			}
		}
		for(int i=0;i<m;i++) {
			if(!h.contains(a2[i])) {
				return o;
			}
		}
		return y;
	}

}
