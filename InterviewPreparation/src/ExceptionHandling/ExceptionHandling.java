package ExceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try{
//	        return;
//	    }
//	    finally{
//	        System.out.println("Hello coding ninjas");
//	    }
//		 try{
//		       int a = 5/0;
//		    }
//		    catch(Exception e){
//		        System.out.print("Exception caught ");
//		    }
////		    catch(ArithmeticException e){
//		        System.out.print("Arithmetic Exception caught ");
////		   }
//		   finally{
//		       System.out.print("finally block");
//		   }
		try {
			B();
		} catch (Exception e) {
			System.out.print("Time ");
		}
//	        finally{
//	           System.out.print("at CodingNinjas");
//	        }

	}

	public static void A() {
		System.out.print("Good ");
		throw new RuntimeException();
	}

	public static void B() {
		A();
		System.out.print("This ");
	}
}
