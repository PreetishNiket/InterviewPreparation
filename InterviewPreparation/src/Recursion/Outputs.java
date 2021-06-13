package Recursion;

public class Outputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num = 3;
		    print(num);
		    
		    
	}

	public static void print(int n) {
//		if (n < 0) {
//			return;
//		}
//		System.out.print(n + " ");
//		print(n - 2);
		
		if(n < 0){
	        return;
	    }
	    if(n == 0){
	        System.out.println(n);
	        return;
	    }
	    print(n--);
	    System.out.print(n+" ");
	}
}
