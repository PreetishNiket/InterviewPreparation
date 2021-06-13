package Test;

import java.util.Scanner;

public class FairWorlLoad {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int N=scan.nextInt();
		int a[]=new int[N];
		for(int j=0;j<N;j++) {
			a[j]=scan.nextInt();
		}
		int workers=scan.nextInt();
		System.out.println(findMax(a,N,workers));
		
	}
	public static int sum(int arr[], int from, int to)
	{
	    int total = 0;
	    for (int i = from; i <= to; i++)
	        total += arr[i];
	    return total;
	}
	  
	public static int findMax(int arr[], int n, int k)
	{
	   
	    int dp[][] = new int[k+1][n+1];
	    
	    int sum[] = new int[n+1];
	    for (int i = 1; i <= n; i++)
	      sum[i] = sum[i-1] + arr[i-1];
	      
	    for (int i = 1; i <= n; i++)
	      dp[1][i] = sum[i];
	  
	    for (int i = 1; i <= k; i++)
	        dp[i][1] = arr[0];
	  
	    for (int i = 2; i <= k; i++) {
	        for (int j = 2; j <= n; j++) {
	  
	            int best = Integer.MAX_VALUE;
	  
	            for (int p = 1; p <= j; p++)
	                best = Math.min(best, Math.max(dp[i - 1][p],
	                		sum[j] - sum[p]));      
	  
	            dp[i][j] = best;
	        }
	    }
	    return dp[k][n];
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static int getMostWork(int[] folders, int workers) {
//
//		int[][] times = new int[workers][folders.length];
//
//		for (int f = 0; f < folders.length; f++) {
//			times[0][f] = sumSections(0, f + 1, folders);
//		}
//
//		for (int w = 1; w < workers; w++) {
//			for (int f = 0; f < folders.length; f++) {
//
//				if (f < w) {
//					times[w][f] = -1;
//
//				} else {
//					int minCompletionTime = Integer.MAX_VALUE;
//
//					for (int d = w; d <= f; d++) {
//
//						int completionTime = Math.max(times[w - 1][d - 1], sumSections(d, f + 1, folders));
//
//						minCompletionTime = Math.min(minCompletionTime, completionTime);
//					}
//
//					times[w][f] = minCompletionTime;
//				}
//			}
//		}
//		return times[workers - 1][folders.length - 1];
//	}
//
//	private static int sumSections(int s, int e, int[] nums) {
//		int sum = 0;
//
//		for (int x = s; x < e; x++) {
//			sum += nums[x];
//		}
//
//		return sum;
//	}
}
