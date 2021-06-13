package OOPs;

interface Z{
    public void method();
}
class One{
    public void method(){
        System.out.println("Class One method");
    }
}
class Two extends One implements Z{
    public void method(){
        System.out.println("Class Two method");
    }
}
public class Interface extends Two {
	 public static void main(String[] args){
	        Z a = new Two();
	        a.method();     
	    }
}

