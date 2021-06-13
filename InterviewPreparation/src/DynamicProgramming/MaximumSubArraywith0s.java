package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class MaximumSubArraywith0s {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int[][] takeInput() throws IOException {

        String[] nm;
        nm = br.readLine().split("\\s");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
		int arr[][]=new int[n][m];

        if (n == 0) {
            return arr;
        }
        

		String[] strNums;
        for (int i = 0; i < n; ++i) {            
            strNums = br.readLine().split("\\s");
            for (int j = 0; j < m; ++j){
                arr[i][j] = Integer.parseInt(strNums[j]);
            }
            
        }

        return arr;
    }
    public static void main(String[] args) throws IOException {
//    	Scanner scan = new Scanner(System.in);
//    	int n = scan.nextInt();
//		int m = scan.nextInt();
//		int a[][] = new int[n][m];
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < m; j++) {
//				a[i][j] = scan.nextInt();
//			}
//		}

        int[][] arr = takeInput();
		System.out.println(findMaxSquareWithAllZeros(arr));
	}
	

    public static int findMaxSquareWithAllZeros(int[][] input){
        
    	int m = input.length;
             int n = input[0].length;

             int dp[][] = new int[m][n];

             for(int j=0; j<n; j++){
                 dp[0][j] = input[0][j]==0 ? 1 : 0;
             }

             for(int i=0; i<m; i++){
                 dp[i][0] = input[i][0] == 0 ? 1 : 0;
             }

             for(int i=1; i<m; i++){
                 for(int j=1; j<n ;j++){
                     dp[i][j] = input[i][j] == 1 ? 0 : 1 + Math.min(dp[i-1][j-1], 
                    		 Math.min(dp[i-1][j], dp[i][j-1]));
                 }
             }

             int maxSquareWithAllZero = 0;

             for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    if(dp[i][j]>maxSquareWithAllZero){
                        maxSquareWithAllZero = dp[i][j];
                    }
                }
             }
            return maxSquareWithAllZero;
    	
    	}

    	
}
