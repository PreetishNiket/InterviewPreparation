package OOPs;

public class Solution {
	public static void main(String[] args) {
//        Base b = new Derived();
//        b.show();
        
        B obj = new B();
        obj.j=2;
        obj.display();   
    }
}
abstract class A {
    int i;
    abstract void display();
}   
class B extends A {
    int j;
    void display() {
        System.out.println(j);
    }
}   

//class Base {
//    public final void show() {
//        System.out.println("Base show");
//    }
//}
//class Derived extends Base {
//    public void show() { 
//        System.out.println("Derived show");
//    }
//}