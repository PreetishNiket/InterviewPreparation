package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixChainMemoised {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int[] takeInput() throws IOException {
		int size = Integer.parseInt(br.readLine().trim());
		int[] input = new int[size + 1];

		if (size == 0) {
			return input;
		}

		String[] strNums;
		strNums = br.readLine().split("\\s");

		for (int i = 0; i < size + 1; ++i) {
			input[i] = Integer.parseInt(strNums[i]);
		}

		return input;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		int[] arr = takeInput();
		System.out.print(mcm(arr));
	}

	public static int mcm(int[] p) {
		int n = p.length;
		
		return mcm(p, n);
	}
	
	public static int mcm(int p[], int n)
    {
        int m[][] = new int[n][n];
 
        int i, j, k, L, q;
 
        for (i = 1; i < n; i++) {
            m[i][i] = 0;
        }
        for (L = 2; L < n; L++)
        {
            for (i = 1; i < n - L + 1; i++)
            {
                j = i + L - 1;
                if (j == n) {
                    continue;
                }
                m[i][j] = Integer.MAX_VALUE;
                for (k = i; k <= j - 1; k++)
                {
                    q = m[i][k] + m[k + 1][j]
                        + p[i - 1] * p[k] * p[j];
                    if (q < m[i][j]) {
                        m[i][j] = q;
                    }
                }
            }
        }
 
        return m[1][n - 1];
    }

//	public static int[][] dp = new int[100][100];
//
//	private static int mcm(int[] p, int i, int j) {
//		if (i == j) {
//			return 0;
//		}
//		if (dp[i][j] != -1) {
//			return dp[i][j];
//		}
//		dp[i][j] = Integer.MAX_VALUE;
//		for (int k = i; k < j; k++) {
//			dp[i][j] = Math.min(dp[i][j], mcm(p, i, k) + mcm(p, k + 1, j) + p[i - 1] * p[k] * p[j]);
//		}
//		return dp[i][j];
//	}

}
