package OOPs;

public class Main {
	public static void main(String[] args) {
//        Car c = new Car();
//        c.Print();
//        Audi a = new Audi();
        
//        Audi a = new Audi(5,7);
//        a.Audi();
		 Vehicle obj1 = new Car();
		    obj1.print();

		    Vehicle obj2 = new Vehicle();
		    obj2.print();  
    }
}

class Vehicle{
    void print(){
    System.out.print("Vehicle class");
    }
}
class Car extends Vehicle{
    void print(){
    System.out.print("Car class ");
    }
}

//class Car {
//    private int seats;
//    private int speed;
//
//    public Car(int seats, int speed) {
//    this.seats = seats;
//    this.speed = speed;
//    System.out.print("This Is Car ");
//    }
//}
//
//class Audi extends Car {
//    Audi(int x, int y) {
//    super(x,y); 
//    System.out.print("This Is Para Audi ");
//    }
//    void Audi() {
//    System.out.print("This Is Def Audi");
//    }
//} 



//class Car {
//    private int seats;
//    private int speed;
//
//    public Car() {
//    System.out.print("This Is Car ");
//    }
//}
//
//class Audi extends Car {
//    Audi() {
//    System.out.print("This Is Audi ");
//    super();
//    }
//} 

//class Vehicle {
//    int seats;
//    int speed;
//
//    public Vehicle(int seats, int speed) {
//    System.out.print("Vehicle ");
//    this.seats = seats;
//    this.speed = speed;
//    }
//}
//
//class Car extends Vehicle {
//    int id;
//    Car() {
//    System.out.print("Car ");
//    }
//}



//class Vehicle {
//    public void Print() {
//        System.out.print("Vehicle's Print() ");
//    }
//}
//
//class FourWheelers extends Vehicle {
//    public void Print() {
//        System.out.print("FourWheelers's Print() ");
//    }
//}
//
//class Car extends FourWheelers {
//    public void Print() {
//        super.Print();
//        System.out.print("Car's Print()");
//    }
//}