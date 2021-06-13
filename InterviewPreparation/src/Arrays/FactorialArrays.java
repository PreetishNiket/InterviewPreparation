package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class FactorialArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list = factorial(n);
		for(int i:list) {
			System.out.print(list.get(i));
		}

	}

	public static ArrayList<Integer> factorial(int N) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		return list;
	}
}
