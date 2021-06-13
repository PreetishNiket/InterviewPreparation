package DynamicProgramming;


public class Rand1 {
	public static long balancedBTs(int h){		
		int mod = (int)Math.pow(10, 9) + 7;
		return balancedBTs(h, mod);
	}
	
	 public static long balancedBTs(int h, int mod){		
			
			if(h == 0 || h == 1){
				return 1;
			}
			
			long x =balancedBTs( h - 1);
			long y = balancedBTs(h - 2);
			long res1 = (long)x * x;
			long res2 = (long)x * y * 2; 
			int value1 = (int)(res1 % mod);
			int value2 = (int)(res2 % mod);
			return  (value1 + value2) % mod;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int h = 3;
			long ans = balancedBTs(h);
			System.out.println(ans);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	static final int mod = 1000000007;
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		 string num;
//		    while(1){
//		        cin >> num;
//		        if(num == "0") break;
//		        int n = num.length();
//		        cout << count_code(num, n) << endl;
//		    }
//		    return 0;
//	}
//	#define mod 1000000007
//	typedef long long int ll;
//	ll count_code(string num, int length){
//	    ll* output = new ll[5001];
//	    output[0] = 1;
//	    for(int i=1;i<length;i++){
//	        int t = (num[i-1]-'0')*10 + (num[i]-'0');
//	        if(num[i] != '0') output[i] = output[i-1];
//	        if(t>=10 && t<=26 && i>1) output[i] += output[i-2];
//	        else if(t>=10 && t<=26) output[i]++;
//	        output[i] = output[i] % mod;
//	    }
//	    return output[length-1];
//	}
//	public static String findWinner(int n, int x, int y)
//	{
//		// Write your code here .
//		 Vector<Integer> dp = new Vector<Integer>(n+1,-1);
//		
//	    int ans=BeerusWin(dp,n,x,y);
//	    
//	    if(ans==1)
//	        return "Beerus";
//	    else
//	    	  return "Whis";
//	}
//	public static int BeerusWin(Vector<Integer> dp,int n,int x,int y){
//	    if(n==1 || n==x || n==y)
//	        return 1;
//	    if(dp.get(n)!=-1)
//	        return dp.get(n);
//	    
//	    int ans;
//	    
//	    if(n>x && n>y)
//	        ans=!(!(BeerusWin(dp,n-1,x,y) || BeerusWin(dp,n-x,x,y) || !BeerusWin(dp,n-y,x,y)));
//	    else if(n>x && n<y)
//	        ans=!BeerusWin(dp,n-1,x,y) || !BeerusWin(dp,n-x,x,y);
//	    else if(n<x && n>y)
//	        ans=!BeerusWin(dp,n-1,x,y) || !BeerusWin(dp,n-y,x,y);
//	    else
//	        ans=!BeerusWin(dp,n-1,x,y);
//	   
//	   dp.set(n,ans);
//	    return dp.get(n);
//	}
	      
}
