package Arrays;

import java.util.Scanner;

public class ArrangeNumbersInArrray {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0) {
			int n=scan.nextInt();
			int a[]=new int[n];
			int left=0;
			int right=n-1;
			int val=1;
			while(left<=right) {
		
				a[left]=val;
				val++;
				a[right]=val;
				val++;
				left++;
				right--;
                if(left==right){
                    val=val-1;
                }
				
			}
			
//			int b=(n-1)/2;
//			if(n%2!=0) {
//				int val=1;
//				for(int i =0;i<=b;i++) {
//					a[i]=val;
//					val+=2;
//				}
//			}else {
//				int val =n;
//				for(int i=b+1;i<n;i++) {
//					a[i]=val;
//					val-=2;
//				}
//			}
			
			for (int i : a) {
				System.out.print(i+" ");
			}
		}
		scan.close();
	}

}
//2nd Approach
//int left=0;
//int right=N-1;
//int val=1;
//while(left<right) {
//
//	a[left]=val;
//	val++;
//	a[right]=val;
//	val++;
//	left++;
//	right--;
//	
//}






//for(int i=0;i<a.length;i++) {
//	while(left<right) {
//		if(a[i]%2==0) {
//			a[right]=i;
//			right--;
//		}else {
//			a[left]=i;
//			left++;
//		}
//	}
//}
