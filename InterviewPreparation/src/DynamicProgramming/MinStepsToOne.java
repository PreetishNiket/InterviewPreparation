package DynamicProgramming;

public class MinStepsToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =1000;
		System.out.println(countStepsDp(n));
		System.out.println(countStepsM(n));
		System.out.println(countSteps(n));		
	}

	public static int countStepsDp(int n) {
		int storage[]=new int[n+1];
		storage[1]=0;
		for(int i=2;i<=n;i++) {
			int min=storage[i-1];
			if(i%3==0) {
				if(min>storage[i/3]) {
					min=storage[i/3];
				}
			}
			if(i%2==0) {
				if(min>storage[i/2]) {
					min=storage[i/2];
				}
			}
			storage[i]=1+min;
		}
		return storage[n];
	}

	public static int countStepsM(int n) {
		int storage[]=new int[n+1];
		return countStepsM(n,storage);
	}

	private static int countStepsM(int n, int[] storage) {
		if(n==1) {
			storage[n]=0;
			return storage[n];
		}
		int op1=countStepsM(n-1, storage);
		int min=op1;

		if(n%2==0) {
			int op2=countStepsM(n/2,storage);
			if(min>op2) {
				min=op2;
			}
		}
		if(n%3==0) {
			int op3=countStepsM(n/3,storage);
			if(min>op3) {
				min=op3;
			}
		}
		storage[n]=1+min;
		return storage[n];
	}

	public static int countSteps(int n) {
		if(n==1) {
			return 0;
		}
		int count1;
		int count2=Integer.MAX_VALUE;
		int count3=Integer.MAX_VALUE;
		
		count1=countSteps(n-1);
		if(n%2==0) {
			count2=countSteps(n/2);
		}
		if(n%3==0) {
			count3=countSteps(n/3);
		}
		return 1+Math.min(count1, Math.min(count2, count3));
	}
	

}
