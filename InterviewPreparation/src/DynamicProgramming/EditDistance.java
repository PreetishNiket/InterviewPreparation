package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EditDistance {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String str1 = br.readLine().trim();
		String str2 = br.readLine().trim();
		System.out.println(editDistance(str1, str2));
		System.out.println(editDistanceDP(str1, str2));

	}

	public static int editDistance(String s1, String s2) {
		return editDist(s1, s2, s1.length(), s2.length());
	}
	public static int editDistanceDP(String s, String t) {
		return editDistDP(s, t, s.length(), t.length());
    }

	public static int min(int x, int y, int z) {
		if (x <= y && x <= z)
			return x;
		if (y <= x && y <= z)
			return y;
		else
			return z;
	}

	 private static int editDistDP(String str1, String str2, int m, int n) {

		int dp[][] = new int[m + 1][n + 1];
		
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {

				if (i == 0) {
					dp[i][j] = j; 
				}
				else if (j == 0) {
					dp[i][j] = i; 
				}
				else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1];
				}
				else {
					dp[i][j] = 1 + min(dp[i][j - 1],
							dp[i - 1][j],
							dp[i - 1][j - 1]);
				}
			}
		}

		return dp[m][n];
	}

	public static int editDist(String str1, String str2, int m, int n) {

		if (m == 0) {
			return n;
		}
		if (n == 0) {
			return m;
		}
		if (str1.charAt(m - 1) == str2.charAt(n - 1)) {
			return editDist(str1, str2, m - 1, n - 1);
		}
		return 1 + min(editDist(str1, str2, m, n - 1), editDist(str1, str2, m - 1, n),
				editDist(str1, str2, m - 1, n - 1));
	}

}
