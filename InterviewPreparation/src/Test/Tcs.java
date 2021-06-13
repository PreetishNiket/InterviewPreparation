package Test;

//class A
//{
//    public int i;
//    public int j;
//    A()
//    {
//        i = 1;
//        j = 2;
//    }
//}
//
//class B extends A
//{
//    int a;
//    B()
//    {
//        super();
//    }
//}


class A { A() {System.out.print("A"); }}
class B extends A { B() { System.out.print("B");}}
class C extends B {C() { System.out.print("C"); }}
public class Tcs {

	public static void main(String[] args) {
		
//		B obj = new B();
//        System.out.println(obj.i + " " + obj.j);
		C cc=new  C();
		int arr[] = {1,2,3};
	    for(int i=0;i<=3;i++)
	        System.out.print(arr[i]+" ");
	}

}
