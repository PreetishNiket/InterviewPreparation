package OOPs;

import java.util.Scanner;

public class ComplexNumbersUse {
	public static void main(String[] args) {
		ComplexNumbers c1 = new ComplexNumbers(2, 3);
		c1.print();
		
		c1.setReal(10);
		c1.setImg(30);
		c1.print();
		
		ComplexNumbers c2 = new ComplexNumbers(1,5);
		c1.plus(c2);
		c1.print();
		c2.print();
		
		ComplexNumbers c3 = new ComplexNumbers(3,2);
		c3.multiply(c2);
		c3.print();
		c2.print();
		
		ComplexNumbers c4 = ComplexNumbers.add(c1, c3);
		c1.print();
		c3.print();
		c4.print();
		
		ComplexNumbers c5 = c1.conjugate();
		c5.print();
//		Scanner s = new Scanner(System.in);
//
//		int real1 = s.nextInt();
//		int imaginary1 = s.nextInt();
//
//		int real2 = s.nextInt();
//		int imaginary2 = s.nextInt();
//
//		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
//		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);
//
////		int choice = s.nextInt();
//
////		if (choice == 1) {
//			// Add
////			c1.plus(c2);
////			c1.print();
////		}
////		else if(choice == 2) {
////			// Multiply
////			c1.multiply(c2);
////			c1.print();
////		}
////		else {
////			return;
////		}
////		}
		
	}
}
