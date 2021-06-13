package Arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SmallestSubarraySumGreaterX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long[] a = new long[(int) n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextLong();
		}
		long x = scan.nextLong();
		long ans = sb(a, n, x);
		System.out.println(ans);
		
	}

//	{1, 4, 45, 6, 0, 19}
//	x  =  51
	public static long sb(long a[], long n, long x) {
		long sum = 0;
		long count=0;
		Set<Long> s = new HashSet<Long>();
		for (int i = 0; i < n; i++) {
			sum += a[i];
			if (a[i] > x || sum == 0 || s.contains(sum)) {
				count++;
			}
			s.add(sum);
		}
		return count;
	}

}
