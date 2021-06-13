package DynamicProgramming;

import java.util.Scanner;

public class MaxSumRectangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        	int n = scan.nextInt();
			int m = scan.nextInt();
			int a[][] = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					a[i][j] = scan.nextInt();
				}
			}
         System.out.println(maxSumRectangle(a));
	}
    private static int maxSumRectangle(int[][] mat)
    {
        int m = mat.length;
        int n = mat[0].length;
        int preSum[][] = new int[m + 1][n];
 
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                preSum[i + 1][j] =
                   preSum[i][j] + mat[i][j];
            }
        }
 
        int maxSum = -1;
        int minSum = Integer.MIN_VALUE;
        for (int rowStart = 0;rowStart < m;rowStart++)
        {
            for (int row = rowStart; row < m; row++)
            {
                int sum = 0;
                for (int col = 0; col < n; col++)
                {
                    sum += preSum[row + 1][col]- preSum[rowStart][col];
                    if (sum < 0) {
                        if (minSum < sum) {
                            minSum = sum;
                        }
                        sum = 0;
                    }
                    else if (maxSum < sum)
                    {
                        maxSum = sum;
                    }
                }
            }
        }

        return maxSum == -1 ? minSum : maxSum;
    }
}
