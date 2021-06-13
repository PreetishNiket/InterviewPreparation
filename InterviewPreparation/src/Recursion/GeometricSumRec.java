package Recursion;

import java.util.Scanner;

public class GeometricSumRec {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k=scan.nextInt();
		System.out.println(findGeometricSum(k));
	}
	public static double findGeometricSum(int k){
		if(k==0) {
			return 1;
		}
		double ans=findGeometricSum(k-1)+1/Math.pow(2, k);
		return ans;
	}

}
