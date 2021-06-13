package OOPs;

public class Student {
	String name;
	int rollNo;

	Student(int num) {
		rollNo = num;
	}

	public void print() {
		System.out.print(name + " " + rollNo + " ");
	}
}
