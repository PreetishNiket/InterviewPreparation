package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Rand {
	static final int MOD = 1000001;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);  
			int N = sc.nextInt();
			int arr[] = new int[N+1];
			for(int i = 0; i < N; i++)
				arr[i] = sc.nextInt();
			System.out.println(numOfAP(arr, N));
	}
	public static int numOfAP(int arr[], int N){
		int mina=Integer.MAX_VALUE,maxa=Integer.MIN_VALUE;
	    
	    for(int i=0;i<N;i++){
	        mina=Math.min(mina,arr[i]);
	        maxa=Math.max(maxa,arr[i]);
	    }
	    int count=N+1;
	    int dp[]=new int[N]; 
	    int sum[]=new int [MOD];
	    for(int d=mina-maxa;d<=maxa-mina;d++){
	        
	        
	        Arrays.fill(sum, 0);
	        
	        sum[arr[0]]=1;
	        for(int i=1;i<N;i++){
	            dp[i]=1;
	            
	            if(arr[i]-d>=1 && arr[i]-d<=100000)
	                dp[i]=(dp[i]+sum[arr[i]-d])%MOD;
	            
	            count=(count+dp[i]-1)%MOD;
	            
	            sum[arr[i]]=(sum[arr[i]]+dp[i])%MOD;
	        }
	    }
	    return count;
	}

}
