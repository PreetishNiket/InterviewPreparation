package OOPs;

public abstract class oops3 {
	
//	    public abstract double numberOfStudent();
	    public static void main(String args[]) {
	        display arr = new display();
	        arr.x = 0;     
	        arr.cal(2);
	        System.out.print(arr.x);
	    }
}
interface calculate {
    void cal(int item);
}
class display implements calculate {
    int x;
    public void cal(int item) {
        x = item * item;           
    }
}
